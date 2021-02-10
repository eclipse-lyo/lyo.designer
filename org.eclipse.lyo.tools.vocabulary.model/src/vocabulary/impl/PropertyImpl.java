/**
 */
package vocabulary.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vocabulary.Property;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.impl.PropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link vocabulary.impl.PropertyImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link vocabulary.impl.PropertyImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends TermImpl implements Property {
    /**
     * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPropertyOf()
     * @generated
     * @ordered
     */
    protected EList<Property> subPropertyOf;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected EList<vocabulary.Class> domain;

    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected EList<vocabulary.Class> range;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VocabularyPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Property> getSubPropertyOf() {
        if (subPropertyOf == null) {
            subPropertyOf = new EObjectResolvingEList<Property>(Property.class, this, VocabularyPackage.PROPERTY__SUB_PROPERTY_OF);
        }
        return subPropertyOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<vocabulary.Class> getDomain() {
        if (domain == null) {
            domain = new EObjectResolvingEList<vocabulary.Class>(vocabulary.Class.class, this, VocabularyPackage.PROPERTY__DOMAIN);
        }
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<vocabulary.Class> getRange() {
        if (range == null) {
            range = new EObjectResolvingEList<vocabulary.Class>(vocabulary.Class.class, this, VocabularyPackage.PROPERTY__RANGE);
        }
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VocabularyPackage.PROPERTY__SUB_PROPERTY_OF:
                return getSubPropertyOf();
            case VocabularyPackage.PROPERTY__DOMAIN:
                return getDomain();
            case VocabularyPackage.PROPERTY__RANGE:
                return getRange();
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
            case VocabularyPackage.PROPERTY__SUB_PROPERTY_OF:
                getSubPropertyOf().clear();
                getSubPropertyOf().addAll((Collection<? extends Property>)newValue);
                return;
            case VocabularyPackage.PROPERTY__DOMAIN:
                getDomain().clear();
                getDomain().addAll((Collection<? extends vocabulary.Class>)newValue);
                return;
            case VocabularyPackage.PROPERTY__RANGE:
                getRange().clear();
                getRange().addAll((Collection<? extends vocabulary.Class>)newValue);
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
            case VocabularyPackage.PROPERTY__SUB_PROPERTY_OF:
                getSubPropertyOf().clear();
                return;
            case VocabularyPackage.PROPERTY__DOMAIN:
                getDomain().clear();
                return;
            case VocabularyPackage.PROPERTY__RANGE:
                getRange().clear();
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
            case VocabularyPackage.PROPERTY__SUB_PROPERTY_OF:
                return subPropertyOf != null && !subPropertyOf.isEmpty();
            case VocabularyPackage.PROPERTY__DOMAIN:
                return domain != null && !domain.isEmpty();
            case VocabularyPackage.PROPERTY__RANGE:
                return range != null && !range.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PropertyImpl
