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

/**
 * The Class VocabularyJenaBuilder.
 *
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

package org.eclipse.lyo.tools.emf2rdf.jenabuilder;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.rdf.model.Statement;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.tools.emf2rdf.helper.Utils;
import org.eclipse.lyo.tools.emf2rdf.resources.Ontology;
import org.eclipse.lyo.tools.emf2rdf.resources.Property;
import org.eclipse.lyo.tools.emf2rdf.resources.RdfDomainConstants;
import org.eclipse.lyo.tools.emf2rdf.resources.RdfsClass;
import org.eclipse.lyo.tools.emf2rdf.resources.RdfsDomainConstants;
import org.eclipse.lyo.tools.emf2rdf.resources.Term;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import vocabulary.Class;
import vocabulary.Vocabularies;
import vocabulary.Vocabulary;

/**
 * <p>
 * This class contains code for creating the JenaModel from the Vocabularies in
 * the vocabulary.xmi file in the lyo modeler.
 * 
 * It iterates over all the vocabularies and the terms inside respective
 * vocabularies and with the help of JenaModelHelper creates the JenaModel for
 * them.
 *
 */

public class VocabularyJenaBuilder {

    private static final String CLASSIMPL = "ClassImpl";
    private static final Logger LOGGER = LoggerFactory.getLogger(VocabularyJenaBuilder.class);

    /**
     * <p>
     * This method is used for building the JenaModel for the {@link Vocabularies}
     * and respective {@link Term}. The terms can be a {@link Clazz} or a
     * {@link vocabulary.Property}.
     *
     * @param vocabularies
     *            The vocabularies inside the <i>.xmi</i> file.
     * @return {@link Model}
     */

    public Model buildJenaModel(Vocabularies vocabularies)
            throws URISyntaxException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            DatatypeConfigurationException, OslcCoreApplicationException {
        LOGGER.debug("building jenamodel for \"{}\" vocabularies", vocabularies.getVocabularies().size());

        Model outModel = buildJenaModelInternal(vocabularies, null);

        LOGGER.info("building jenamodel completed. returning jenamodel: \"{}\" ", outModel);
        return outModel;
    }

    private Model buildJenaModelInternal(Vocabularies vocabularies, List<IResource> resources)
            throws URISyntaxException, DatatypeConfigurationException, IllegalAccessException,
            InvocationTargetException, OslcCoreApplicationException {

        Ontology ontology = null;
        Model outModel = ModelFactory.createDefaultModel();

        for (Iterator<Vocabulary> vocabularyIterator = vocabularies.getVocabularies().iterator(); vocabularyIterator
                .hasNext();) {

            Vocabulary vocabulary = vocabularyIterator.next();
            ontology = createVocabularyResource(vocabulary);

            if (null != resources) {
                resources.add(ontology);
            } else {
                outModel.setNsPrefixes(getNameSpacePrefixes(vocabulary));
                outModel.add(JenaModelHelper.createJenaModel(new Object[] { ontology }));
            }
            LOGGER.info("Added ontology: \"{}\" to output jena model.", ontology.getNamespaceURI());

            for (Iterator<vocabulary.Class> vocabularyTermsIterator = vocabulary.getClasses()
                    .iterator(); vocabularyTermsIterator.hasNext();) {

                vocabulary.Term term = vocabularyTermsIterator.next();
                RdfsClass rdfsClass = (RdfsClass) createTermResource(term, vocabulary);

                // TODO: Check if type is duplicate when type is specified explicitly.
                if (null != resources) {
                    resources.add(rdfsClass);
                } else {
                    LOGGER.info("Added class: \"{}\" to output jena model.", rdfsClass.getName());
                    Model tempModel = JenaModelHelper.createJenaModel(new Object[] { rdfsClass });
                    if (rdfsClass.getType() != null) {
                        removeDuplicateTypeProperty(rdfsClass, tempModel);
                    }
                    outModel.add(tempModel);
                    tempModel.removeAll();
                }
            }

            for (Iterator<vocabulary.Property> vocabularyTermsIterator = vocabulary.getProperties()
                    .iterator(); vocabularyTermsIterator.hasNext();) {

                vocabulary.Term term = vocabularyTermsIterator.next();
                Property property = (Property) createTermResource(term, vocabulary);

                LOGGER.info("Added property: \"{}\" to output jena model.", property.getName());
                outModel.add(JenaModelHelper.createJenaModel(new Object[] { property }));
            }

        }
        return outModel;
    }

    public List<IResource> getOSLCResources(Vocabularies vocabularies)
            throws IllegalAccessException, InvocationTargetException, URISyntaxException,
            DatatypeConfigurationException, OslcCoreApplicationException {
        List<IResource> resources = Lists.newArrayList();
        buildJenaModelInternal(vocabularies, resources);
        return resources;
    }

    private void removeDuplicateTypeProperty(RdfsClass rdfsClass, Model tempModel) {

        org.apache.jena.rdf.model.Property typeProperty = ResourceFactory
                .createProperty(RdfDomainConstants.RDF_NAMSPACE + "type");
        Resource subject = ResourceFactory.createResource(rdfsClass.getAbout().toString());
        Node node = NodeFactory.createURI(RdfsDomainConstants.CLASS_TYPE);
        RDFNode typeObject = tempModel.getRDFNode(node);

        Statement stat = tempModel.createLiteralStatement(subject, typeProperty, typeObject);
        tempModel.remove(stat);
    }

    /**
     * <p>
     * This method is used for populating the {@link Ontology} object with the
     * properties of {@link Vocabularies}
     *
     * @param vocabulary
     *            the vocabulary
     * @return the ontology
     * @throws URISyntaxException
     *             Throws {@link URISyntaxException} if the syntax of
     *             <code> namespaceURI</code> of {@link vocabulary} is not valid.
     */
    private Ontology createVocabularyResource(Vocabulary vocabulary) throws URISyntaxException {

        LOGGER.info("creating vocabulary resource for \"{}\" ", vocabulary.getNamespaceURI());

        Ontology ontology = new Ontology();

        if (!Strings.isNullOrEmpty(vocabulary.getNamespaceURI())) {
            ontology.setAbout(new URI(Utils.validateURL(vocabulary.getNamespaceURI().replace("#", ""))));
        }

        if (!Strings.isNullOrEmpty(vocabulary.getLabel())) {
            ontology.setLabel(vocabulary.getLabel());
            ontology.setTitle(vocabulary.getLabel());
        }

        if (!Strings.isNullOrEmpty(vocabulary.getDescription()))
            ontology.setDescription(vocabulary.getDescription());

        if (!Strings.isNullOrEmpty(vocabulary.getSource()))
            ontology.setSource(new URI(Utils.validateURL(vocabulary.getSource())));

        if (!Strings.isNullOrEmpty(vocabulary.getPreferredNamespacePrefix()))
            ontology.setPrefix(vocabulary.getPreferredNamespacePrefix());

        LOGGER.info("vocabulary resource \"{}\" created. returning ontology object: \"{}\" ", vocabulary.getNamespaceURI(),
                ontology);
        return ontology;
    }

    /**
     * <p>
     * This method is used for populating the {@link Term} object with the
     * properties of {@link vocabulary.Term}.
     *
     * @param term
     *            {@link vocabulary.Term}
     * @param vocabulary
     *            {@link vocabulary}
     * @return {@link Term}
     * 
     * @throws URISyntaxException
     *             Throws {@link URISyntaxException} if the syntax of
     *             <code> namespaceURI</code> of {@link vocabulary} is not valid.
     */
    private Term createTermResource(vocabulary.Term term, Vocabulary vocabulary) throws URISyntaxException {

        LOGGER.info("creating vocabulary term resource for \"{}\" ", term.getName());

        Term term2 = null;
        if (CLASSIMPL.equalsIgnoreCase(term.getClass().getSimpleName())) {
            term2 = new RdfsClass();
        } else {
            term2 = new Property();
        }

        if (!Strings.isNullOrEmpty(term.getName()) && !Strings.isNullOrEmpty(vocabulary.getNamespaceURI())) {
            term2.setAbout(
                    new URI(vocabulary.getNamespaceURI().endsWith("#") ? vocabulary.getNamespaceURI() + term.getName()
                            : vocabulary.getNamespaceURI() + "#" + term.getName()));
            term2.setName(term.getName());
        }

        if (!Strings.isNullOrEmpty(term.getLabel())) {
            term2.setLabel(term.getLabel());
        }

        if (!Strings.isNullOrEmpty(term.getComment())) {
            term2.setComment(term.getComment());
        }

        if (!Strings.isNullOrEmpty(term.getSeeAlso())) {
            term2.setSeeAlso(new URI(Utils.validateURL(term.getSeeAlso())));
        }

        if (!Strings.isNullOrEmpty(vocabulary.getSource())) {
            // TODO: Check of the format is not correct.
            // org.eclipse.lyo.oslc4j.core.exception.OslcCoreRelativeURIException is thrown
            // if the format is incorrect.
            // from JenaModelHelper.
            term2.setIsDefinedBy(new URI(Utils.validateURL(vocabulary.getSource())));
        }

        // If the term is of type Class; Type casting term to Class for populating
        // subClassOf property which is not in Term.
        if (CLASSIMPL.equalsIgnoreCase(term.getClass().getSimpleName())) {
            RdfsClass rdfsClass = (RdfsClass) term2;
            Class clazz = (Class) term;

            for (Iterator<Class> iterator = clazz.getSubClassOf().iterator(); iterator.hasNext();) {
                Class clazz2 = iterator.next();
                Vocabulary vocabulary2 = (Vocabulary) clazz2.eContainer();

                rdfsClass.addSubClassOf(new Link(new URI(
                        vocabulary2.getNamespaceURI().endsWith("#") ? vocabulary2.getNamespaceURI() + clazz2.getName()
                                : vocabulary2.getNamespaceURI() + "#" + clazz2.getName())));
            }

            // TODO: Type property explicitly given?

            if (clazz.getType() != null) {
                rdfsClass.setType(new Link(new URI(vocabulary.getNamespaceURI().endsWith("#")
                        ? vocabulary.getNamespaceURI() + clazz.getType().getName()
                        : vocabulary.getNamespaceURI() + "#" + clazz.getType().getName())));
            }

        } else {
            // If the term is of type vocabulary.Property; Type casting term to
            // vocabulary.Property for populating
            // subPropertyOf property which is not in Term.
            Property property = (Property) term2;
            vocabulary.Property vocabularyProperty = (vocabulary.Property) term;

            for (Iterator<vocabulary.Property> iterator = vocabularyProperty.getSubPropertyOf().iterator(); iterator
                    .hasNext();) {
                vocabulary.Property vocabularyProperty2 = iterator.next();
                Vocabulary vocabulary2 = (Vocabulary) vocabularyProperty2.eContainer();

                property.addSubPropertyOf(new Link(new URI(vocabulary2.getNamespaceURI().endsWith("#")
                        ? vocabulary2.getNamespaceURI() + vocabularyProperty2.getName()
                        : vocabulary2.getNamespaceURI() + "#" + vocabularyProperty2.getName())));
            }

            for (Iterator<vocabulary.Class> iterator = vocabularyProperty.getDomain().iterator(); iterator.hasNext();) {
                vocabulary.Class domainClass = iterator.next();
                Vocabulary vocabularyOfDomainClass = (Vocabulary) domainClass.eContainer();

                property.addDomain(new Link(new URI(vocabularyOfDomainClass.getNamespaceURI().endsWith("#")
                        ? vocabularyOfDomainClass.getNamespaceURI() + domainClass.getName()
                        : vocabularyOfDomainClass.getNamespaceURI() + "#" + domainClass.getName())));
            }

            for (Iterator<vocabulary.Class> iterator = vocabularyProperty.getRange().iterator(); iterator.hasNext();) {
                vocabulary.Class rangeClass = iterator.next();
                Vocabulary vocabularyOfRangeClass = (Vocabulary) rangeClass.eContainer();

                property.addRange(new Link(new URI(vocabularyOfRangeClass.getNamespaceURI().endsWith("#")
                        ? vocabularyOfRangeClass.getNamespaceURI() + rangeClass.getName()
                        : vocabularyOfRangeClass.getNamespaceURI() + "#" + rangeClass.getName())));
            }
        }

        LOGGER.info("vocabulary term resource \"{}\" created. returning term object \"{}\" ", term.getName(), term2);

        return term2;
    }

    private Map<String, String> getNameSpacePrefixes(Vocabulary vocabulary) {
        Map<String, String> nameSpacePrefixesMap = Maps.newHashMap();
        nameSpacePrefixesMap.put(vocabulary.getPreferredNamespacePrefix(), vocabulary.getNamespaceURI());
        return nameSpacePrefixesMap;
    }

}
