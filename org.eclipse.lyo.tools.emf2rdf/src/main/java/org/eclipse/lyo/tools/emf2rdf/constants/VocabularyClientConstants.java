/*******************************************************************************
 * Copyright (c) 2018 Yash Khatri.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Yash Khatri       - initial API and implementation and/or initial documentation
 * 
 *******************************************************************************/

package org.eclipse.lyo.tools.emf2rdf.constants;


/**
 * 
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0
 *        <p>
 *        This interface contains the constants used in the application.
 */

public interface VocabularyClientConstants {
    // Start of user code user constants
    public static String OAS_DOMAIN = "http://rdf.scania.com/ns/oas#";
    public static String OAS_NAMSPACE = "http://rdf.scania.com/ns/oas#";
    public static String OAS_NAMSPACE_PREFIX = "oas";

    public static final String TOOLCHAIN_INTERFACE = "Toolchain";
    public static final String VOCABULARIES_INTERFACE = "Vocabularies";
    public static final String SPECIFICATION_INTERFACE = "Specification";
    
    public static final String TOOLCHAIN_IMPL = "ToolchainImpl";
    public static final String VOCABULARIES_IMPL = "VocabulariesImpl";
    public static final String SPECIFICATION_IMPL = "SpecificationImpl";

    public static final String XSD_DOMAIN = "http://www.w3.org/2001/XMLSchema#";
    public static final String XSD_NAMESPACE = "http://www.w3.org/2001/XMLSchema#";
    public static final String XSD_NAMESPACE_PREFIX = "xsd";

    // End of user code

    public static String DUBLIN_CORE_DOMAIN = "http://purl.org/dc/terms/";
    public static String DUBLIN_CORE_NAMSPACE = "http://purl.org/dc/terms/";
    public static String DUBLIN_CORE_NAMSPACE_PREFIX = "dcterms";
    public static String OWL_DOMAIN = "http://www.w3.org/2002/07/owl#";
    public static String OWL_NAMSPACE = "http://www.w3.org/2002/07/owl#";
    public static String OWL_NAMSPACE_PREFIX = "owl";
    public static String RDF_DOMAIN = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
    public static String RDF_NAMSPACE = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
    public static String RDF_NAMSPACE_PREFIX = "rdf";
    public static String RDFS_DOMAIN = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE_PREFIX = "rdfs";
    public static String VANN_DOMAIN = "http://purl.org/vocab/vann/";
    public static String VANN_NAMSPACE = "http://purl.org/vocab/vann/";
    public static String VANN_NAMSPACE_PREFIX = "vann";

    public static String RDFSCLASS = "Class";
    public static String PATH_RDFSCLASS = "Class";
    public static String TYPE_RDFSCLASS = RDFS_NAMSPACE + "Class";
    public static String ONTOLOGY = "Ontology";
    public static String PATH_ONTOLOGY = "ontology";
    public static String TYPE_ONTOLOGY = OWL_NAMSPACE + "ontology";
    public static String PROPERTY = "Property";
    public static String PATH_PROPERTY = "property";
    public static String TYPE_PROPERTY = RDF_NAMSPACE + "property";
    public static String TERM = "Term";
    public static String PATH_TERM = "term";
    public static String TYPE_TERM = RDFS_NAMSPACE + "term";
    public static String VOCABULARIES = "Vocabularies";
    public static String PATH_VOCABULARIES = "vocabularies";
    public static String TYPE_VOCABULARIES = OWL_NAMSPACE + "vocabularies";

    public static final String HDR_OSLC_VERSION = "OSLC-Core-Version";
    public static final String OSLC_VERSION_V2 = "2.0";

}
