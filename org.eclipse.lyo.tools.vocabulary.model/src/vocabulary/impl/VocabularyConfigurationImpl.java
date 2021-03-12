/**
 */
package vocabulary.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vocabulary.GeneralConfiguration;
import vocabulary.VocabularyConfiguration;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.VocabularyConfigurationImpl#getGeneralConfiguration <em>General Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabularyConfigurationImpl extends MinimalEObjectImpl.Container implements VocabularyConfiguration {
    /**
     * The cached value of the '{@link #getGeneralConfiguration() <em>General Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralConfiguration()
     * @generated
     * @ordered
     */
    protected GeneralConfiguration generalConfiguration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VocabularyConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VocabularyPackage.Literals.VOCABULARY_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralConfiguration getGeneralConfiguration() {
        return generalConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralConfiguration(GeneralConfiguration newGeneralConfiguration, NotificationChain msgs) {
        GeneralConfiguration oldGeneralConfiguration = generalConfiguration;
        generalConfiguration = newGeneralConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION, oldGeneralConfiguration, newGeneralConfiguration);
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
    public void setGeneralConfiguration(GeneralConfiguration newGeneralConfiguration) {
        if (newGeneralConfiguration != generalConfiguration) {
            NotificationChain msgs = null;
            if (generalConfiguration != null)
                msgs = ((InternalEObject)generalConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
            if (newGeneralConfiguration != null)
                msgs = ((InternalEObject)newGeneralConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
            msgs = basicSetGeneralConfiguration(newGeneralConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION, newGeneralConfiguration, newGeneralConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION:
                return basicSetGeneralConfiguration(null, msgs);
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
            case VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION:
                return getGeneralConfiguration();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION:
                setGeneralConfiguration((GeneralConfiguration)newValue);
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
            case VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION:
                setGeneralConfiguration((GeneralConfiguration)null);
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
            case VocabularyPackage.VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION:
                return generalConfiguration != null;
        }
        return super.eIsSet(featureID);
    }

} //VocabularyConfigurationImpl
