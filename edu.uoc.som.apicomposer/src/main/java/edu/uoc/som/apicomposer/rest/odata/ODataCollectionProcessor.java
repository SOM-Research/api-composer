package edu.uoc.som.apicomposer.rest.odata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.apache.olingo.commons.api.data.ContextURL;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.EntityCollection;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.edm.EdmNavigationProperty;
import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.commons.api.http.HttpHeader;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.processor.EntityCollectionProcessor;
import org.apache.olingo.server.api.serializer.EntityCollectionSerializerOptions;
import org.apache.olingo.server.api.serializer.EntityCollectionSerializerOptions.Builder;
import org.apache.olingo.server.api.serializer.ODataSerializer;
import org.apache.olingo.server.api.serializer.SerializerException;
import org.apache.olingo.server.api.serializer.SerializerResult;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
import com.mashape.unirest.http.exceptions.UnirestException;

import edu.uoc.som.apicomposer.rest.model.APIRequest;
import edu.uoc.som.apicomposer.rest.uml.ModelLoader;
import edu.uoc.som.apicomposer.rest.util.ModelUtil;
import edu.uoc.som.apicomposer.rest.util.Util;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;

@SessionScoped
public class ODataCollectionProcessor implements EntityCollectionProcessor, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Logger logger = LogManager.getLogger();
	private OData odata;
	private ServiceMetadata serviceMetadata;
	
	@Inject
	private ModelLoader modelLoader;
	
	@Inject
	private ODataMapper oDataMapper;
	
	@Inject
	private ModelUtil modelUtil;
	
	
	@Inject
	private Util util;

	public void init(OData odata, ServiceMetadata serviceMetadata) {
		
		this.odata = odata;
		this.serviceMetadata = serviceMetadata;
		
	}

	public void readEntityCollection(ODataRequest request, ODataResponse response, UriInfo uriInfo,
			ContentType responseFormat) throws SerializerException {
try {
		addLog(request.getRawRequestUri());
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		UriResourceEntitySet uriResourceEntitySet = null;
		EdmEntityType edmEntityType = null;
		EdmEntitySet edmEntitySet = null;
		if (resourcePaths.get(resourcePaths.size() - 1) instanceof UriResourceEntitySet) {
			uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(resourcePaths.size() - 1);
			edmEntitySet = uriResourceEntitySet.getEntitySet();
			edmEntityType = edmEntitySet.getEntityType();

		}
		if (resourcePaths.get(resourcePaths.size() - 1) instanceof UriResourceNavigation) {
			edmEntityType = ((UriResourceNavigation) resourcePaths.get(resourcePaths.size() - 1)).getProperty()
					.getType();
			edmEntitySet = util.getEnitySetFromEntityType(edmEntityType, serviceMetadata);
		}

		EntityCollection entityCollection = null;
		try {
			entityCollection = getData(request, uriInfo);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExpressionVisitException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(uriInfo.getCountOption() != null){
			 boolean isCount = uriInfo.getCountOption() .getValue();
			    if(isCount){
			    	entityCollection.setCount(entityCollection.getEntities().size());
			    }
		}
		ODataSerializer serializer = odata.createSerializer(responseFormat);

		ContextURL contextUrl = ContextURL.with().entitySet(edmEntitySet).build();

		final String id = request.getRawBaseUri() + "/" + edmEntitySet.getName();
		Builder builder = EntityCollectionSerializerOptions.with().id(id).contextURL(contextUrl);
		if(uriInfo.getCountOption() != null)
			builder.count(uriInfo.getCountOption());
		EntityCollectionSerializerOptions opts = builder.build();
		SerializerResult serializedContent = serializer.entityCollection(serviceMetadata, edmEntityType, entityCollection,
				opts);

		response.setContent(serializedContent.getContent());
		response.setStatusCode(HttpStatusCode.OK.getStatusCode());
		response.setHeader(HttpHeader.CONTENT_TYPE, responseFormat.toContentTypeString());
		addLog(request.getRawRequestUri()+" yes");
}
catch(ODataApplicationException e) {
	addLog(request.getRawRequestUri()+" no\n");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	private EntityCollection getData(ODataRequest request, UriInfo uriInfo) throws IOException, ODataApplicationException, ExpressionVisitException, UnirestException  {
		
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();

		EntityCollection entityCollection = new EntityCollection();
		if (resourcePaths.size() == 1) {
			UriResource uriResource = resourcePaths.get(0);
			if(uriResource instanceof UriResourceEntitySet) {
				entityCollection = util.getEntityCollection((UriResourceEntitySet)uriResource);
			}
		}
		else {
			Entity entity = null;
			String value = null;
			Class clazz = null;
			for(int i = 0; i< resourcePaths.size(); i++) {
				if(resourcePaths.get(i) instanceof UriResourceEntitySet) {
					clazz = oDataMapper.getEntityTypeMap().get(((UriResourceEntitySet) resourcePaths.get(i)) .getEntityType().getFullQualifiedName());
					entity = util.getEntity((UriResourceEntitySet) resourcePaths.get(0));
					
				}else
				if ((resourcePaths.get(i) instanceof UriResourceNavigation ) && ( i == resourcePaths.size()-1)) {
					
					UriResourceNavigation uriResourceNavigation = (UriResourceNavigation) resourcePaths.get(i);
					EdmNavigationProperty edmNavigationProperty = uriResourceNavigation.getProperty();
					EdmEntityType targetEntityType = edmNavigationProperty.getType();
					Association association = ModelUtil.getAssociationByNavigationProperty(edmNavigationProperty, clazz);
					Association innerAssociation = ModelUtil.getInterAssociation(association, modelLoader.getInterModels());
					APIRequest apiRequest = modelUtil.createRequestsFromAnnotation(innerAssociation, modelLoader.getOpenAPIModels().get(ModelUtil.getAPIName(innerAssociation)).getApi(), edmNavigationProperty, entity);
					
					apiRequest.send();
					List<APIRequest> apiRequests = new ArrayList<APIRequest>();
					apiRequests.add(apiRequest);
					entityCollection = util.getEntityCollection(targetEntityType, apiRequests);
				}
				else {
					entity = util.getEntity((UriResourceNavigation) resourcePaths.get(i));
					clazz = oDataMapper.getEntityTypeMap().get(((UriResourceNavigation) resourcePaths.get(i)) .getProperty().getType().getFullQualifiedName());
				}
			}
		}
		if(uriInfo.getSkipOption()!= null && uriInfo.getTopOption() != null){
			
		}
		if(uriInfo.getOrderByOption() != null){
		
		
		}
		if(uriInfo.getFilterOption() != null){
		
			 
		}
		return entityCollection;
		
	}

	
	
	private void addLog(String message) {
		ThreadContext.put("TRACECALL", "default");
	    logger.info(message);
	    ThreadContext.remove("TRACECALL");
	}
	
}

