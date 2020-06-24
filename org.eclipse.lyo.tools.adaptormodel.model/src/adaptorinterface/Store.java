/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Store#getDefaultNamedGraph <em>Default Named Graph</em>}</li>
 *   <li>{@link adaptorinterface.Store#getSparqlQueryEndpoint <em>Sparql Query Endpoint</em>}</li>
 *   <li>{@link adaptorinterface.Store#getSparqlUpdateEndpoint <em>Sparql Update Endpoint</em>}</li>
 *   <li>{@link adaptorinterface.Store#getInitialPoolSize <em>Initial Pool Size</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
    /**
     * Returns the value of the '<em><b>Default Named Graph</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Named Graph</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Named Graph</em>' attribute.
     * @see #setDefaultNamedGraph(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getStore_DefaultNamedGraph()
     * @model required="true"
     * @generated
     */
    String getDefaultNamedGraph();

    /**
     * Sets the value of the '{@link adaptorinterface.Store#getDefaultNamedGraph <em>Default Named Graph</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Named Graph</em>' attribute.
     * @see #getDefaultNamedGraph()
     * @generated
     */
    void setDefaultNamedGraph(String value);

    /**
     * Returns the value of the '<em><b>Sparql Query Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sparql Query Endpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sparql Query Endpoint</em>' attribute.
     * @see #setSparqlQueryEndpoint(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getStore_SparqlQueryEndpoint()
     * @model required="true"
     * @generated
     */
    String getSparqlQueryEndpoint();

    /**
     * Sets the value of the '{@link adaptorinterface.Store#getSparqlQueryEndpoint <em>Sparql Query Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sparql Query Endpoint</em>' attribute.
     * @see #getSparqlQueryEndpoint()
     * @generated
     */
    void setSparqlQueryEndpoint(String value);

    /**
     * Returns the value of the '<em><b>Sparql Update Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sparql Update Endpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sparql Update Endpoint</em>' attribute.
     * @see #setSparqlUpdateEndpoint(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getStore_SparqlUpdateEndpoint()
     * @model required="true"
     * @generated
     */
    String getSparqlUpdateEndpoint();

    /**
     * Sets the value of the '{@link adaptorinterface.Store#getSparqlUpdateEndpoint <em>Sparql Update Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sparql Update Endpoint</em>' attribute.
     * @see #getSparqlUpdateEndpoint()
     * @generated
     */
    void setSparqlUpdateEndpoint(String value);

    /**
     * Returns the value of the '<em><b>Initial Pool Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Pool Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Pool Size</em>' attribute.
     * @see #setInitialPoolSize(int)
     * @see adaptorinterface.AdaptorinterfacePackage#getStore_InitialPoolSize()
     * @model required="true"
     * @generated
     */
    int getInitialPoolSize();

    /**
     * Sets the value of the '{@link adaptorinterface.Store#getInitialPoolSize <em>Initial Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Pool Size</em>' attribute.
     * @see #getInitialPoolSize()
     * @generated
     */
    void setInitialPoolSize(int value);

} // Store
