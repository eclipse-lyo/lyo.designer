/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.QueryCapability;
import adaptorinterface.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptorinterface.impl.QueryCapabilityImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.QueryCapabilityImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.impl.QueryCapabilityImpl#getQueryBaseURI <em>Query Base URI</em>}</li>
 *   <li>{@link adaptorinterface.impl.QueryCapabilityImpl#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryCapabilityImpl extends MinimalEObjectImpl.Container implements QueryCapability {
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
	 * The default value of the '{@link #getQueryBaseURI() <em>Query Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryBaseURI() <em>Query Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String queryBaseURI = QUERY_BASE_URI_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.QUERY_CAPABILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.QUERY_CAPABILITY__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.QUERY_CAPABILITY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryBaseURI() {
		return queryBaseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryBaseURI(String newQueryBaseURI) {
		String oldQueryBaseURI = queryBaseURI;
		queryBaseURI = newQueryBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.QUERY_CAPABILITY__QUERY_BASE_URI, oldQueryBaseURI, queryBaseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.QUERY_CAPABILITY__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.QUERY_CAPABILITY__TITLE:
				return getTitle();
			case AdaptorinterfacePackage.QUERY_CAPABILITY__LABEL:
				return getLabel();
			case AdaptorinterfacePackage.QUERY_CAPABILITY__QUERY_BASE_URI:
				return getQueryBaseURI();
			case AdaptorinterfacePackage.QUERY_CAPABILITY__RESOURCE_TYPES:
				return getResourceTypes();
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
			case AdaptorinterfacePackage.QUERY_CAPABILITY__TITLE:
				setTitle((String)newValue);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__LABEL:
				setLabel((String)newValue);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__QUERY_BASE_URI:
				setQueryBaseURI((String)newValue);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__RESOURCE_TYPES:
				getResourceTypes().clear();
				getResourceTypes().addAll((Collection<? extends Resource>)newValue);
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
			case AdaptorinterfacePackage.QUERY_CAPABILITY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__QUERY_BASE_URI:
				setQueryBaseURI(QUERY_BASE_URI_EDEFAULT);
				return;
			case AdaptorinterfacePackage.QUERY_CAPABILITY__RESOURCE_TYPES:
				getResourceTypes().clear();
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
			case AdaptorinterfacePackage.QUERY_CAPABILITY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AdaptorinterfacePackage.QUERY_CAPABILITY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AdaptorinterfacePackage.QUERY_CAPABILITY__QUERY_BASE_URI:
				return QUERY_BASE_URI_EDEFAULT == null ? queryBaseURI != null : !QUERY_BASE_URI_EDEFAULT.equals(queryBaseURI);
			case AdaptorinterfacePackage.QUERY_CAPABILITY__RESOURCE_TYPES:
				return resourceTypes != null && !resourceTypes.isEmpty();
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
		result.append(", queryBaseURI: ");
		result.append(queryBaseURI);
		result.append(')');
		return result.toString();
	}

} //QueryCapabilityImpl
