/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ProjectConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ProjectConfigurationImpl#isDoNotGenerateProjectConfigurationFiles <em>Do Not Generate Project Configuration Files</em>}</li>
 *   <li>{@link adaptorinterface.impl.ProjectConfigurationImpl#getLyoVersion <em>Lyo Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectConfigurationImpl extends MinimalEObjectImpl.Container implements ProjectConfiguration {
	/**
	 * The default value of the '{@link #isDoNotGenerateProjectConfigurationFiles() <em>Do Not Generate Project Configuration Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoNotGenerateProjectConfigurationFiles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoNotGenerateProjectConfigurationFiles() <em>Do Not Generate Project Configuration Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoNotGenerateProjectConfigurationFiles()
	 * @generated
	 * @ordered
	 */
	protected boolean doNotGenerateProjectConfigurationFiles = DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLyoVersion() <em>Lyo Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyoVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LYO_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLyoVersion() <em>Lyo Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyoVersion()
	 * @generated
	 * @ordered
	 */
	protected String lyoVersion = LYO_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.PROJECT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoNotGenerateProjectConfigurationFiles() {
		return doNotGenerateProjectConfigurationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoNotGenerateProjectConfigurationFiles(boolean newDoNotGenerateProjectConfigurationFiles) {
		boolean oldDoNotGenerateProjectConfigurationFiles = doNotGenerateProjectConfigurationFiles;
		doNotGenerateProjectConfigurationFiles = newDoNotGenerateProjectConfigurationFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES, oldDoNotGenerateProjectConfigurationFiles, doNotGenerateProjectConfigurationFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLyoVersion() {
		return lyoVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLyoVersion(String newLyoVersion) {
		String oldLyoVersion = lyoVersion;
		lyoVersion = newLyoVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.PROJECT_CONFIGURATION__LYO_VERSION, oldLyoVersion, lyoVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES:
				return isDoNotGenerateProjectConfigurationFiles();
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__LYO_VERSION:
				return getLyoVersion();
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
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES:
				setDoNotGenerateProjectConfigurationFiles((Boolean)newValue);
				return;
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__LYO_VERSION:
				setLyoVersion((String)newValue);
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
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES:
				setDoNotGenerateProjectConfigurationFiles(DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES_EDEFAULT);
				return;
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__LYO_VERSION:
				setLyoVersion(LYO_VERSION_EDEFAULT);
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
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES:
				return doNotGenerateProjectConfigurationFiles != DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES_EDEFAULT;
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION__LYO_VERSION:
				return LYO_VERSION_EDEFAULT == null ? lyoVersion != null : !LYO_VERSION_EDEFAULT.equals(lyoVersion);
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
		result.append(" (doNotGenerateProjectConfigurationFiles: ");
		result.append(doNotGenerateProjectConfigurationFiles);
		result.append(", lyoVersion: ");
		result.append(lyoVersion);
		result.append(')');
		return result.toString();
	}

} //ProjectConfigurationImpl
