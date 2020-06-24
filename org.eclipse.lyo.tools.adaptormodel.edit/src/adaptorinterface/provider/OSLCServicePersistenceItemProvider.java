/**
 */
package adaptorinterface.provider;


import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.OSLCServicePersistence;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link adaptorinterface.OSLCServicePersistence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OSLCServicePersistenceItemProvider extends ServicePersistenceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OSLCServicePersistenceItemProvider(AdapterFactory adapterFactory) {
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

            addCreationFactoryPropertyDescriptor(object);
            addQueryCapabilityPropertyDescriptor(object);
            addSelectionDialogPropertyDescriptor(object);
            addCreationDialogPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Creation Factory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreationFactoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OSLCServicePersistence_creationFactory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OSLCServicePersistence_creationFactory_feature", "_UI_OSLCServicePersistence_type"),
                 AdaptorinterfacePackage.Literals.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Query Capability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQueryCapabilityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OSLCServicePersistence_queryCapability_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OSLCServicePersistence_queryCapability_feature", "_UI_OSLCServicePersistence_type"),
                 AdaptorinterfacePackage.Literals.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Selection Dialog feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectionDialogPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OSLCServicePersistence_selectionDialog_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OSLCServicePersistence_selectionDialog_feature", "_UI_OSLCServicePersistence_type"),
                 AdaptorinterfacePackage.Literals.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Creation Dialog feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreationDialogPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OSLCServicePersistence_creationDialog_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OSLCServicePersistence_creationDialog_feature", "_UI_OSLCServicePersistence_type"),
                 AdaptorinterfacePackage.Literals.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns OSLCServicePersistence.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OSLCServicePersistence"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        OSLCServicePersistence oslcServicePersistence = (OSLCServicePersistence)object;
        return getString("_UI_OSLCServicePersistence_type") + " " + oslcServicePersistence.isCreationFactory();
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

        switch (notification.getFeatureID(OSLCServicePersistence.class)) {
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY:
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY:
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG:
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG:
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
