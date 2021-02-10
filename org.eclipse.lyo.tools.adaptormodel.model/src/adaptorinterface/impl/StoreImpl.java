/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Store;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.StoreImpl#getDefaultNamedGraph <em>Default Named Graph</em>}</li>
 *   <li>{@link adaptorinterface.impl.StoreImpl#getSparqlQueryEndpoint <em>Sparql Query Endpoint</em>}</li>
 *   <li>{@link adaptorinterface.impl.StoreImpl#getSparqlUpdateEndpoint <em>Sparql Update Endpoint</em>}</li>
 *   <li>{@link adaptorinterface.impl.StoreImpl#getInitialPoolSize <em>Initial Pool Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
    /**
     * The default value of the '{@link #getDefaultNamedGraph() <em>Default Named Graph</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultNamedGraph()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_NAMED_GRAPH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultNamedGraph() <em>Default Named Graph</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultNamedGraph()
     * @generated
     * @ordered
     */
    protected String defaultNamedGraph = DEFAULT_NAMED_GRAPH_EDEFAULT;

    /**
     * The default value of the '{@link #getSparqlQueryEndpoint() <em>Sparql Query Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSparqlQueryEndpoint()
     * @generated
     * @ordered
     */
    protected static final String SPARQL_QUERY_ENDPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSparqlQueryEndpoint() <em>Sparql Query Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSparqlQueryEndpoint()
     * @generated
     * @ordered
     */
    protected String sparqlQueryEndpoint = SPARQL_QUERY_ENDPOINT_EDEFAULT;

    /**
     * The default value of the '{@link #getSparqlUpdateEndpoint() <em>Sparql Update Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSparqlUpdateEndpoint()
     * @generated
     * @ordered
     */
    protected static final String SPARQL_UPDATE_ENDPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSparqlUpdateEndpoint() <em>Sparql Update Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSparqlUpdateEndpoint()
     * @generated
     * @ordered
     */
    protected String sparqlUpdateEndpoint = SPARQL_UPDATE_ENDPOINT_EDEFAULT;

    /**
     * The default value of the '{@link #getInitialPoolSize() <em>Initial Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialPoolSize()
     * @generated
     * @ordered
     */
    protected static final int INITIAL_POOL_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getInitialPoolSize() <em>Initial Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialPoolSize()
     * @generated
     * @ordered
     */
    protected int initialPoolSize = INITIAL_POOL_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.STORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDefaultNamedGraph() {
        return defaultNamedGraph;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefaultNamedGraph(String newDefaultNamedGraph) {
        String oldDefaultNamedGraph = defaultNamedGraph;
        defaultNamedGraph = newDefaultNamedGraph;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.STORE__DEFAULT_NAMED_GRAPH, oldDefaultNamedGraph, defaultNamedGraph));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSparqlQueryEndpoint() {
        return sparqlQueryEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSparqlQueryEndpoint(String newSparqlQueryEndpoint) {
        String oldSparqlQueryEndpoint = sparqlQueryEndpoint;
        sparqlQueryEndpoint = newSparqlQueryEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.STORE__SPARQL_QUERY_ENDPOINT, oldSparqlQueryEndpoint, sparqlQueryEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSparqlUpdateEndpoint() {
        return sparqlUpdateEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSparqlUpdateEndpoint(String newSparqlUpdateEndpoint) {
        String oldSparqlUpdateEndpoint = sparqlUpdateEndpoint;
        sparqlUpdateEndpoint = newSparqlUpdateEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.STORE__SPARQL_UPDATE_ENDPOINT, oldSparqlUpdateEndpoint, sparqlUpdateEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getInitialPoolSize() {
        return initialPoolSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialPoolSize(int newInitialPoolSize) {
        int oldInitialPoolSize = initialPoolSize;
        initialPoolSize = newInitialPoolSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.STORE__INITIAL_POOL_SIZE, oldInitialPoolSize, initialPoolSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.STORE__DEFAULT_NAMED_GRAPH:
                return getDefaultNamedGraph();
            case AdaptorinterfacePackage.STORE__SPARQL_QUERY_ENDPOINT:
                return getSparqlQueryEndpoint();
            case AdaptorinterfacePackage.STORE__SPARQL_UPDATE_ENDPOINT:
                return getSparqlUpdateEndpoint();
            case AdaptorinterfacePackage.STORE__INITIAL_POOL_SIZE:
                return getInitialPoolSize();
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
            case AdaptorinterfacePackage.STORE__DEFAULT_NAMED_GRAPH:
                setDefaultNamedGraph((String)newValue);
                return;
            case AdaptorinterfacePackage.STORE__SPARQL_QUERY_ENDPOINT:
                setSparqlQueryEndpoint((String)newValue);
                return;
            case AdaptorinterfacePackage.STORE__SPARQL_UPDATE_ENDPOINT:
                setSparqlUpdateEndpoint((String)newValue);
                return;
            case AdaptorinterfacePackage.STORE__INITIAL_POOL_SIZE:
                setInitialPoolSize((Integer)newValue);
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
            case AdaptorinterfacePackage.STORE__DEFAULT_NAMED_GRAPH:
                setDefaultNamedGraph(DEFAULT_NAMED_GRAPH_EDEFAULT);
                return;
            case AdaptorinterfacePackage.STORE__SPARQL_QUERY_ENDPOINT:
                setSparqlQueryEndpoint(SPARQL_QUERY_ENDPOINT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.STORE__SPARQL_UPDATE_ENDPOINT:
                setSparqlUpdateEndpoint(SPARQL_UPDATE_ENDPOINT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.STORE__INITIAL_POOL_SIZE:
                setInitialPoolSize(INITIAL_POOL_SIZE_EDEFAULT);
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
            case AdaptorinterfacePackage.STORE__DEFAULT_NAMED_GRAPH:
                return DEFAULT_NAMED_GRAPH_EDEFAULT == null ? defaultNamedGraph != null : !DEFAULT_NAMED_GRAPH_EDEFAULT.equals(defaultNamedGraph);
            case AdaptorinterfacePackage.STORE__SPARQL_QUERY_ENDPOINT:
                return SPARQL_QUERY_ENDPOINT_EDEFAULT == null ? sparqlQueryEndpoint != null : !SPARQL_QUERY_ENDPOINT_EDEFAULT.equals(sparqlQueryEndpoint);
            case AdaptorinterfacePackage.STORE__SPARQL_UPDATE_ENDPOINT:
                return SPARQL_UPDATE_ENDPOINT_EDEFAULT == null ? sparqlUpdateEndpoint != null : !SPARQL_UPDATE_ENDPOINT_EDEFAULT.equals(sparqlUpdateEndpoint);
            case AdaptorinterfacePackage.STORE__INITIAL_POOL_SIZE:
                return initialPoolSize != INITIAL_POOL_SIZE_EDEFAULT;
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
        result.append(" (defaultNamedGraph: ");
        result.append(defaultNamedGraph);
        result.append(", sparqlQueryEndpoint: ");
        result.append(sparqlQueryEndpoint);
        result.append(", sparqlUpdateEndpoint: ");
        result.append(sparqlUpdateEndpoint);
        result.append(", initialPoolSize: ");
        result.append(initialPoolSize);
        result.append(')');
        return result.toString();
    }

} //StoreImpl
