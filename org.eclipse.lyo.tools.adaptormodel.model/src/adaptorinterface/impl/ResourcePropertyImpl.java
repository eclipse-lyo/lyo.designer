/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import adaptorinterface.ResourcePropertyIsMemberProperty;
import adaptorinterface.ResourcePropertyMultiValueRepresentation;
import adaptorinterface.ResourcePropertyOccurs;
import adaptorinterface.ResourcePropertyRepresentation;
import adaptorinterface.ResourcePropertyValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import vocabulary.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getPropertyDefinition <em>Property Definition</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getMultiValueRepresentation <em>Multi Value Representation</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getAllowedValue <em>Allowed Value</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourcePropertyImpl#getIsMemberProperty <em>Is Member Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePropertyImpl extends ShapePropertyImpl implements ResourceProperty {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The cached value of the '{@link #getPropertyDefinition() <em>Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDefinition()
	 * @generated
	 * @ordered
	 */
	protected Property propertyDefinition;

	/**
	 * The default value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePropertyOccurs OCCURS_EDEFAULT = ResourcePropertyOccurs.EXACTLY_ONE;

	/**
	 * The cached value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurs()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertyOccurs occurs = OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePropertyValueType VALUE_TYPE_EDEFAULT = ResourcePropertyValueType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertyValueType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePropertyRepresentation REPRESENTATION_EDEFAULT = ResourcePropertyRepresentation.NA;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertyRepresentation representation = REPRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiValueRepresentation() <em>Multi Value Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValueRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePropertyMultiValueRepresentation MULTI_VALUE_REPRESENTATION_EDEFAULT = ResourcePropertyMultiValueRepresentation.MULTIPLE_TRIPLES;

	/**
	 * The cached value of the '{@link #getMultiValueRepresentation() <em>Multi Value Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValueRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertyMultiValueRepresentation multiValueRepresentation = MULTI_VALUE_REPRESENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> range;

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
	 * The cached value of the '{@link #getAllowedValue() <em>Allowed Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowedValue;

	/**
	 * The default value of the '{@link #getIsMemberProperty() <em>Is Member Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMemberProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePropertyIsMemberProperty IS_MEMBER_PROPERTY_EDEFAULT = ResourcePropertyIsMemberProperty.NA;

	/**
	 * The cached value of the '{@link #getIsMemberProperty() <em>Is Member Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMemberProperty()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertyIsMemberProperty isMemberProperty = IS_MEMBER_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getPropertyDefinition() {
		if (propertyDefinition != null && propertyDefinition.eIsProxy()) {
			InternalEObject oldPropertyDefinition = (InternalEObject)propertyDefinition;
			propertyDefinition = (Property)eResolveProxy(oldPropertyDefinition);
			if (propertyDefinition != oldPropertyDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
			}
		}
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPropertyDefinition() {
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyDefinition(Property newPropertyDefinition) {
		Property oldPropertyDefinition = propertyDefinition;
		propertyDefinition = newPropertyDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropertyOccurs getOccurs() {
		return occurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurs(ResourcePropertyOccurs newOccurs) {
		ResourcePropertyOccurs oldOccurs = occurs;
		occurs = newOccurs == null ? OCCURS_EDEFAULT : newOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS, oldOccurs, occurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropertyValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(ResourcePropertyValueType newValueType) {
		ResourcePropertyValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropertyRepresentation getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentation(ResourcePropertyRepresentation newRepresentation) {
		ResourcePropertyRepresentation oldRepresentation = representation;
		representation = newRepresentation == null ? REPRESENTATION_EDEFAULT : newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyMultiValueRepresentation getMultiValueRepresentation() {
		return multiValueRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiValueRepresentation(ResourcePropertyMultiValueRepresentation newMultiValueRepresentation) {
		ResourcePropertyMultiValueRepresentation oldMultiValueRepresentation = multiValueRepresentation;
		multiValueRepresentation = newMultiValueRepresentation == null ? MULTI_VALUE_REPRESENTATION_EDEFAULT : newMultiValueRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION, oldMultiValueRepresentation, multiValueRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getRange() {
		if (range == null) {
			range = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.RESOURCE_PROPERTY__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAllowedValue() {
		if (allowedValue == null) {
			allowedValue = new EDataTypeUniqueEList<String>(String.class, this, AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE);
		}
		return allowedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropertyIsMemberProperty getIsMemberProperty() {
		return isMemberProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMemberProperty(ResourcePropertyIsMemberProperty newIsMemberProperty) {
		ResourcePropertyIsMemberProperty oldIsMemberProperty = isMemberProperty;
		isMemberProperty = newIsMemberProperty == null ? IS_MEMBER_PROPERTY_EDEFAULT : newIsMemberProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY, oldIsMemberProperty, isMemberProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE:
				return getTitle();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME:
				return getName();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION:
				if (resolve) return getPropertyDefinition();
				return basicGetPropertyDefinition();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS:
				return getOccurs();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY:
				return isReadOnly();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE:
				return getValueType();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION:
				return getRepresentation();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION:
				return getMultiValueRepresentation();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__RANGE:
				return getRange();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION:
				return getDescription();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE:
				return getAllowedValue();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY:
				return getIsMemberProperty();
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
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE:
				setTitle((String)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION:
				setPropertyDefinition((Property)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS:
				setOccurs((ResourcePropertyOccurs)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE:
				setValueType((ResourcePropertyValueType)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION:
				setRepresentation((ResourcePropertyRepresentation)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION:
				setMultiValueRepresentation((ResourcePropertyMultiValueRepresentation)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Resource>)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE:
				getAllowedValue().clear();
				getAllowedValue().addAll((Collection<? extends String>)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY:
				setIsMemberProperty((ResourcePropertyIsMemberProperty)newValue);
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
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION:
				setPropertyDefinition((Property)null);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS:
				setOccurs(OCCURS_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION:
				setMultiValueRepresentation(MULTI_VALUE_REPRESENTATION_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__RANGE:
				getRange().clear();
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE:
				getAllowedValue().clear();
				return;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY:
				setIsMemberProperty(IS_MEMBER_PROPERTY_EDEFAULT);
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
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__PROPERTY_DEFINITION:
				return propertyDefinition != null;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS:
				return occurs != OCCURS_EDEFAULT;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION:
				return multiValueRepresentation != MULTI_VALUE_REPRESENTATION_EDEFAULT;
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__RANGE:
				return range != null && !range.isEmpty();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE:
				return allowedValue != null && !allowedValue.isEmpty();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY:
				return isMemberProperty != IS_MEMBER_PROPERTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", name: ");
		result.append(name);
		result.append(", occurs: ");
		result.append(occurs);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", representation: ");
		result.append(representation);
		result.append(", multiValueRepresentation: ");
		result.append(multiValueRepresentation);
		result.append(", description: ");
		result.append(description);
		result.append(", allowedValue: ");
		result.append(allowedValue);
		result.append(", isMemberProperty: ");
		result.append(isMemberProperty);
		result.append(')');
		return result.toString();
	}

} //ResourcePropertyImpl
