/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.DomainSpecification;
import adaptorinterface.GenerationSetting;
import adaptorinterface.NamespacePrefix;
import adaptorinterface.Specification;

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
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.SpecificationImpl#getDomainSpecifications <em>Domain Specifications</em>}</li>
 *   <li>{@link adaptorinterface.impl.SpecificationImpl#getDomainPrefixes <em>Domain Prefixes</em>}</li>
 *   <li>{@link adaptorinterface.impl.SpecificationImpl#getGenerationSetting <em>Generation Setting</em>}</li>
 *   <li>{@link adaptorinterface.impl.SpecificationImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
	/**
     * The cached value of the '{@link #getDomainSpecifications() <em>Domain Specifications</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDomainSpecifications()
     * @generated
     * @ordered
     */
	protected EList<DomainSpecification> domainSpecifications;

	/**
     * The cached value of the '{@link #getDomainPrefixes() <em>Domain Prefixes</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDomainPrefixes()
     * @generated
     * @ordered
     */
	protected EList<NamespacePrefix> domainPrefixes;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpecificationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SPECIFICATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<DomainSpecification> getDomainSpecifications() {
        if (domainSpecifications == null) {
            domainSpecifications = new EObjectContainmentEList<DomainSpecification>(DomainSpecification.class, this, AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS);
        }
        return domainSpecifications;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<NamespacePrefix> getDomainPrefixes() {
        if (domainPrefixes == null) {
            domainPrefixes = new EObjectContainmentEList<NamespacePrefix>(NamespacePrefix.class, this, AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES);
        }
        return domainPrefixes;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING, oldGenerationSetting, newGenerationSetting);
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
                msgs = ((InternalEObject)generationSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING, null, msgs);
            if (newGenerationSetting != null)
                msgs = ((InternalEObject)newGenerationSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING, null, msgs);
            msgs = basicSetGenerationSetting(newGenerationSetting, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING, newGenerationSetting, newGenerationSetting));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION, oldConfiguration, newConfiguration);
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
    public void setConfiguration(SpecificationConfiguration newConfiguration) {
        if (newConfiguration != configuration) {
            NotificationChain msgs = null;
            if (configuration != null)
                msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION, null, msgs);
            if (newConfiguration != null)
                msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION, null, msgs);
            msgs = basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION, newConfiguration, newConfiguration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
                return ((InternalEList<?>)getDomainSpecifications()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
                return ((InternalEList<?>)getDomainPrefixes()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING:
                return basicSetGenerationSetting(null, msgs);
            case AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION:
                return basicSetConfiguration(null, msgs);
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
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
                return getDomainSpecifications();
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
                return getDomainPrefixes();
            case AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING:
                return getGenerationSetting();
            case AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION:
                return getConfiguration();
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
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
                getDomainSpecifications().clear();
                getDomainSpecifications().addAll((Collection<? extends DomainSpecification>)newValue);
                return;
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
                getDomainPrefixes().clear();
                getDomainPrefixes().addAll((Collection<? extends NamespacePrefix>)newValue);
                return;
            case AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING:
                setGenerationSetting((GenerationSetting)newValue);
                return;
            case AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION:
                setConfiguration((SpecificationConfiguration)newValue);
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
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
                getDomainSpecifications().clear();
                return;
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
                getDomainPrefixes().clear();
                return;
            case AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING:
                setGenerationSetting((GenerationSetting)null);
                return;
            case AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION:
                setConfiguration((SpecificationConfiguration)null);
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
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
                return domainSpecifications != null && !domainSpecifications.isEmpty();
            case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
                return domainPrefixes != null && !domainPrefixes.isEmpty();
            case AdaptorinterfacePackage.SPECIFICATION__GENERATION_SETTING:
                return generationSetting != null;
            case AdaptorinterfacePackage.SPECIFICATION__CONFIGURATION:
                return configuration != null;
        }
        return super.eIsSet(featureID);
    }

} //SpecificationImpl
