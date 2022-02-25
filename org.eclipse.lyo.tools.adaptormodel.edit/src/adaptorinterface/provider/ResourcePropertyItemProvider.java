package adaptorinterface.provider;


import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ResourceProperty;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link adaptorinterface.ResourceProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePropertyItemProvider extends ShapePropertyItemProvider {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourcePropertyItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addIdPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addTitlePropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addPropertyDefinitionPropertyDescriptor(object);
            addOccursPropertyDescriptor(object);
            addReadOnlyPropertyDescriptor(object);
            addValueTypePropertyDescriptor(object);
            addRangePropertyDescriptor(object);
            addRepresentationPropertyDescriptor(object);
            addMultiValueRepresentationPropertyDescriptor(object);
            addAllowedValuePropertyDescriptor(object);
            addIsMemberPropertyPropertyDescriptor(object);
            addAdditionalConstraintsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_id_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__ID,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Title feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addTitlePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_title_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_title_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__TITLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_name_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Property Definition feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPropertyDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_propertyDefinition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_propertyDefinition_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__PROPERTY_DEFINITION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Occurs feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addOccursPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_occurs_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_occurs_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__OCCURS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Read Only feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addReadOnlyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_readOnly_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_readOnly_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__READ_ONLY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Value Type feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addValueTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_valueType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_valueType_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__VALUE_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Representation feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addRepresentationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_representation_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_representation_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__REPRESENTATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Multi Value Representation feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addMultiValueRepresentationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_multiValueRepresentation_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_multiValueRepresentation_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Range feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addRangePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_range_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_range_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__RANGE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_description_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__DESCRIPTION,
                 true,
                 true,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Allowed Value feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAllowedValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_allowedValue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_allowedValue_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__ALLOWED_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Is Member Property feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIsMemberPropertyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_isMemberProperty_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_isMemberProperty_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Additional Constraints feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdditionalConstraintsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResourceProperty_additionalConstraints_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProperty_additionalConstraints_feature", "_UI_ResourceProperty_type"),
                 AdaptorinterfacePackage.Literals.RESOURCE_PROPERTY__ADDITIONAL_CONSTRAINTS,
                 true,
                 true,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ResourceProperty.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceProperty"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((ResourceProperty)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ResourceProperty_type") :
            getString("_UI_ResourceProperty_type") + " " + label;
    }
	

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ResourceProperty.class)) {
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__ID:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__NAME:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__TITLE:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__DESCRIPTION:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__OCCURS:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__READ_ONLY:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__VALUE_TYPE:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__REPRESENTATION:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__ALLOWED_VALUE:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__IS_MEMBER_PROPERTY:
            case AdaptorinterfacePackage.RESOURCE_PROPERTY__ADDITIONAL_CONSTRAINTS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}