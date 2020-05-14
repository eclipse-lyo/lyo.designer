/**
 */
package vocabulary.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vocabulary.GeneralConfiguration;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.GeneralConfigurationImpl#isDoNotGenerate <em>Do Not Generate</em>}</li>
 *   <li>{@link vocabulary.impl.GeneralConfigurationImpl#getFilesBasePath <em>Files Base Path</em>}</li>
 *   <li>{@link vocabulary.impl.GeneralConfigurationImpl#getJavaBasePackageName <em>Java Base Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralConfigurationImpl extends MinimalEObjectImpl.Container implements GeneralConfiguration {
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
     * The default value of the '{@link #getFilesBasePath() <em>Files Base Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilesBasePath()
     * @generated
     * @ordered
     */
    protected static final String FILES_BASE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFilesBasePath() <em>Files Base Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilesBasePath()
     * @generated
     * @ordered
     */
    protected String filesBasePath = FILES_BASE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getJavaBasePackageName() <em>Java Base Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJavaBasePackageName()
     * @generated
     * @ordered
     */
    protected static final String JAVA_BASE_PACKAGE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJavaBasePackageName() <em>Java Base Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJavaBasePackageName()
     * @generated
     * @ordered
     */
    protected String javaBasePackageName = JAVA_BASE_PACKAGE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VocabularyPackage.Literals.GENERAL_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDoNotGenerate() {
        return doNotGenerate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoNotGenerate(boolean newDoNotGenerate) {
        boolean oldDoNotGenerate = doNotGenerate;
        doNotGenerate = newDoNotGenerate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.GENERAL_CONFIGURATION__DO_NOT_GENERATE, oldDoNotGenerate, doNotGenerate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFilesBasePath() {
        return filesBasePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilesBasePath(String newFilesBasePath) {
        String oldFilesBasePath = filesBasePath;
        filesBasePath = newFilesBasePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.GENERAL_CONFIGURATION__FILES_BASE_PATH, oldFilesBasePath, filesBasePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJavaBasePackageName() {
        return javaBasePackageName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJavaBasePackageName(String newJavaBasePackageName) {
        String oldJavaBasePackageName = javaBasePackageName;
        javaBasePackageName = newJavaBasePackageName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME, oldJavaBasePackageName, javaBasePackageName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VocabularyPackage.GENERAL_CONFIGURATION__DO_NOT_GENERATE:
                return isDoNotGenerate();
            case VocabularyPackage.GENERAL_CONFIGURATION__FILES_BASE_PATH:
                return getFilesBasePath();
            case VocabularyPackage.GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME:
                return getJavaBasePackageName();
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
            case VocabularyPackage.GENERAL_CONFIGURATION__DO_NOT_GENERATE:
                setDoNotGenerate((Boolean)newValue);
                return;
            case VocabularyPackage.GENERAL_CONFIGURATION__FILES_BASE_PATH:
                setFilesBasePath((String)newValue);
                return;
            case VocabularyPackage.GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME:
                setJavaBasePackageName((String)newValue);
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
            case VocabularyPackage.GENERAL_CONFIGURATION__DO_NOT_GENERATE:
                setDoNotGenerate(DO_NOT_GENERATE_EDEFAULT);
                return;
            case VocabularyPackage.GENERAL_CONFIGURATION__FILES_BASE_PATH:
                setFilesBasePath(FILES_BASE_PATH_EDEFAULT);
                return;
            case VocabularyPackage.GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME:
                setJavaBasePackageName(JAVA_BASE_PACKAGE_NAME_EDEFAULT);
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
            case VocabularyPackage.GENERAL_CONFIGURATION__DO_NOT_GENERATE:
                return doNotGenerate != DO_NOT_GENERATE_EDEFAULT;
            case VocabularyPackage.GENERAL_CONFIGURATION__FILES_BASE_PATH:
                return FILES_BASE_PATH_EDEFAULT == null ? filesBasePath != null : !FILES_BASE_PATH_EDEFAULT.equals(filesBasePath);
            case VocabularyPackage.GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME:
                return JAVA_BASE_PACKAGE_NAME_EDEFAULT == null ? javaBasePackageName != null : !JAVA_BASE_PACKAGE_NAME_EDEFAULT.equals(javaBasePackageName);
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
        result.append(" (doNotGenerate: ");
        result.append(doNotGenerate);
        result.append(", filesBasePath: ");
        result.append(filesBasePath);
        result.append(", javaBasePackageName: ");
        result.append(javaBasePackageName);
        result.append(')');
        return result.toString();
    }

} //GeneralConfigurationImpl
