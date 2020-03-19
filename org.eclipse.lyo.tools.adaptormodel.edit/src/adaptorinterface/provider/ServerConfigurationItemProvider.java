/**
 */
package adaptorinterface.provider;


import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ServerConfiguration;

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
 * This is the item provider adapter for a {@link adaptorinterface.ServerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerConfigurationItemProvider 
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
	public ServerConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addRootServerBaseUrlPropertyDescriptor(object);
			addApplicationContextPathPropertyDescriptor(object);
			addServletUrlPatternPropertyDescriptor(object);
			addDoNotRegenerateJspFilesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Root Server Base Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootServerBaseUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerConfiguration_rootServerBaseUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerConfiguration_rootServerBaseUrl_feature", "_UI_ServerConfiguration_type"),
				 AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Context Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationContextPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerConfiguration_applicationContextPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerConfiguration_applicationContextPath_feature", "_UI_ServerConfiguration_type"),
				 AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Servlet Url Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServletUrlPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerConfiguration_servletUrlPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerConfiguration_servletUrlPattern_feature", "_UI_ServerConfiguration_type"),
				 AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__SERVLET_URL_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Do Not Regenerate Jsp Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoNotRegenerateJspFilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerConfiguration_doNotRegenerateJspFiles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerConfiguration_doNotRegenerateJspFiles_feature", "_UI_ServerConfiguration_type"),
				 AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__GENERAL_CONFIGURATION);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__PROJECT_CONFIGURATION);
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
	 * This returns ServerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServerConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServerConfiguration)object).getRootServerBaseUrl();
		return label == null || label.length() == 0 ?
			getString("_UI_ServerConfiguration_type") :
			getString("_UI_ServerConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ServerConfiguration.class)) {
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL:
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH:
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN:
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
			case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
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
				(AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__GENERAL_CONFIGURATION,
				 AdaptorinterfaceFactory.eINSTANCE.createGeneralConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__PROJECT_CONFIGURATION,
				 AdaptorinterfaceFactory.eINSTANCE.createProjectConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION__PROJECT_CONFIGURATION,
				 AdaptorinterfaceFactory.eINSTANCE.createMavenProjectConfiguration()));
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
