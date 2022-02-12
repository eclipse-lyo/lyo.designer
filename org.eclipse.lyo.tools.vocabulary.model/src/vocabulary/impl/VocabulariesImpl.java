/**
 */
package vocabulary.impl;

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

import vocabulary.Vocabularies;
import vocabulary.Vocabulary;
import vocabulary.VocabularyConfiguration;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabularies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.VocabulariesImpl#getVocabularies <em>Vocabularies</em>}</li>
 *   <li>{@link vocabulary.impl.VocabulariesImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabulariesImpl extends MinimalEObjectImpl.Container implements Vocabularies {
    /**
     * The cached value of the '{@link #getVocabularies() <em>Vocabularies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVocabularies()
     * @generated
     * @ordered
     */
    protected EList<Vocabulary> vocabularies;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected VocabularyConfiguration configuration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VocabulariesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VocabularyPackage.Literals.VOCABULARIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Vocabulary> getVocabularies() {
        if (vocabularies == null) {
            vocabularies = new EObjectContainmentEList<Vocabulary>(Vocabulary.class, this, VocabularyPackage.VOCABULARIES__VOCABULARIES);
        }
        return vocabularies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VocabularyConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfiguration(VocabularyConfiguration newConfiguration, NotificationChain msgs) {
        VocabularyConfiguration oldConfiguration = configuration;
        configuration = newConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARIES__CONFIGURATION, oldConfiguration, newConfiguration);
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
    public void setConfiguration(VocabularyConfiguration newConfiguration) {
        if (newConfiguration != configuration) {
            NotificationChain msgs = null;
            if (configuration != null)
                msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARIES__CONFIGURATION, null, msgs);
            if (newConfiguration != null)
                msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARIES__CONFIGURATION, null, msgs);
            msgs = basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARIES__CONFIGURATION, newConfiguration, newConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VocabularyPackage.VOCABULARIES__VOCABULARIES:
                return ((InternalEList<?>)getVocabularies()).basicRemove(otherEnd, msgs);
            case VocabularyPackage.VOCABULARIES__CONFIGURATION:
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
            case VocabularyPackage.VOCABULARIES__VOCABULARIES:
                return getVocabularies();
            case VocabularyPackage.VOCABULARIES__CONFIGURATION:
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
            case VocabularyPackage.VOCABULARIES__VOCABULARIES:
                getVocabularies().clear();
                getVocabularies().addAll((Collection<? extends Vocabulary>)newValue);
                return;
            case VocabularyPackage.VOCABULARIES__CONFIGURATION:
                setConfiguration((VocabularyConfiguration)newValue);
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
            case VocabularyPackage.VOCABULARIES__VOCABULARIES:
                getVocabularies().clear();
                return;
            case VocabularyPackage.VOCABULARIES__CONFIGURATION:
                setConfiguration((VocabularyConfiguration)null);
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
            case VocabularyPackage.VOCABULARIES__VOCABULARIES:
                return vocabularies != null && !vocabularies.isEmpty();
            case VocabularyPackage.VOCABULARIES__CONFIGURATION:
                return configuration != null;
        }
        return super.eIsSet(featureID);
    }

} //VocabulariesImpl
