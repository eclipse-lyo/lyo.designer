/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.GeneralConfiguration;
import adaptorinterface.ProjectConfiguration;
import adaptorinterface.SpecificationConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.SpecificationConfigurationImpl#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link adaptorinterface.impl.SpecificationConfigurationImpl#getProjectConfiguration <em>Project Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecificationConfigurationImpl extends MinimalEObjectImpl.Container implements SpecificationConfiguration {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.SPECIFICATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION, oldGeneralConfiguration, newGeneralConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralConfiguration(GeneralConfiguration newGeneralConfiguration) {
		if (newGeneralConfiguration != generalConfiguration) {
			NotificationChain msgs = null;
			if (generalConfiguration != null)
				msgs = ((InternalEObject)generalConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
			if (newGeneralConfiguration != null)
				msgs = ((InternalEObject)newGeneralConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION, null, msgs);
			msgs = basicSetGeneralConfiguration(newGeneralConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION, newGeneralConfiguration, newGeneralConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION, oldProjectConfiguration, newProjectConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectConfiguration(ProjectConfiguration newProjectConfiguration) {
		if (newProjectConfiguration != projectConfiguration) {
			NotificationChain msgs = null;
			if (projectConfiguration != null)
				msgs = ((InternalEObject)projectConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION, null, msgs);
			if (newProjectConfiguration != null)
				msgs = ((InternalEObject)newProjectConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION, null, msgs);
			msgs = basicSetProjectConfiguration(newProjectConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION, newProjectConfiguration, newProjectConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION:
				return basicSetGeneralConfiguration(null, msgs);
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION:
				return basicSetProjectConfiguration(null, msgs);
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
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION:
				return getGeneralConfiguration();
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION:
				return getProjectConfiguration();
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
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION:
				setGeneralConfiguration((GeneralConfiguration)newValue);
				return;
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION:
				setProjectConfiguration((ProjectConfiguration)newValue);
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
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION:
				setGeneralConfiguration((GeneralConfiguration)null);
				return;
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION:
				setProjectConfiguration((ProjectConfiguration)null);
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
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION:
				return generalConfiguration != null;
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION:
				return projectConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationConfigurationImpl
