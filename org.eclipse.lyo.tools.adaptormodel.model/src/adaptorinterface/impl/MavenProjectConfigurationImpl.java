/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.MavenProjectConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Project Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.MavenProjectConfigurationImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link adaptorinterface.impl.MavenProjectConfigurationImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link adaptorinterface.impl.MavenProjectConfigurationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MavenProjectConfigurationImpl extends ProjectConfigurationImpl implements MavenProjectConfiguration {
	/**
     * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupId()
     * @generated
     * @ordered
     */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupId()
     * @generated
     * @ordered
     */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArtifactId()
     * @generated
     * @ordered
     */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArtifactId()
     * @generated
     * @ordered
     */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
	protected static final String VERSION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
	protected String version = VERSION_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MavenProjectConfigurationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.MAVEN_PROJECT_CONFIGURATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getGroupId() {
        return groupId;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setGroupId(String newGroupId) {
        String oldGroupId = groupId;
        groupId = newGroupId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__GROUP_ID, oldGroupId, groupId));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getArtifactId() {
        return artifactId;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setArtifactId(String newArtifactId) {
        String oldArtifactId = artifactId;
        artifactId = newArtifactId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID, oldArtifactId, artifactId));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getVersion() {
        return version;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__VERSION, oldVersion, version));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__GROUP_ID:
                return getGroupId();
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID:
                return getArtifactId();
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__VERSION:
                return getVersion();
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
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__GROUP_ID:
                setGroupId((String)newValue);
                return;
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID:
                setArtifactId((String)newValue);
                return;
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__VERSION:
                setVersion((String)newValue);
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
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__GROUP_ID:
                setGroupId(GROUP_ID_EDEFAULT);
                return;
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID:
                setArtifactId(ARTIFACT_ID_EDEFAULT);
                return;
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__VERSION:
                setVersion(VERSION_EDEFAULT);
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
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__GROUP_ID:
                return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID:
                return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
            case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
        result.append(" (groupId: ");
        result.append(groupId);
        result.append(", artifactId: ");
        result.append(artifactId);
        result.append(", version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} //MavenProjectConfigurationImpl
