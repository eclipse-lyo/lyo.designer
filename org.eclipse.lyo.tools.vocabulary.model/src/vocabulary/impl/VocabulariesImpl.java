/**
 */
package vocabulary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vocabulary.Vocabularies;
import vocabulary.Vocabulary;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VOCABULARIES__VOCABULARIES:
				return ((InternalEList<?>)getVocabularies()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //VocabulariesImpl
