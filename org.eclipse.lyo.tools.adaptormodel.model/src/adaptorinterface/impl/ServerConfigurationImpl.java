/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.AuthenticationConfiguration;
import adaptorinterface.GeneralConfiguration;
import adaptorinterface.ProjectConfiguration;
import adaptorinterface.ServerConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getRootServerBaseUrl <em>Root Server Base Url</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getApplicationContextPath <em>Application Context Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getServletUrlPattern <em>Servlet Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#isDoNotRegenerateJspFiles <em>Do Not Regenerate Jsp Files</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#isGenerateJspFilesForOslcUI <em>Generate Jsp Files For Oslc UI</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getProjectConfiguration <em>Project Configuration</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServerConfigurationImpl#getAuthenticationConfiguration <em>Authentication Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerConfigurationImpl extends MinimalEObjectImpl.Container implements ServerConfiguration {
	/**
     * The default value of the '{@link #getRootServerBaseUrl() <em>Root Server Base Url</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRootServerBaseUrl()
     * @generated
     * @ordered
     */
	protected static final String ROOT_SERVER_BASE_URL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRootServerBaseUrl() <em>Root Server Base Url</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRootServerBaseUrl()
     * @generated
     * @ordered
     */
	protected String rootServerBaseUrl = ROOT_SERVER_BASE_URL_EDEFAULT;

	/**
     * The default value of the '{@link #getApplicationContextPath() <em>Application Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getApplicationContextPath()
     * @generated
     * @ordered
     */
	protected static final String APPLICATION_CONTEXT_PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getApplicationContextPath() <em>Application Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getApplicationContextPath()
     * @generated
     * @ordered
     */
	protected String applicationContextPath = APPLICATION_CONTEXT_PATH_EDEFAULT;

	/**
     * The default value of the '{@link #getServletUrlPattern() <em>Servlet Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServletUrlPattern()
     * @generated
     * @ordered
     */
	protected static final String SERVLET_URL_PATTERN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getServletUrlPattern() <em>Servlet Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServletUrlPattern()
     * @generated
     * @ordered
     */
	protected String servletUrlPattern = SERVLET_URL_PATTERN_EDEFAULT;

	/**
     * The default value of the '{@link #isDoNotRegenerateJspFiles() <em>Do Not Regenerate Jsp Files</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDoNotRegenerateJspFiles()
     * @generated
     * @ordered
     */
	protected static final boolean DO_NOT_REGENERATE_JSP_FILES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDoNotRegenerateJspFiles() <em>Do Not Regenerate Jsp Files</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDoNotRegenerateJspFiles()
     * @generated
     * @ordered
     */
	protected boolean doNotRegenerateJspFiles = DO_NOT_REGENERATE_JSP_FILES_EDEFAULT;

	/**
     * The default value of the '{@link #isGenerateJspFilesForOslcUI() <em>Generate Jsp Files For Oslc UI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGenerateJspFilesForOslcUI()
     * @generated
     * @ordered
     */
    protected static final boolean GENERATE_JSP_FILES_FOR_OSLC_UI_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isGenerateJspFilesForOslcUI() <em>Generate Jsp Files For Oslc UI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGenerateJspFilesForOslcUI()
     * @generated
     * @ordered
     */
    protected boolean generateJspFilesForOslcUI = GENERATE_JSP_FILES_FOR_OSLC_UI_EDEFAULT;

    /**
     * The cached value of the '{@link #getGeneralConfiguration() <em>General Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeneralConfiguration()
     * @generated
     * @ordered
     */
	protected GeneralConfiguration generalConfiguration;

	/**
     * The cached value of the '{@link #getProjectConfiguration() <em>Project Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProjectConfiguration()
     * @generated
     * @ordered
     */
	protected ProjectConfiguration projectConfiguration;

	/**
     * The cached value of the '{@link #getAuthenticationConfiguration() <em>Authentication Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAuthenticationConfiguration()
     * @generated
     * @ordered
     */
	protected AuthenticationConfiguration authenticationConfiguration;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ServerConfigurationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SERVER_CONFIGURATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getRootServerBaseUrl() {
        return rootServerBaseUrl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setRootServerBaseUrl(String newRootServerBaseUrl) {
        String oldRootServerBaseUrl = rootServerBaseUrl;
        rootServerBaseUrl = newRootServerBaseUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL, oldRootServerBaseUrl, rootServerBaseUrl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getApplicationContextPath() {
        return applicationContextPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setApplicationContextPath(String newApplicationContextPath) {
        String oldApplicationContextPath = applicationContextPath;
        applicationContextPath = newApplicationContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH, oldApplicationContextPath, applicationContextPath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getServletUrlPattern() {
        return servletUrlPattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setServletUrlPattern(String newServletUrlPattern) {
        String oldServletUrlPattern = servletUrlPattern;
        servletUrlPattern = newServletUrlPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN, oldServletUrlPattern, servletUrlPattern));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public boolean isDoNotRegenerateJspFiles() {
        return doNotRegenerateJspFiles;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setDoNotRegenerateJspFiles(boolean newDoNotRegenerateJspFiles) {
        boolean oldDoNotRegenerateJspFiles = doNotRegenerateJspFiles;
        doNotRegenerateJspFiles = newDoNotRegenerateJspFiles;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES, oldDoNotRegenerateJspFiles, doNotRegenerateJspFiles));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isGenerateJspFilesForOslcUI() {
        return generateJspFilesForOslcUI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenerateJspFilesForOslcUI(boolean newGenerateJspFilesForOslcUI) {
        boolean oldGenerateJspFilesForOslcUI = generateJspFilesForOslcUI;
        generateJspFilesForOslcUI = newGenerateJspFilesForOslcUI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI, oldGenerateJspFilesForOslcUI, generateJspFilesForOslcUI));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public GeneralConfiguration getGeneralConfiguration() {
        return generalConfiguration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetGeneralConfiguration(GeneralConfiguration newGeneralConfiguration, NotificationChain msgs) {
        GeneralConfiguration oldGeneralConfiguration = generalConfiguration;
        generalConfiguration = newGeneralConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION, oldGeneralConfiguration, newGeneralConfiguration);
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
    public void setGeneralConfiguration(GeneralConfiguration newGeneralConfiguration) {
        if (newGeneralConfiguration != generalConfiguration) {
            NotificationChain msgs = null;
            if (generalConfiguration != null)
                msgs = ((InternalEObject)generalConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
            if (newGeneralConfiguration != null)
                msgs = ((InternalEObject)newGeneralConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
            msgs = basicSetGeneralConfiguration(newGeneralConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION, newGeneralConfiguration, newGeneralConfiguration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ProjectConfiguration getProjectConfiguration() {
        return projectConfiguration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProjectConfiguration(ProjectConfiguration newProjectConfiguration, NotificationChain msgs) {
        ProjectConfiguration oldProjectConfiguration = projectConfiguration;
        projectConfiguration = newProjectConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION, oldProjectConfiguration, newProjectConfiguration);
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
    public void setProjectConfiguration(ProjectConfiguration newProjectConfiguration) {
        if (newProjectConfiguration != projectConfiguration) {
            NotificationChain msgs = null;
            if (projectConfiguration != null)
                msgs = ((InternalEObject)projectConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION, null, msgs);
            if (newProjectConfiguration != null)
                msgs = ((InternalEObject)newProjectConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION, null, msgs);
            msgs = basicSetProjectConfiguration(newProjectConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION, newProjectConfiguration, newProjectConfiguration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAuthenticationConfiguration(AuthenticationConfiguration newAuthenticationConfiguration, NotificationChain msgs) {
        AuthenticationConfiguration oldAuthenticationConfiguration = authenticationConfiguration;
        authenticationConfiguration = newAuthenticationConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION, oldAuthenticationConfiguration, newAuthenticationConfiguration);
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
    public void setAuthenticationConfiguration(AuthenticationConfiguration newAuthenticationConfiguration) {
        if (newAuthenticationConfiguration != authenticationConfiguration) {
            NotificationChain msgs = null;
            if (authenticationConfiguration != null)
                msgs = ((InternalEObject)authenticationConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION, null, msgs);
            if (newAuthenticationConfiguration != null)
                msgs = ((InternalEObject)newAuthenticationConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION, null, msgs);
            msgs = basicSetAuthenticationConfiguration(newAuthenticationConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION, newAuthenticationConfiguration, newAuthenticationConfiguration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
                return basicSetGeneralConfiguration(null, msgs);
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
                return basicSetProjectConfiguration(null, msgs);
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION:
                return basicSetAuthenticationConfiguration(null, msgs);
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
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL:
                return getRootServerBaseUrl();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH:
                return getApplicationContextPath();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN:
                return getServletUrlPattern();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES:
                return isDoNotRegenerateJspFiles();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI:
                return isGenerateJspFilesForOslcUI();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
                return getGeneralConfiguration();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
                return getProjectConfiguration();
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION:
                return getAuthenticationConfiguration();
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
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL:
                setRootServerBaseUrl((String)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH:
                setApplicationContextPath((String)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN:
                setServletUrlPattern((String)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES:
                setDoNotRegenerateJspFiles((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI:
                setGenerateJspFilesForOslcUI((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
                setGeneralConfiguration((GeneralConfiguration)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
                setProjectConfiguration((ProjectConfiguration)newValue);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION:
                setAuthenticationConfiguration((AuthenticationConfiguration)newValue);
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
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL:
                setRootServerBaseUrl(ROOT_SERVER_BASE_URL_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH:
                setApplicationContextPath(APPLICATION_CONTEXT_PATH_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN:
                setServletUrlPattern(SERVLET_URL_PATTERN_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES:
                setDoNotRegenerateJspFiles(DO_NOT_REGENERATE_JSP_FILES_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI:
                setGenerateJspFilesForOslcUI(GENERATE_JSP_FILES_FOR_OSLC_UI_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
                setGeneralConfiguration((GeneralConfiguration)null);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
                setProjectConfiguration((ProjectConfiguration)null);
                return;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION:
                setAuthenticationConfiguration((AuthenticationConfiguration)null);
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
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL:
                return ROOT_SERVER_BASE_URL_EDEFAULT == null ? rootServerBaseUrl != null : !ROOT_SERVER_BASE_URL_EDEFAULT.equals(rootServerBaseUrl);
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH:
                return APPLICATION_CONTEXT_PATH_EDEFAULT == null ? applicationContextPath != null : !APPLICATION_CONTEXT_PATH_EDEFAULT.equals(applicationContextPath);
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__SERVLET_URL_PATTERN:
                return SERVLET_URL_PATTERN_EDEFAULT == null ? servletUrlPattern != null : !SERVLET_URL_PATTERN_EDEFAULT.equals(servletUrlPattern);
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES:
                return doNotRegenerateJspFiles != DO_NOT_REGENERATE_JSP_FILES_EDEFAULT;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI:
                return generateJspFilesForOslcUI != GENERATE_JSP_FILES_FOR_OSLC_UI_EDEFAULT;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__GENERAL_CONFIGURATION:
                return generalConfiguration != null;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__PROJECT_CONFIGURATION:
                return projectConfiguration != null;
            case AdaptorinterfacePackage.SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION:
                return authenticationConfiguration != null;
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
        result.append(" (rootServerBaseUrl: ");
        result.append(rootServerBaseUrl);
        result.append(", applicationContextPath: ");
        result.append(applicationContextPath);
        result.append(", servletUrlPattern: ");
        result.append(servletUrlPattern);
        result.append(", doNotRegenerateJspFiles: ");
        result.append(doNotRegenerateJspFiles);
        result.append(", generateJspFilesForOslcUI: ");
        result.append(generateJspFilesForOslcUI);
        result.append(')');
        return result.toString();
    }

} //ServerConfigurationImpl
