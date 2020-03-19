/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.DomainSpecification;
import adaptorinterface.GenerationSetting;
import adaptorinterface.NamespacePrefix;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;

import adaptorinterface.ShaclProperty;
import adaptorinterface.ShaclShape;
import adaptorinterface.SpecificationConfiguration;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getResourceProperties <em>Resource Properties</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getGenerationSetting <em>Generation Setting</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getShaclShapes <em>Shacl Shapes</em>}</li>
 *   <li>{@link adaptorinterface.impl.DomainSpecificationImpl#getShaclProperties <em>Shacl Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSpecificationImpl extends MinimalEObjectImpl.Container implements DomainSpecification {
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
	 * The default value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceURI()
	 * @generated
	 * @ordered
	 */
	protected String namespaceURI = NAMESPACE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected NamespacePrefix namespacePrefix;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceProperty> resourceProperties;

	/**
	 * The cached value of the '{@link #getGenerationSetting() <em>Generation Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationSetting()
	 * @generated
	 * @ordered
	 */
	protected GenerationSetting generationSetting;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SpecificationConfiguration configuration;

	/**
	 * The cached value of the '{@link #getShaclShapes() <em>Shacl Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaclShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<ShaclShape> shaclShapes;

	/**
	 * The cached value of the '{@link #getShaclProperties() <em>Shacl Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaclProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ShaclProperty> shaclProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.DOMAIN_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespaceURI() {
		return namespaceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespaceURI(String newNamespaceURI) {
		String oldNamespaceURI = namespaceURI;
		namespaceURI = newNamespaceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_URI, oldNamespaceURI, namespaceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespacePrefix getNamespacePrefix() {
		if (namespacePrefix != null && namespacePrefix.eIsProxy()) {
			InternalEObject oldNamespacePrefix = (InternalEObject)namespacePrefix;
			namespacePrefix = (NamespacePrefix)eResolveProxy(oldNamespacePrefix);
			if (namespacePrefix != oldNamespacePrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
			}
		}
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacePrefix basicGetNamespacePrefix() {
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespacePrefix(NamespacePrefix newNamespacePrefix) {
		NamespacePrefix oldNamespacePrefix = namespacePrefix;
		namespacePrefix = newNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceProperty> getResourceProperties() {
		if (resourceProperties == null) {
			resourceProperties = new EObjectContainmentEList<ResourceProperty>(ResourceProperty.class, this, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES);
		}
		return resourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationSetting getGenerationSetting() {
		return generationSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationSetting(GenerationSetting newGenerationSetting, NotificationChain msgs) {
		GenerationSetting oldGenerationSetting = generationSetting;
		generationSetting = newGenerationSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING, oldGenerationSetting, newGenerationSetting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationSetting(GenerationSetting newGenerationSetting) {
		if (newGenerationSetting != generationSetting) {
			NotificationChain msgs = null;
			if (generationSetting != null)
				msgs = ((InternalEObject)generationSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING, null, msgs);
			if (newGenerationSetting != null)
				msgs = ((InternalEObject)newGenerationSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING, null, msgs);
			msgs = basicSetGenerationSetting(newGenerationSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING, newGenerationSetting, newGenerationSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(SpecificationConfiguration newConfiguration, NotificationChain msgs) {
		SpecificationConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(SpecificationConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShaclShape> getShaclShapes() {
		if (shaclShapes == null) {
			shaclShapes = new EObjectContainmentEList<ShaclShape>(ShaclShape.class, this, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES);
		}
		return shaclShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShaclProperty> getShaclProperties() {
		if (shaclProperties == null) {
			shaclProperties = new EObjectContainmentEList<ShaclProperty>(ShaclProperty.class, this, AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES);
		}
		return shaclProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES:
				return ((InternalEList<?>)getResourceProperties()).basicRemove(otherEnd, msgs);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING:
				return basicSetGenerationSetting(null, msgs);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES:
				return ((InternalEList<?>)getShaclShapes()).basicRemove(otherEnd, msgs);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES:
				return ((InternalEList<?>)getShaclProperties()).basicRemove(otherEnd, msgs);
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
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAME:
				return getName();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_URI:
				return getNamespaceURI();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX:
				if (resolve) return getNamespacePrefix();
				return basicGetNamespacePrefix();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES:
				return getResources();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES:
				return getResourceProperties();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING:
				return getGenerationSetting();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION:
				return getConfiguration();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES:
				return getShaclShapes();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES:
				return getShaclProperties();
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
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_URI:
				setNamespaceURI((String)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX:
				setNamespacePrefix((NamespacePrefix)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES:
				getResourceProperties().clear();
				getResourceProperties().addAll((Collection<? extends ResourceProperty>)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING:
				setGenerationSetting((GenerationSetting)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION:
				setConfiguration((SpecificationConfiguration)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES:
				getShaclShapes().clear();
				getShaclShapes().addAll((Collection<? extends ShaclShape>)newValue);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES:
				getShaclProperties().clear();
				getShaclProperties().addAll((Collection<? extends ShaclProperty>)newValue);
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
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_URI:
				setNamespaceURI(NAMESPACE_URI_EDEFAULT);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX:
				setNamespacePrefix((NamespacePrefix)null);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES:
				getResources().clear();
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES:
				getResourceProperties().clear();
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING:
				setGenerationSetting((GenerationSetting)null);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION:
				setConfiguration((SpecificationConfiguration)null);
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES:
				getShaclShapes().clear();
				return;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES:
				getShaclProperties().clear();
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
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceURI != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceURI);
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX:
				return namespacePrefix != null;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES:
				return resourceProperties != null && !resourceProperties.isEmpty();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__GENERATION_SETTING:
				return generationSetting != null;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__CONFIGURATION:
				return configuration != null;
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_SHAPES:
				return shaclShapes != null && !shaclShapes.isEmpty();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION__SHACL_PROPERTIES:
				return shaclProperties != null && !shaclProperties.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", namespaceURI: ");
		result.append(namespaceURI);
		result.append(')');
		return result.toString();
	}

} //DomainSpecificationImpl
