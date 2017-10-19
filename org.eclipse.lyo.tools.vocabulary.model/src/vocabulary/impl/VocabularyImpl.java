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

import vocabulary.Term;
import vocabulary.Vocabulary;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getPreferredNamespacePrefix <em>Preferred Namespace Prefix</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabularyImpl extends MinimalEObjectImpl.Container implements Vocabulary {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredNamespacePrefix() <em>Preferred Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_NAMESPACE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredNamespacePrefix() <em>Preferred Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected String preferredNamespacePrefix = PREFERRED_NAMESPACE_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOCABULARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceURI() {
		return namespaceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceURI(String newNamespaceURI) {
		String oldNamespaceURI = namespaceURI;
		namespaceURI = newNamespaceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__NAMESPACE_URI, oldNamespaceURI, namespaceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferredNamespacePrefix() {
		return preferredNamespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredNamespacePrefix(String newPreferredNamespacePrefix) {
		String oldPreferredNamespacePrefix = preferredNamespacePrefix;
		preferredNamespacePrefix = newPreferredNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__PREFERRED_NAMESPACE_PREFIX, oldPreferredNamespacePrefix, preferredNamespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<Term>(Term.class, this, VocabularyPackage.VOCABULARY__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VOCABULARY__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case VocabularyPackage.VOCABULARY__NAMESPACE_URI:
				return getNamespaceURI();
			case VocabularyPackage.VOCABULARY__LABEL:
				return getLabel();
			case VocabularyPackage.VOCABULARY__DESCRIPTION:
				return getDescription();
			case VocabularyPackage.VOCABULARY__SOURCE:
				return getSource();
			case VocabularyPackage.VOCABULARY__PREFERRED_NAMESPACE_PREFIX:
				return getPreferredNamespacePrefix();
			case VocabularyPackage.VOCABULARY__TERMS:
				return getTerms();
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
			case VocabularyPackage.VOCABULARY__NAMESPACE_URI:
				setNamespaceURI((String)newValue);
				return;
			case VocabularyPackage.VOCABULARY__LABEL:
				setLabel((String)newValue);
				return;
			case VocabularyPackage.VOCABULARY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case VocabularyPackage.VOCABULARY__SOURCE:
				setSource((String)newValue);
				return;
			case VocabularyPackage.VOCABULARY__PREFERRED_NAMESPACE_PREFIX:
				setPreferredNamespacePrefix((String)newValue);
				return;
			case VocabularyPackage.VOCABULARY__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends Term>)newValue);
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
			case VocabularyPackage.VOCABULARY__NAMESPACE_URI:
				setNamespaceURI(NAMESPACE_URI_EDEFAULT);
				return;
			case VocabularyPackage.VOCABULARY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case VocabularyPackage.VOCABULARY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case VocabularyPackage.VOCABULARY__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case VocabularyPackage.VOCABULARY__PREFERRED_NAMESPACE_PREFIX:
				setPreferredNamespacePrefix(PREFERRED_NAMESPACE_PREFIX_EDEFAULT);
				return;
			case VocabularyPackage.VOCABULARY__TERMS:
				getTerms().clear();
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
			case VocabularyPackage.VOCABULARY__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceURI != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceURI);
			case VocabularyPackage.VOCABULARY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case VocabularyPackage.VOCABULARY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case VocabularyPackage.VOCABULARY__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case VocabularyPackage.VOCABULARY__PREFERRED_NAMESPACE_PREFIX:
				return PREFERRED_NAMESPACE_PREFIX_EDEFAULT == null ? preferredNamespacePrefix != null : !PREFERRED_NAMESPACE_PREFIX_EDEFAULT.equals(preferredNamespacePrefix);
			case VocabularyPackage.VOCABULARY__TERMS:
				return terms != null && !terms.isEmpty();
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
		result.append(" (namespaceURI: ");
		result.append(namespaceURI);
		result.append(", label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", source: ");
		result.append(source);
		result.append(", preferredNamespacePrefix: ");
		result.append(preferredNamespacePrefix);
		result.append(')');
		return result.toString();
	}

} //VocabularyImpl
