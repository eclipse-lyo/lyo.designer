/**
 */
package toolchain.impl;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.Specification;

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

import toolchain.Toolchain;
import toolchain.ToolchainPackage;
import vocabulary.Vocabularies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toolchain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolchain.impl.ToolchainImpl#getName <em>Name</em>}</li>
 *   <li>{@link toolchain.impl.ToolchainImpl#getAdaptorInterfaces <em>Adaptor Interfaces</em>}</li>
 *   <li>{@link toolchain.impl.ToolchainImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link toolchain.impl.ToolchainImpl#getVocabularies <em>Vocabularies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolchainImpl extends MinimalEObjectImpl.Container implements Toolchain {
	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = "New ToolChain";

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
     * The cached value of the '{@link #getAdaptorInterfaces() <em>Adaptor Interfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAdaptorInterfaces()
     * @generated
     * @ordered
     */
	protected EList<AdaptorInterface> adaptorInterfaces;

	/**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpecification()
     * @generated
     * @ordered
     */
	protected Specification specification;

	/**
     * The cached value of the '{@link #getVocabularies() <em>Vocabularies</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVocabularies()
     * @generated
     * @ordered
     */
	protected Vocabularies vocabularies;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ToolchainImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ToolchainPackage.Literals.TOOLCHAIN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToolchainPackage.TOOLCHAIN__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EList<AdaptorInterface> getAdaptorInterfaces() {
        if (adaptorInterfaces == null) {
            adaptorInterfaces = new EObjectContainmentEList<AdaptorInterface>(AdaptorInterface.class, this, ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES);
        }
        return adaptorInterfaces;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Specification getSpecification() {
        return specification;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
        Specification oldSpecification = specification;
        specification = newSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToolchainPackage.TOOLCHAIN__SPECIFICATION, oldSpecification, newSpecification);
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
    public void setSpecification(Specification newSpecification) {
        if (newSpecification != specification) {
            NotificationChain msgs = null;
            if (specification != null)
                msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToolchainPackage.TOOLCHAIN__SPECIFICATION, null, msgs);
            if (newSpecification != null)
                msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToolchainPackage.TOOLCHAIN__SPECIFICATION, null, msgs);
            msgs = basicSetSpecification(newSpecification, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToolchainPackage.TOOLCHAIN__SPECIFICATION, newSpecification, newSpecification));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Vocabularies getVocabularies() {
        return vocabularies;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetVocabularies(Vocabularies newVocabularies, NotificationChain msgs) {
        Vocabularies oldVocabularies = vocabularies;
        vocabularies = newVocabularies;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToolchainPackage.TOOLCHAIN__VOCABULARIES, oldVocabularies, newVocabularies);
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
    public void setVocabularies(Vocabularies newVocabularies) {
        if (newVocabularies != vocabularies) {
            NotificationChain msgs = null;
            if (vocabularies != null)
                msgs = ((InternalEObject)vocabularies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToolchainPackage.TOOLCHAIN__VOCABULARIES, null, msgs);
            if (newVocabularies != null)
                msgs = ((InternalEObject)newVocabularies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToolchainPackage.TOOLCHAIN__VOCABULARIES, null, msgs);
            msgs = basicSetVocabularies(newVocabularies, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToolchainPackage.TOOLCHAIN__VOCABULARIES, newVocabularies, newVocabularies));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES:
                return ((InternalEList<?>)getAdaptorInterfaces()).basicRemove(otherEnd, msgs);
            case ToolchainPackage.TOOLCHAIN__SPECIFICATION:
                return basicSetSpecification(null, msgs);
            case ToolchainPackage.TOOLCHAIN__VOCABULARIES:
                return basicSetVocabularies(null, msgs);
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
            case ToolchainPackage.TOOLCHAIN__NAME:
                return getName();
            case ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES:
                return getAdaptorInterfaces();
            case ToolchainPackage.TOOLCHAIN__SPECIFICATION:
                return getSpecification();
            case ToolchainPackage.TOOLCHAIN__VOCABULARIES:
                return getVocabularies();
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
            case ToolchainPackage.TOOLCHAIN__NAME:
                setName((String)newValue);
                return;
            case ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES:
                getAdaptorInterfaces().clear();
                getAdaptorInterfaces().addAll((Collection<? extends AdaptorInterface>)newValue);
                return;
            case ToolchainPackage.TOOLCHAIN__SPECIFICATION:
                setSpecification((Specification)newValue);
                return;
            case ToolchainPackage.TOOLCHAIN__VOCABULARIES:
                setVocabularies((Vocabularies)newValue);
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
            case ToolchainPackage.TOOLCHAIN__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES:
                getAdaptorInterfaces().clear();
                return;
            case ToolchainPackage.TOOLCHAIN__SPECIFICATION:
                setSpecification((Specification)null);
                return;
            case ToolchainPackage.TOOLCHAIN__VOCABULARIES:
                setVocabularies((Vocabularies)null);
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
            case ToolchainPackage.TOOLCHAIN__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ToolchainPackage.TOOLCHAIN__ADAPTOR_INTERFACES:
                return adaptorInterfaces != null && !adaptorInterfaces.isEmpty();
            case ToolchainPackage.TOOLCHAIN__SPECIFICATION:
                return specification != null;
            case ToolchainPackage.TOOLCHAIN__VOCABULARIES:
                return vocabularies != null;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ToolchainImpl
