/**
 */
package vocabulary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.ClassImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link vocabulary.impl.ClassImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TermImpl implements vocabulary.Class {
    /**
     * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubClassOf()
     * @generated
     * @ordered
     */
    protected EList<vocabulary.Class> subClassOf;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected vocabulary.Class type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VocabularyPackage.Literals.CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<vocabulary.Class> getSubClassOf() {
        if (subClassOf == null) {
            subClassOf = new EObjectResolvingEList<vocabulary.Class>(vocabulary.Class.class, this, VocabularyPackage.CLASS__SUB_CLASS_OF);
        }
        return subClassOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public vocabulary.Class getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (vocabulary.Class)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.CLASS__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public vocabulary.Class basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(vocabulary.Class newType) {
        vocabulary.Class oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.CLASS__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VocabularyPackage.CLASS__SUB_CLASS_OF:
                return getSubClassOf();
            case VocabularyPackage.CLASS__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case VocabularyPackage.CLASS__SUB_CLASS_OF:
                getSubClassOf().clear();
                getSubClassOf().addAll((Collection<? extends vocabulary.Class>)newValue);
                return;
            case VocabularyPackage.CLASS__TYPE:
                setType((vocabulary.Class)newValue);
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
            case VocabularyPackage.CLASS__SUB_CLASS_OF:
                getSubClassOf().clear();
                return;
            case VocabularyPackage.CLASS__TYPE:
                setType((vocabulary.Class)null);
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
            case VocabularyPackage.CLASS__SUB_CLASS_OF:
                return subClassOf != null && !subClassOf.isEmpty();
            case VocabularyPackage.CLASS__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //ClassImpl
