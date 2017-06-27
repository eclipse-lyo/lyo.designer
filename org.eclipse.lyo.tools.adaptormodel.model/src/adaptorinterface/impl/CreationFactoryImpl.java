/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.CreationFactory;
import adaptorinterface.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creation Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.CreationFactoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.CreationFactoryImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.impl.CreationFactoryImpl#getCreationURI <em>Creation URI</em>}</li>
 *   <li>{@link adaptorinterface.impl.CreationFactoryImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.impl.CreationFactoryImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreationFactoryImpl extends MinimalEObjectImpl.Container implements CreationFactory {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #getCreationURI() <em>Creation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationURI() <em>Creation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationURI()
	 * @generated
	 * @ordered
	 */
	protected String creationURI = CREATION_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resourceTypes;

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
	protected CreationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.CREATION_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.CREATION_FACTORY__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.CREATION_FACTORY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationURI() {
		return creationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationURI(String newCreationURI) {
		String oldCreationURI = creationURI;
		creationURI = newCreationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.CREATION_FACTORY__CREATION_URI, oldCreationURI, creationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.CREATION_FACTORY__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsages() {
		if (usages == null) {
			usages = new EDataTypeUniqueEList<String>(String.class, this, AdaptorinterfacePackage.CREATION_FACTORY__USAGES);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.CREATION_FACTORY__TITLE:
				return getTitle();
			case AdaptorinterfacePackage.CREATION_FACTORY__LABEL:
				return getLabel();
			case AdaptorinterfacePackage.CREATION_FACTORY__CREATION_URI:
				return getCreationURI();
			case AdaptorinterfacePackage.CREATION_FACTORY__RESOURCE_TYPES:
				return getResourceTypes();
			case AdaptorinterfacePackage.CREATION_FACTORY__USAGES:
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
			case AdaptorinterfacePackage.CREATION_FACTORY__TITLE:
				setTitle((String)newValue);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__LABEL:
				setLabel((String)newValue);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__CREATION_URI:
				setCreationURI((String)newValue);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__RESOURCE_TYPES:
				getResourceTypes().clear();
				getResourceTypes().addAll((Collection<? extends Resource>)newValue);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__USAGES:
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
			case AdaptorinterfacePackage.CREATION_FACTORY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__CREATION_URI:
				setCreationURI(CREATION_URI_EDEFAULT);
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__RESOURCE_TYPES:
				getResourceTypes().clear();
				return;
			case AdaptorinterfacePackage.CREATION_FACTORY__USAGES:
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
			case AdaptorinterfacePackage.CREATION_FACTORY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AdaptorinterfacePackage.CREATION_FACTORY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AdaptorinterfacePackage.CREATION_FACTORY__CREATION_URI:
				return CREATION_URI_EDEFAULT == null ? creationURI != null : !CREATION_URI_EDEFAULT.equals(creationURI);
			case AdaptorinterfacePackage.CREATION_FACTORY__RESOURCE_TYPES:
				return resourceTypes != null && !resourceTypes.isEmpty();
			case AdaptorinterfacePackage.CREATION_FACTORY__USAGES:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", label: ");
		result.append(label);
		result.append(", creationURI: ");
		result.append(creationURI);
		result.append(", usages: ");
		result.append(usages);
		result.append(')');
		return result.toString();
	}

} //CreationFactoryImpl
