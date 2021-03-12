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
import vocabulary.Property;
import vocabulary.Vocabulary;
import vocabulary.VocabularyConfiguration;
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
 *   <li>{@link vocabulary.impl.VocabularyImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link vocabulary.impl.VocabularyImpl#getConfiguration <em>Configuration</em>}</li>
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
     * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClasses()
     * @generated
     * @ordered
     */
    protected EList<vocabulary.Class> classes;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected VocabularyConfiguration configuration;

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
    @Override
    public String getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
    public String getPreferredNamespacePrefix() {
        return preferredNamespacePrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
    public EList<vocabulary.Class> getClasses() {
        if (classes == null) {
            classes = new EObjectContainmentEList<vocabulary.Class>(vocabulary.Class.class, this, VocabularyPackage.VOCABULARY__CLASSES);
        }
        return classes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, VocabularyPackage.VOCABULARY__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VocabularyConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfiguration(VocabularyConfiguration newConfiguration, NotificationChain msgs) {
        VocabularyConfiguration oldConfiguration = configuration;
        configuration = newConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__CONFIGURATION, oldConfiguration, newConfiguration);
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
    public void setConfiguration(VocabularyConfiguration newConfiguration) {
        if (newConfiguration != configuration) {
            NotificationChain msgs = null;
            if (configuration != null)
                msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY__CONFIGURATION, null, msgs);
            if (newConfiguration != null)
                msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY__CONFIGURATION, null, msgs);
            msgs = basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY__CONFIGURATION, newConfiguration, newConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VocabularyPackage.VOCABULARY__CLASSES:
                return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
            case VocabularyPackage.VOCABULARY__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case VocabularyPackage.VOCABULARY__CONFIGURATION:
                return basicSetConfiguration(null, msgs);
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
            case VocabularyPackage.VOCABULARY__CLASSES:
                return getClasses();
            case VocabularyPackage.VOCABULARY__PROPERTIES:
                return getProperties();
            case VocabularyPackage.VOCABULARY__CONFIGURATION:
                return getConfiguration();
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
            case VocabularyPackage.VOCABULARY__CLASSES:
                getClasses().clear();
                getClasses().addAll((Collection<? extends vocabulary.Class>)newValue);
                return;
            case VocabularyPackage.VOCABULARY__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case VocabularyPackage.VOCABULARY__CONFIGURATION:
                setConfiguration((VocabularyConfiguration)newValue);
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
            case VocabularyPackage.VOCABULARY__CLASSES:
                getClasses().clear();
                return;
            case VocabularyPackage.VOCABULARY__PROPERTIES:
                getProperties().clear();
                return;
            case VocabularyPackage.VOCABULARY__CONFIGURATION:
                setConfiguration((VocabularyConfiguration)null);
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
            case VocabularyPackage.VOCABULARY__CLASSES:
                return classes != null && !classes.isEmpty();
            case VocabularyPackage.VOCABULARY__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case VocabularyPackage.VOCABULARY__CONFIGURATION:
                return configuration != null;
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
