/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Dialog;
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
 * An implementation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getDialogURI <em>Dialog URI</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getHintWidth <em>Hint Width</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getHintHeight <em>Hint Height</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.impl.DialogImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogImpl extends MinimalEObjectImpl.Container implements Dialog {
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
     * The default value of the '{@link #getDialogURI() <em>Dialog URI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDialogURI()
     * @generated
     * @ordered
     */
	protected static final String DIALOG_URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDialogURI() <em>Dialog URI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDialogURI()
     * @generated
     * @ordered
     */
	protected String dialogURI = DIALOG_URI_EDEFAULT;

	/**
     * The default value of the '{@link #getHintWidth() <em>Hint Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHintWidth()
     * @generated
     * @ordered
     */
	protected static final short HINT_WIDTH_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHintWidth() <em>Hint Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHintWidth()
     * @generated
     * @ordered
     */
	protected short hintWidth = HINT_WIDTH_EDEFAULT;

	/**
     * The default value of the '{@link #getHintHeight() <em>Hint Height</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHintHeight()
     * @generated
     * @ordered
     */
	protected static final short HINT_HEIGHT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHintHeight() <em>Hint Height</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHintHeight()
     * @generated
     * @ordered
     */
	protected short hintHeight = HINT_HEIGHT_EDEFAULT;

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
	protected DialogImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.DIALOG;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getTitle() {
        return title;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DIALOG__TITLE, oldTitle, title));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getLabel() {
        return label;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DIALOG__LABEL, oldLabel, label));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getDialogURI() {
        return dialogURI;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setDialogURI(String newDialogURI) {
        String oldDialogURI = dialogURI;
        dialogURI = newDialogURI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DIALOG__DIALOG_URI, oldDialogURI, dialogURI));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public short getHintWidth() {
        return hintWidth;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setHintWidth(short newHintWidth) {
        short oldHintWidth = hintWidth;
        hintWidth = newHintWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DIALOG__HINT_WIDTH, oldHintWidth, hintWidth));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public short getHintHeight() {
        return hintHeight;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setHintHeight(short newHintHeight) {
        short oldHintHeight = hintHeight;
        hintHeight = newHintHeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.DIALOG__HINT_HEIGHT, oldHintHeight, hintHeight));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Resource> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.DIALOG__RESOURCE_TYPES);
        }
        return resourceTypes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<String> getUsages() {
        if (usages == null) {
            usages = new EDataTypeUniqueEList<String>(String.class, this, AdaptorinterfacePackage.DIALOG__USAGES);
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
            case AdaptorinterfacePackage.DIALOG__TITLE:
                return getTitle();
            case AdaptorinterfacePackage.DIALOG__LABEL:
                return getLabel();
            case AdaptorinterfacePackage.DIALOG__DIALOG_URI:
                return getDialogURI();
            case AdaptorinterfacePackage.DIALOG__HINT_WIDTH:
                return getHintWidth();
            case AdaptorinterfacePackage.DIALOG__HINT_HEIGHT:
                return getHintHeight();
            case AdaptorinterfacePackage.DIALOG__RESOURCE_TYPES:
                return getResourceTypes();
            case AdaptorinterfacePackage.DIALOG__USAGES:
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
            case AdaptorinterfacePackage.DIALOG__TITLE:
                setTitle((String)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__LABEL:
                setLabel((String)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__DIALOG_URI:
                setDialogURI((String)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__HINT_WIDTH:
                setHintWidth((Short)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__HINT_HEIGHT:
                setHintHeight((Short)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__RESOURCE_TYPES:
                getResourceTypes().clear();
                getResourceTypes().addAll((Collection<? extends Resource>)newValue);
                return;
            case AdaptorinterfacePackage.DIALOG__USAGES:
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
            case AdaptorinterfacePackage.DIALOG__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.DIALOG__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case AdaptorinterfacePackage.DIALOG__DIALOG_URI:
                setDialogURI(DIALOG_URI_EDEFAULT);
                return;
            case AdaptorinterfacePackage.DIALOG__HINT_WIDTH:
                setHintWidth(HINT_WIDTH_EDEFAULT);
                return;
            case AdaptorinterfacePackage.DIALOG__HINT_HEIGHT:
                setHintHeight(HINT_HEIGHT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.DIALOG__RESOURCE_TYPES:
                getResourceTypes().clear();
                return;
            case AdaptorinterfacePackage.DIALOG__USAGES:
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
            case AdaptorinterfacePackage.DIALOG__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case AdaptorinterfacePackage.DIALOG__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case AdaptorinterfacePackage.DIALOG__DIALOG_URI:
                return DIALOG_URI_EDEFAULT == null ? dialogURI != null : !DIALOG_URI_EDEFAULT.equals(dialogURI);
            case AdaptorinterfacePackage.DIALOG__HINT_WIDTH:
                return hintWidth != HINT_WIDTH_EDEFAULT;
            case AdaptorinterfacePackage.DIALOG__HINT_HEIGHT:
                return hintHeight != HINT_HEIGHT_EDEFAULT;
            case AdaptorinterfacePackage.DIALOG__RESOURCE_TYPES:
                return resourceTypes != null && !resourceTypes.isEmpty();
            case AdaptorinterfacePackage.DIALOG__USAGES:
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (title: ");
        result.append(title);
        result.append(", label: ");
        result.append(label);
        result.append(", dialogURI: ");
        result.append(dialogURI);
        result.append(", hintWidth: ");
        result.append(hintWidth);
        result.append(", hintHeight: ");
        result.append(hintHeight);
        result.append(", usages: ");
        result.append(usages);
        result.append(')');
        return result.toString();
    }

} //DialogImpl
