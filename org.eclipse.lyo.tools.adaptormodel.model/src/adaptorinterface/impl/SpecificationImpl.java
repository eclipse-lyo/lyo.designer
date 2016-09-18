/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.DomainSpecification;
import adaptorinterface.NamespacePrefix;
import adaptorinterface.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_SPECIFICATIONS:
				return ((InternalEList<?>)getDomainSpecifications()).basicRemove(otherEnd, msgs);
			case AdaptorinterfacePackage.SPECIFICATION__DOMAIN_PREFIXES:
				return ((InternalEList<?>)getDomainPrefixes()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
