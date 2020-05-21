/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.BasicCapability;
import adaptorinterface.CreationFactory;
import adaptorinterface.Dialog;
import adaptorinterface.DomainSpecification;
import adaptorinterface.QueryCapability;
import adaptorinterface.ResourceServiceNamespace;
import adaptorinterface.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getDomainSpecification <em>Domain Specification</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getCreationFactories <em>Creation Factories</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getQueryCapabilities <em>Query Capabilities</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getSelectionDialogs <em>Selection Dialogs</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getCreationDialogs <em>Creation Dialogs</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getBasicCapabilities <em>Basic Capabilities</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
     * The cached value of the '{@link #getDomainSpecification() <em>Domain Specification</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDomainSpecification()
     * @generated
     * @ordered
     */
	protected DomainSpecification domainSpecification;

	/**
     * The default value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceNamespace()
     * @generated
     * @ordered
     */
	protected static final ResourceServiceNamespace SERVICE_NAMESPACE_EDEFAULT = ResourceServiceNamespace.INDEPENDANT_OF_SERVICE_PROVIDER;

	/**
     * The cached value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceNamespace()
     * @generated
     * @ordered
     */
	protected ResourceServiceNamespace serviceNamespace = SERVICE_NAMESPACE_EDEFAULT;

	/**
     * The cached value of the '{@link #getCreationFactories() <em>Creation Factories</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreationFactories()
     * @generated
     * @ordered
     */
	protected EList<CreationFactory> creationFactories;

	/**
     * The cached value of the '{@link #getQueryCapabilities() <em>Query Capabilities</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getQueryCapabilities()
     * @generated
     * @ordered
     */
	protected EList<QueryCapability> queryCapabilities;

	/**
     * The cached value of the '{@link #getSelectionDialogs() <em>Selection Dialogs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSelectionDialogs()
     * @generated
     * @ordered
     */
	protected EList<Dialog> selectionDialogs;

	/**
     * The cached value of the '{@link #getCreationDialogs() <em>Creation Dialogs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreationDialogs()
     * @generated
     * @ordered
     */
	protected EList<Dialog> creationDialogs;

	/**
     * The cached value of the '{@link #getBasicCapabilities() <em>Basic Capabilities</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBasicCapabilities()
     * @generated
     * @ordered
     */
	protected EList<BasicCapability> basicCapabilities;

	/**
     * The cached value of the '{@link #getUsages() <em>Usages</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsages()
     * @generated
     * @ordered
     */
	protected EList<String> usages;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ServiceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SERVICE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public DomainSpecification getDomainSpecification() {
        if (domainSpecification != null && domainSpecification.eIsProxy()) {
            InternalEObject oldDomainSpecification = (InternalEObject)domainSpecification;
            domainSpecification = (DomainSpecification)eResolveProxy(oldDomainSpecification);
            if (domainSpecification != oldDomainSpecification) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION, oldDomainSpecification, domainSpecification));
            }
        }
        return domainSpecification;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DomainSpecification basicGetDomainSpecification() {
        return domainSpecification;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setDomainSpecification(DomainSpecification newDomainSpecification) {
        DomainSpecification oldDomainSpecification = domainSpecification;
        domainSpecification = newDomainSpecification;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION, oldDomainSpecification, domainSpecification));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceServiceNamespace getServiceNamespace() {
        return serviceNamespace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setServiceNamespace(ResourceServiceNamespace newServiceNamespace) {
        ResourceServiceNamespace oldServiceNamespace = serviceNamespace;
        serviceNamespace = newServiceNamespace == null ? SERVICE_NAMESPACE_EDEFAULT : newServiceNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE, oldServiceNamespace, serviceNamespace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<CreationFactory> getCreationFactories() {
        if (creationFactories == null) {
            creationFactories = new EObjectContainmentEList<CreationFactory>(CreationFactory.class, this, AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES);
        }
        return creationFactories;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<QueryCapability> getQueryCapabilities() {
        if (queryCapabilities == null) {
            queryCapabilities = new EObjectContainmentEList<QueryCapability>(QueryCapability.class, this, AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES);
        }
        return queryCapabilities;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Dialog> getSelectionDialogs() {
        if (selectionDialogs == null) {
            selectionDialogs = new EObjectContainmentEList<Dialog>(Dialog.class, this, AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS);
        }
        return selectionDialogs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Dialog> getCreationDialogs() {
        if (creationDialogs == null) {
            creationDialogs = new EObjectContainmentEList<Dialog>(Dialog.class, this, AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS);
        }
        return creationDialogs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<BasicCapability> getBasicCapabilities() {
        if (basicCapabilities == null) {
            basicCapabilities = new EObjectContainmentEList<BasicCapability>(BasicCapability.class, this, AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES);
        }
        return basicCapabilities;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<String> getUsages() {
        if (usages == null) {
            usages = new EDataTypeUniqueEList<String>(String.class, this, AdaptorinterfacePackage.SERVICE__USAGES);
        }
        return usages;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
                return ((InternalEList<?>)getCreationFactories()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
                return ((InternalEList<?>)getQueryCapabilities()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
                return ((InternalEList<?>)getSelectionDialogs()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
                return ((InternalEList<?>)getCreationDialogs()).basicRemove(otherEnd, msgs);
            case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
                return ((InternalEList<?>)getBasicCapabilities()).basicRemove(otherEnd, msgs);
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
            case AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION:
                if (resolve) return getDomainSpecification();
                return basicGetDomainSpecification();
            case AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE:
                return getServiceNamespace();
            case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
                return getCreationFactories();
            case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
                return getQueryCapabilities();
            case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
                return getSelectionDialogs();
            case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
                return getCreationDialogs();
            case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
                return getBasicCapabilities();
            case AdaptorinterfacePackage.SERVICE__USAGES:
                return getUsages();
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
            case AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION:
                setDomainSpecification((DomainSpecification)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE:
                setServiceNamespace((ResourceServiceNamespace)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
                getCreationFactories().clear();
                getCreationFactories().addAll((Collection<? extends CreationFactory>)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
                getQueryCapabilities().clear();
                getQueryCapabilities().addAll((Collection<? extends QueryCapability>)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
                getSelectionDialogs().clear();
                getSelectionDialogs().addAll((Collection<? extends Dialog>)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
                getCreationDialogs().clear();
                getCreationDialogs().addAll((Collection<? extends Dialog>)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
                getBasicCapabilities().clear();
                getBasicCapabilities().addAll((Collection<? extends BasicCapability>)newValue);
                return;
            case AdaptorinterfacePackage.SERVICE__USAGES:
                getUsages().clear();
                getUsages().addAll((Collection<? extends String>)newValue);
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
            case AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION:
                setDomainSpecification((DomainSpecification)null);
                return;
            case AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE:
                setServiceNamespace(SERVICE_NAMESPACE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
                getCreationFactories().clear();
                return;
            case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
                getQueryCapabilities().clear();
                return;
            case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
                getSelectionDialogs().clear();
                return;
            case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
                getCreationDialogs().clear();
                return;
            case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
                getBasicCapabilities().clear();
                return;
            case AdaptorinterfacePackage.SERVICE__USAGES:
                getUsages().clear();
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
            case AdaptorinterfacePackage.SERVICE__DOMAIN_SPECIFICATION:
                return domainSpecification != null;
            case AdaptorinterfacePackage.SERVICE__SERVICE_NAMESPACE:
                return serviceNamespace != SERVICE_NAMESPACE_EDEFAULT;
            case AdaptorinterfacePackage.SERVICE__CREATION_FACTORIES:
                return creationFactories != null && !creationFactories.isEmpty();
            case AdaptorinterfacePackage.SERVICE__QUERY_CAPABILITIES:
                return queryCapabilities != null && !queryCapabilities.isEmpty();
            case AdaptorinterfacePackage.SERVICE__SELECTION_DIALOGS:
                return selectionDialogs != null && !selectionDialogs.isEmpty();
            case AdaptorinterfacePackage.SERVICE__CREATION_DIALOGS:
                return creationDialogs != null && !creationDialogs.isEmpty();
            case AdaptorinterfacePackage.SERVICE__BASIC_CAPABILITIES:
                return basicCapabilities != null && !basicCapabilities.isEmpty();
            case AdaptorinterfacePackage.SERVICE__USAGES:
                return usages != null && !usages.isEmpty();
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
        result.append(" (serviceNamespace: ");
        result.append(serviceNamespace);
        result.append(", usages: ");
        result.append(usages);
        result.append(')');
        return result.toString();
    }

} //ServiceImpl
