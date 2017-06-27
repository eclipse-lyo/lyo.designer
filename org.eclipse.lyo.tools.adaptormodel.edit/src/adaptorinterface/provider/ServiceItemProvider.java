/**
 */
package adaptorinterface.provider;


import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ResourceServiceNamespace;
import adaptorinterface.Service;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link adaptorinterface.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProvider(AdapterFactory adapterFactory) {
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

			addDomainSpecificationPropertyDescriptor(object);
			addServiceNamespacePropertyDescriptor(object);
			addUsagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_domainSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_domainSpecification_feature", "_UI_Service_type"),
				 AdaptorinterfacePackage.Literals.SERVICE__DOMAIN_SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_serviceNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_serviceNamespace_feature", "_UI_Service_type"),
				 AdaptorinterfacePackage.Literals.SERVICE__SERVICE_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_usages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_usages_feature", "_UI_Service_type"),
				 AdaptorinterfacePackage.Literals.SERVICE__USAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVICE__CREATION_FACTORIES);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVICE__QUERY_CAPABILITIES);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVICE__SELECTION_DIALOGS);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVICE__CREATION_DIALOGS);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVICE__BASIC_CAPABILITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Service.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Service"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResourceServiceNamespace labelValue = ((Service)object).getServiceNamespace();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Service_type") :
			getString("_UI_Service_type") + " " + label;
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

		switch (notification.getFeatureID(Service.class)) {
			case AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE:
			case AdaptorinterfacePackage.SERVICE__USAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
			case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
			case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
			case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
			case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVICE__CREATION_FACTORIES,
				 AdaptorinterfaceFactory.eINSTANCE.createCreationFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVICE__QUERY_CAPABILITIES,
				 AdaptorinterfaceFactory.eINSTANCE.createQueryCapability()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVICE__SELECTION_DIALOGS,
				 AdaptorinterfaceFactory.eINSTANCE.createDialog()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVICE__CREATION_DIALOGS,
				 AdaptorinterfaceFactory.eINSTANCE.createDialog()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVICE__BASIC_CAPABILITIES,
				 AdaptorinterfaceFactory.eINSTANCE.createBasicCapability()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AdaptorinterfacePackage.Literals.SERVICE__SELECTION_DIALOGS ||
			childFeature == AdaptorinterfacePackage.Literals.SERVICE__CREATION_DIALOGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AdaptorInterfaceEditPlugin.INSTANCE;
	}

}
