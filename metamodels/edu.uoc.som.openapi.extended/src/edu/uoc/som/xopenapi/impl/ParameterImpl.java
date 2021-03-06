/**
 */
package edu.uoc.som.xopenapi.impl;

import edu.uoc.som.xopenapi.ArrayContext;
import edu.uoc.som.xopenapi.CollectionFormat;
import edu.uoc.som.xopenapi.ItemsDefinition;
import edu.uoc.som.xopenapi.JSONDataType;
import edu.uoc.som.xopenapi.JSONPointer;
import edu.uoc.som.xopenapi.JSONSchemaSubset;
import edu.uoc.som.xopenapi.Parameter;
import edu.uoc.som.xopenapi.ParameterLocation;
import edu.uoc.som.xopenapi.ParamterDeclaringContext;
import edu.uoc.som.xopenapi.Schema;
import edu.uoc.som.xopenapi.SchemaContext;
import edu.uoc.som.xopenapi.XOpenAPIPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getItems <em>Items</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.impl.ParameterImpl#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends SchemaDeclaringContextImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JSONDataType TYPE_EDEFAULT = JSONDataType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JSONDataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected Double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Integer minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected Integer maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected Integer minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_ITEMS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected Boolean uniqueItems = UNIQUE_ITEMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enum_;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final double MULTIPLE_OF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected double multipleOf = MULTIPLE_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionFormat COLLECTION_FORMAT_EDEFAULT = CollectionFormat.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected CollectionFormat collectionFormat = COLLECTION_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected ItemsDefinition items;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation LOCATION_EDEFAULT = ParameterLocation.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_EMPLY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowEmplyValue = ALLOW_EMPLY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaringContext() <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringContext()
	 * @generated
	 * @ordered
	 */
	protected ParamterDeclaringContext declaringContext;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XOpenAPIPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (Schema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XOpenAPIPackage.PARAMETER__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JSONDataType newType) {
		JSONDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(Double newMaximum) {
		Double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMaximum(Boolean newExclusiveMaximum) {
		Boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(Double newMinimum) {
		Double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(Boolean newExclusiveMinimum) {
		Boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(Integer newMaxItems) {
		Integer oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(Integer newMinItems) {
		Integer oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueItems(Boolean newUniqueItems) {
		Boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, XOpenAPIPackage.PARAMETER__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMultipleOf() {
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleOf(double newMultipleOf) {
		double oldMultipleOf = multipleOf;
		multipleOf = newMultipleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__MULTIPLE_OF, oldMultipleOf, multipleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		// TODO: implement this method to return the 'Ref' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsDefinition getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(ItemsDefinition newItems, NotificationChain msgs) {
		ItemsDefinition oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(ItemsDefinition newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XOpenAPIPackage.PARAMETER__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XOpenAPIPackage.PARAMETER__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ParameterLocation newLocation) {
		ParameterLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowEmplyValue() {
		return allowEmplyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmplyValue(Boolean newAllowEmplyValue) {
		Boolean oldAllowEmplyValue = allowEmplyValue;
		allowEmplyValue = newAllowEmplyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__ALLOW_EMPLY_VALUE, oldAllowEmplyValue, allowEmplyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamterDeclaringContext getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (ParamterDeclaringContext)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamterDeclaringContext basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringContext(ParamterDeclaringContext newDeclaringContext) {
		ParamterDeclaringContext oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XOpenAPIPackage.PARAMETER__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XOpenAPIPackage.PARAMETER__ITEMS:
				return basicSetItems(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XOpenAPIPackage.PARAMETER__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case XOpenAPIPackage.PARAMETER__TYPE:
				return getType();
			case XOpenAPIPackage.PARAMETER__FORMAT:
				return getFormat();
			case XOpenAPIPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case XOpenAPIPackage.PARAMETER__MAXIMUM:
				return getMaximum();
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case XOpenAPIPackage.PARAMETER__MINIMUM:
				return getMinimum();
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case XOpenAPIPackage.PARAMETER__MAX_LENGTH:
				return getMaxLength();
			case XOpenAPIPackage.PARAMETER__MIN_LENGTH:
				return getMinLength();
			case XOpenAPIPackage.PARAMETER__PATTERN:
				return getPattern();
			case XOpenAPIPackage.PARAMETER__MAX_ITEMS:
				return getMaxItems();
			case XOpenAPIPackage.PARAMETER__MIN_ITEMS:
				return getMinItems();
			case XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS:
				return getUniqueItems();
			case XOpenAPIPackage.PARAMETER__ENUM:
				return getEnum();
			case XOpenAPIPackage.PARAMETER__DEFAULT:
				return getDefault();
			case XOpenAPIPackage.PARAMETER__MULTIPLE_OF:
				return getMultipleOf();
			case XOpenAPIPackage.PARAMETER__REF:
				return getRef();
			case XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case XOpenAPIPackage.PARAMETER__ITEMS:
				return getItems();
			case XOpenAPIPackage.PARAMETER__NAME:
				return getName();
			case XOpenAPIPackage.PARAMETER__LOCATION:
				return getLocation();
			case XOpenAPIPackage.PARAMETER__REQUIRED:
				return getRequired();
			case XOpenAPIPackage.PARAMETER__ALLOW_EMPLY_VALUE:
				return getAllowEmplyValue();
			case XOpenAPIPackage.PARAMETER__REFERENCE_NAME:
				return getReferenceName();
			case XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
			case XOpenAPIPackage.PARAMETER__EXAMPLE:
				return getExample();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XOpenAPIPackage.PARAMETER__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__TYPE:
				setType((JSONDataType)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__FORMAT:
				setFormat((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__PATTERN:
				setPattern((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__MULTIPLE_OF:
				setMultipleOf((Double)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__ITEMS:
				setItems((ItemsDefinition)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__LOCATION:
				setLocation((ParameterLocation)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue((Boolean)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT:
				setDeclaringContext((ParamterDeclaringContext)newValue);
				return;
			case XOpenAPIPackage.PARAMETER__EXAMPLE:
				setExample((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XOpenAPIPackage.PARAMETER__SCHEMA:
				setSchema((Schema)null);
				return;
			case XOpenAPIPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__ENUM:
				getEnum().clear();
				return;
			case XOpenAPIPackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__ITEMS:
				setItems((ItemsDefinition)null);
				return;
			case XOpenAPIPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue(ALLOW_EMPLY_VALUE_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT:
				setDeclaringContext((ParamterDeclaringContext)null);
				return;
			case XOpenAPIPackage.PARAMETER__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XOpenAPIPackage.PARAMETER__SCHEMA:
				return schema != null;
			case XOpenAPIPackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case XOpenAPIPackage.PARAMETER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case XOpenAPIPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XOpenAPIPackage.PARAMETER__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case XOpenAPIPackage.PARAMETER__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case XOpenAPIPackage.PARAMETER__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case XOpenAPIPackage.PARAMETER__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case XOpenAPIPackage.PARAMETER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case XOpenAPIPackage.PARAMETER__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
			case XOpenAPIPackage.PARAMETER__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? minItems != null : !MIN_ITEMS_EDEFAULT.equals(minItems);
			case XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? uniqueItems != null : !UNIQUE_ITEMS_EDEFAULT.equals(uniqueItems);
			case XOpenAPIPackage.PARAMETER__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case XOpenAPIPackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case XOpenAPIPackage.PARAMETER__MULTIPLE_OF:
				return multipleOf != MULTIPLE_OF_EDEFAULT;
			case XOpenAPIPackage.PARAMETER__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case XOpenAPIPackage.PARAMETER__ITEMS:
				return items != null;
			case XOpenAPIPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XOpenAPIPackage.PARAMETER__LOCATION:
				return location != LOCATION_EDEFAULT;
			case XOpenAPIPackage.PARAMETER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case XOpenAPIPackage.PARAMETER__ALLOW_EMPLY_VALUE:
				return ALLOW_EMPLY_VALUE_EDEFAULT == null ? allowEmplyValue != null : !ALLOW_EMPLY_VALUE_EDEFAULT.equals(allowEmplyValue);
			case XOpenAPIPackage.PARAMETER__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case XOpenAPIPackage.PARAMETER__DECLARING_CONTEXT:
				return declaringContext != null;
			case XOpenAPIPackage.PARAMETER__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaContext.class) {
			switch (derivedFeatureID) {
				case XOpenAPIPackage.PARAMETER__SCHEMA: return XOpenAPIPackage.SCHEMA_CONTEXT__SCHEMA;
				default: return -1;
			}
		}
		if (baseClass == JSONSchemaSubset.class) {
			switch (derivedFeatureID) {
				case XOpenAPIPackage.PARAMETER__TYPE: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__TYPE;
				case XOpenAPIPackage.PARAMETER__FORMAT: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__FORMAT;
				case XOpenAPIPackage.PARAMETER__DESCRIPTION: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__DESCRIPTION;
				case XOpenAPIPackage.PARAMETER__MAXIMUM: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAXIMUM;
				case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;
				case XOpenAPIPackage.PARAMETER__MINIMUM: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MINIMUM;
				case XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;
				case XOpenAPIPackage.PARAMETER__MAX_LENGTH: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAX_LENGTH;
				case XOpenAPIPackage.PARAMETER__MIN_LENGTH: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MIN_LENGTH;
				case XOpenAPIPackage.PARAMETER__PATTERN: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__PATTERN;
				case XOpenAPIPackage.PARAMETER__MAX_ITEMS: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAX_ITEMS;
				case XOpenAPIPackage.PARAMETER__MIN_ITEMS: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MIN_ITEMS;
				case XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;
				case XOpenAPIPackage.PARAMETER__ENUM: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__ENUM;
				case XOpenAPIPackage.PARAMETER__DEFAULT: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__DEFAULT;
				case XOpenAPIPackage.PARAMETER__MULTIPLE_OF: return XOpenAPIPackage.JSON_SCHEMA_SUBSET__MULTIPLE_OF;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case XOpenAPIPackage.PARAMETER__REF: return XOpenAPIPackage.JSON_POINTER__REF;
				default: return -1;
			}
		}
		if (baseClass == ArrayContext.class) {
			switch (derivedFeatureID) {
				case XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT: return XOpenAPIPackage.ARRAY_CONTEXT__COLLECTION_FORMAT;
				case XOpenAPIPackage.PARAMETER__ITEMS: return XOpenAPIPackage.ARRAY_CONTEXT__ITEMS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaContext.class) {
			switch (baseFeatureID) {
				case XOpenAPIPackage.SCHEMA_CONTEXT__SCHEMA: return XOpenAPIPackage.PARAMETER__SCHEMA;
				default: return -1;
			}
		}
		if (baseClass == JSONSchemaSubset.class) {
			switch (baseFeatureID) {
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__TYPE: return XOpenAPIPackage.PARAMETER__TYPE;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__FORMAT: return XOpenAPIPackage.PARAMETER__FORMAT;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__DESCRIPTION: return XOpenAPIPackage.PARAMETER__DESCRIPTION;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAXIMUM: return XOpenAPIPackage.PARAMETER__MAXIMUM;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM: return XOpenAPIPackage.PARAMETER__EXCLUSIVE_MAXIMUM;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MINIMUM: return XOpenAPIPackage.PARAMETER__MINIMUM;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM: return XOpenAPIPackage.PARAMETER__EXCLUSIVE_MINIMUM;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAX_LENGTH: return XOpenAPIPackage.PARAMETER__MAX_LENGTH;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MIN_LENGTH: return XOpenAPIPackage.PARAMETER__MIN_LENGTH;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__PATTERN: return XOpenAPIPackage.PARAMETER__PATTERN;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MAX_ITEMS: return XOpenAPIPackage.PARAMETER__MAX_ITEMS;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MIN_ITEMS: return XOpenAPIPackage.PARAMETER__MIN_ITEMS;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS: return XOpenAPIPackage.PARAMETER__UNIQUE_ITEMS;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__ENUM: return XOpenAPIPackage.PARAMETER__ENUM;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__DEFAULT: return XOpenAPIPackage.PARAMETER__DEFAULT;
				case XOpenAPIPackage.JSON_SCHEMA_SUBSET__MULTIPLE_OF: return XOpenAPIPackage.PARAMETER__MULTIPLE_OF;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case XOpenAPIPackage.JSON_POINTER__REF: return XOpenAPIPackage.PARAMETER__REF;
				default: return -1;
			}
		}
		if (baseClass == ArrayContext.class) {
			switch (baseFeatureID) {
				case XOpenAPIPackage.ARRAY_CONTEXT__COLLECTION_FORMAT: return XOpenAPIPackage.PARAMETER__COLLECTION_FORMAT;
				case XOpenAPIPackage.ARRAY_CONTEXT__ITEMS: return XOpenAPIPackage.PARAMETER__ITEMS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(", description: ");
		result.append(description);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", default: ");
		result.append(default_);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", required: ");
		result.append(required);
		result.append(", allowEmplyValue: ");
		result.append(allowEmplyValue);
		result.append(", referenceName: ");
		result.append(referenceName);
		result.append(", example: ");
		result.append(example);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
