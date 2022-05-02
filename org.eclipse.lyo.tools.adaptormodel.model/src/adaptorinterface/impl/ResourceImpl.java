/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.net.URI;
import javax.xml.namespace.QName;
import adaptorinterface.DomainSpecification;
import vocabulary.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getResourceProperties <em>Resource Properties</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getAdditionalConstraints <em>Additional Constraints</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getVocabularyComment <em>Vocabulary Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends ShapeImpl implements Resource {
	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

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
     * The cached value of the '{@link #getDescribes() <em>Describes</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescribes()
     * @generated
     * @ordered
     */
	protected vocabulary.Class describes;

	/**
     * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExtends()
     * @generated
     * @ordered
     */
	protected EList<Resource> extends_;

	/**
     * The cached value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResourceProperties()
     * @generated
     * @ordered
     */
	protected EList<ResourceProperty> resourceProperties;

	/**
     * The cached value of the '{@link #getAdditionalConstraints() <em>Additional Constraints</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalConstraints()
     * @generated
     * @ordered
     */
    protected EList<String> additionalConstraints;

    /**
     * The default value of the '{@link #getVocabularyComment() <em>Vocabulary Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVocabularyComment()
     * @generated
     * @ordered
     */
    protected static final String VOCABULARY_COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVocabularyComment() <em>Vocabulary Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVocabularyComment()
     * @generated
     * @ordered
     */
    protected String vocabularyComment = VOCABULARY_COMMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ResourceImpl() {
        super();
    }

    @Override
    public QName deduceDescribes() {
        if (null != this.getDescribes()) {
            Vocabulary v = (Vocabulary)this.getDescribes().eContainer();
            return new QName(v.getNamespaceURI(), this.getDescribes().getName(), v.getPreferredNamespacePrefix());
        }
        DomainSpecification ds = (DomainSpecification)this.eContainer();
        QName deducedVocabulary = ds.deduceVocabulary();
        return new QName(deducedVocabulary.getNamespaceURI(), this.getName(), deducedVocabulary.getPrefix());
    }

    @Override
    public URI deduceDescribesAsUri () {
        //I Cannot use UriBuilder to construct the URI since the "#" in the paths gets lost.
        //return UriBuilder.fromUri(v.getNamespaceURI()).path(resource.getDescribes().getName()).build().toString();
        QName qName = deduceDescribes();
        return URI.create(qName.getNamespaceURI() + qName.getLocalPart());
    }


    @Override
    public String deduceDescribesComment() {
        if (null != this.getDescribes()) {
            return this.getDescribes().getComment();
        }
        return this.getVocabularyComment();
    }

    @Override
    public URI getResourceShapeURI() {
        return java.net.URI.create(((DomainSpecification)this.eContainer()).getNamespaceURI() + this.getName());
    }
    
    @Override
    public String toString (Boolean withShapeLabel, Boolean withPrefix) {
        String s = "";
        if (withShapeLabel) {
            DomainSpecification ds = (DomainSpecification)this.eContainer();
            s += (withPrefix ? ds.getNamespacePrefix().getName() + ":" : "");
            s += this.getName();
        }
        else {
            s += (withPrefix ? this.deduceDescribes().getPrefix() + ":" : "");
            s += this.deduceDescribes().getLocalPart();
            
        }
        return s;
    }


	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.RESOURCE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * EclipseLyo: creating the id once it is null
     */
    public String getId() {
        if (null == id) {
            id = org.eclipse.emf.ecore.util.EcoreUtil.generateUUID();
        }
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__ID, oldId, id));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__TITLE, oldTitle, title));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Resource> getExtends() {
        if (extends_ == null) {
            extends_ = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.RESOURCE__EXTENDS);
        }
        return extends_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<ResourceProperty> getResourceProperties() {
        if (resourceProperties == null) {
            resourceProperties = new EObjectResolvingEList<ResourceProperty>(ResourceProperty.class, this, AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES);
        }
        return resourceProperties;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getAdditionalConstraints() {
        if (additionalConstraints == null) {
            additionalConstraints = new EDataTypeUniqueEList<String>(String.class, this, AdaptorinterfacePackage.RESOURCE__ADDITIONAL_CONSTRAINTS);
        }
        return additionalConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVocabularyComment() {
        return vocabularyComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVocabularyComment(String newVocabularyComment) {
        String oldVocabularyComment = vocabularyComment;
        vocabularyComment = newVocabularyComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__VOCABULARY_COMMENT, oldVocabularyComment, vocabularyComment));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public vocabulary.Class getDescribes() {
        if (describes != null && describes.eIsProxy()) {
            InternalEObject oldDescribes = (InternalEObject)describes;
            describes = (vocabulary.Class)eResolveProxy(oldDescribes);
            if (describes != oldDescribes) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.RESOURCE__DESCRIBES, oldDescribes, describes));
            }
        }
        return describes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public vocabulary.Class basicGetDescribes() {
        return describes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setDescribes(vocabulary.Class newDescribes) {
        vocabulary.Class oldDescribes = describes;
        describes = newDescribes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__DESCRIBES, oldDescribes, describes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.RESOURCE__ID:
                return getId();
            case AdaptorinterfacePackage.RESOURCE__NAME:
                return getName();
            case AdaptorinterfacePackage.RESOURCE__TITLE:
                return getTitle();
            case AdaptorinterfacePackage.RESOURCE__DESCRIPTION:
                return getDescription();
            case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
                if (resolve) return getDescribes();
                return basicGetDescribes();
            case AdaptorinterfacePackage.RESOURCE__EXTENDS:
                return getExtends();
            case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
                return getResourceProperties();
            case AdaptorinterfacePackage.RESOURCE__ADDITIONAL_CONSTRAINTS:
                return getAdditionalConstraints();
            case AdaptorinterfacePackage.RESOURCE__VOCABULARY_COMMENT:
                return getVocabularyComment();
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                setId((String)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__NAME:
                setName((String)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__TITLE:
                setTitle((String)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
                setDescribes((vocabulary.Class)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__EXTENDS:
                getExtends().clear();
                getExtends().addAll((Collection<? extends Resource>)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
                getResourceProperties().clear();
                getResourceProperties().addAll((Collection<? extends ResourceProperty>)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__ADDITIONAL_CONSTRAINTS:
                getAdditionalConstraints().clear();
                getAdditionalConstraints().addAll((Collection<? extends String>)newValue);
                return;
            case AdaptorinterfacePackage.RESOURCE__VOCABULARY_COMMENT:
                setVocabularyComment((String)newValue);
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                setId(ID_EDEFAULT);
                return;
            case AdaptorinterfacePackage.RESOURCE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.RESOURCE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.RESOURCE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
                setDescribes((vocabulary.Class)null);
                return;
            case AdaptorinterfacePackage.RESOURCE__EXTENDS:
                getExtends().clear();
                return;
            case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
                getResourceProperties().clear();
                return;
            case AdaptorinterfacePackage.RESOURCE__ADDITIONAL_CONSTRAINTS:
                getAdditionalConstraints().clear();
                return;
            case AdaptorinterfacePackage.RESOURCE__VOCABULARY_COMMENT:
                setVocabularyComment(VOCABULARY_COMMENT_EDEFAULT);
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case AdaptorinterfacePackage.RESOURCE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AdaptorinterfacePackage.RESOURCE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case AdaptorinterfacePackage.RESOURCE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
                return describes != null;
            case AdaptorinterfacePackage.RESOURCE__EXTENDS:
                return extends_ != null && !extends_.isEmpty();
            case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
                return resourceProperties != null && !resourceProperties.isEmpty();
            case AdaptorinterfacePackage.RESOURCE__ADDITIONAL_CONSTRAINTS:
                return additionalConstraints != null && !additionalConstraints.isEmpty();
            case AdaptorinterfacePackage.RESOURCE__VOCABULARY_COMMENT:
                return VOCABULARY_COMMENT_EDEFAULT == null ? vocabularyComment != null : !VOCABULARY_COMMENT_EDEFAULT.equals(vocabularyComment);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", title: ");
        result.append(title);
        result.append(", description: ");
        result.append(description);
        result.append(", additionalConstraints: ");
        result.append(additionalConstraints);
        result.append(", vocabularyComment: ");
        result.append(vocabularyComment);
        result.append(')');
        return result.toString();
    }

} //ResourceImpl
