/**
 */
package adaptorinterface.provider;


import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.AdaptorinterfacePackage;

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
 * This is the item provider adapter for a {@link adaptorinterface.AdaptorInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfaceItemProvider 
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
	public AdaptorInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addJavaClassBaseNamespacePropertyDescriptor(object);
			addJavaFilesBasePathPropertyDescriptor(object);
			addJspFilesBasePathPropertyDescriptor(object);
			addJavascriptFilesBasePathPropertyDescriptor(object);
			addSwaggerDocumentationPropertyDescriptor(object);
			addBackendCodeTemplate_classImportsPropertyDescriptor(object);
			addBackendCodeTemplate_classMethodsPropertyDescriptor(object);
			addBackendCodeTemplate_servletListenerInitializePropertyDescriptor(object);
			addBackendCodeTemplate_servletListenerDestroyPropertyDescriptor(object);
			addBackendCodeTemplate_getServiceProvidersPropertyDescriptor(object);
			addBackendCodeTemplate_getResourcePropertyDescriptor(object);
			addBackendCodeTemplate_getResourcesPropertyDescriptor(object);
			addBackendCodeTemplate_searchResourcesPropertyDescriptor(object);
			addBackendCodeTemplate_createResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_AdaptorInterface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_name_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Java Class Base Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaClassBaseNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_javaClassBaseNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_javaClassBaseNamespace_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Java Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_javaFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_javaFilesBasePath_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jsp Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJspFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_jspFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_jspFilesBasePath_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Javascript Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavascriptFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_javascriptFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_javascriptFilesBasePath_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swagger Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwaggerDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_swaggerDocumentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_swaggerDocumentation_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__SWAGGER_DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template class Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_classImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_classImports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_classImports_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template class Methods feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_classMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_classMethods_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_classMethods_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template servlet Listener Initialize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_servletListenerInitializePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_servletListenerInitialize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_servletListenerInitialize_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template servlet Listener Destroy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_servletListenerDestroyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_servletListenerDestroy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_servletListenerDestroy_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template get Service Providers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_getServiceProvidersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_getServiceProviders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_getServiceProviders_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template get Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_getResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_getResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_getResource_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template get Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_getResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_getResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_getResources_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template search Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_searchResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_searchResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_searchResources_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backend Code Template create Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackendCodeTemplate_createResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorInterface_backendCodeTemplate_createResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorInterface_backendCodeTemplate_createResource_feature", "_UI_AdaptorInterface_type"),
				 AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE,
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
			childrenFeatures.add(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__SPECIFICATION);
			childrenFeatures.add(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS);
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
	 * This returns AdaptorInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdaptorInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AdaptorInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AdaptorInterface_type") :
			getString("_UI_AdaptorInterface_type") + " " + label;
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

		switch (notification.getFeatureID(AdaptorInterface.class)) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SWAGGER_DOCUMENTATION:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
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
				(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG,
				 AdaptorinterfaceFactory.eINSTANCE.createServiceProviderCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__SPECIFICATION,
				 AdaptorinterfaceFactory.eINSTANCE.createSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS,
				 AdaptorinterfaceFactory.eINSTANCE.createGenericRequiredAdaptor()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS,
				 AdaptorinterfaceFactory.eINSTANCE.createModelledRequiredAdaptor()));
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
