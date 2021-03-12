/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.GenerationSetting;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.GenerationSettingImpl#getJavaClassPackageName <em>Java Class Package Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.GenerationSettingImpl#getJavaFilesPath <em>Java Files Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.GenerationSettingImpl#isDoNotGenerate <em>Do Not Generate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationSettingImpl extends MinimalEObjectImpl.Container implements GenerationSetting {
	/**
     * The default value of the '{@link #getJavaClassPackageName() <em>Java Class Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaClassPackageName()
     * @generated
     * @ordered
     */
	protected static final String JAVA_CLASS_PACKAGE_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getJavaClassPackageName() <em>Java Class Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaClassPackageName()
     * @generated
     * @ordered
     */
	protected String javaClassPackageName = JAVA_CLASS_PACKAGE_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getJavaFilesPath() <em>Java Files Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaFilesPath()
     * @generated
     * @ordered
     */
	protected static final String JAVA_FILES_PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getJavaFilesPath() <em>Java Files Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaFilesPath()
     * @generated
     * @ordered
     */
	protected String javaFilesPath = JAVA_FILES_PATH_EDEFAULT;

	/**
     * The default value of the '{@link #isDoNotGenerate() <em>Do Not Generate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDoNotGenerate()
     * @generated
     * @ordered
     */
	protected static final boolean DO_NOT_GENERATE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDoNotGenerate() <em>Do Not Generate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDoNotGenerate()
     * @generated
     * @ordered
     */
	protected boolean doNotGenerate = DO_NOT_GENERATE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GenerationSettingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.GENERATION_SETTING;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getJavaClassPackageName() {
        return javaClassPackageName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setJavaClassPackageName(String newJavaClassPackageName) {
        String oldJavaClassPackageName = javaClassPackageName;
        javaClassPackageName = newJavaClassPackageName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME, oldJavaClassPackageName, javaClassPackageName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getJavaFilesPath() {
        return javaFilesPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setJavaFilesPath(String newJavaFilesPath) {
        String oldJavaFilesPath = javaFilesPath;
        javaFilesPath = newJavaFilesPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.GENERATION_SETTING__JAVA_FILES_PATH, oldJavaFilesPath, javaFilesPath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public boolean isDoNotGenerate() {
        return doNotGenerate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setDoNotGenerate(boolean newDoNotGenerate) {
        boolean oldDoNotGenerate = doNotGenerate;
        doNotGenerate = newDoNotGenerate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.GENERATION_SETTING__DO_NOT_GENERATE, oldDoNotGenerate, doNotGenerate));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME:
                return getJavaClassPackageName();
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_FILES_PATH:
                return getJavaFilesPath();
            case AdaptorinterfacePackage.GENERATION_SETTING__DO_NOT_GENERATE:
                return isDoNotGenerate();
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
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME:
                setJavaClassPackageName((String)newValue);
                return;
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_FILES_PATH:
                setJavaFilesPath((String)newValue);
                return;
            case AdaptorinterfacePackage.GENERATION_SETTING__DO_NOT_GENERATE:
                setDoNotGenerate((Boolean)newValue);
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
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME:
                setJavaClassPackageName(JAVA_CLASS_PACKAGE_NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_FILES_PATH:
                setJavaFilesPath(JAVA_FILES_PATH_EDEFAULT);
                return;
            case AdaptorinterfacePackage.GENERATION_SETTING__DO_NOT_GENERATE:
                setDoNotGenerate(DO_NOT_GENERATE_EDEFAULT);
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
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME:
                return JAVA_CLASS_PACKAGE_NAME_EDEFAULT == null ? javaClassPackageName != null : !JAVA_CLASS_PACKAGE_NAME_EDEFAULT.equals(javaClassPackageName);
            case AdaptorinterfacePackage.GENERATION_SETTING__JAVA_FILES_PATH:
                return JAVA_FILES_PATH_EDEFAULT == null ? javaFilesPath != null : !JAVA_FILES_PATH_EDEFAULT.equals(javaFilesPath);
            case AdaptorinterfacePackage.GENERATION_SETTING__DO_NOT_GENERATE:
                return doNotGenerate != DO_NOT_GENERATE_EDEFAULT;
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
        result.append(" (javaClassPackageName: ");
        result.append(javaClassPackageName);
        result.append(", javaFilesPath: ");
        result.append(javaFilesPath);
        result.append(", doNotGenerate: ");
        result.append(doNotGenerate);
        result.append(')');
        return result.toString();
    }

} //GenerationSettingImpl
