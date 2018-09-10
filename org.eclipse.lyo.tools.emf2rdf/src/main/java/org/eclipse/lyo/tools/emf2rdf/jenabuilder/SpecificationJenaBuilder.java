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
 * The Class SpecificationJenaBuilder.
 *
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
package org.eclipse.lyo.tools.emf2rdf.jenabuilder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.Property;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.lyo.shacl.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import adaptorinterface.DomainSpecification;
import adaptorinterface.NamespacePrefix;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import adaptorinterface.Specification;
import vocabulary.Vocabulary;

/**
 * <p>
 * This class contains code for creating the JenaModel from the
 * {@link Specification} in the <code>toolchain.xmi</code> file in the lyo
 * modeler.
 * 
 * It iterates over all the {@link Specification} and the
 * {@link DomainSpecification} inside respective {@link Specification} , creates
 * {@link ResourceShape} and with the help of JenaModelHelper creates the
 * JenaModel for them.
 *
 */
public class SpecificationJenaBuilder {

    private static final Logger log = LoggerFactory.getLogger(SpecificationJenaBuilder.class);

    /**
     * <p>
     * This method is used for building the JenaModel for the {@link Specification}
     * and respective {@link DomainSpecification}.
     * 
     * It create the {@link ResourceShape} for respective
     * {@link DomainSpecification} and with the help of {@link JenaModelHelper}
     * creates the instance of {@link Model}.
     * 
     * @param specification
     *            The {@link Specification} inside the <code>toolchain.xmi</code>
     *            file.
     * 
     * @return The instance {@link Model} that contains the {@link ResourceShape} of
     *         the respective {@link DomainSpecification} inside the
     *         <code>.xmi<code> file.
     * @throws ParseException
     */
    public Model buildJenaModel(Specification specification, String shapeType)
            throws URISyntaxException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            DatatypeConfigurationException, OslcCoreApplicationException, IOException, ParseException {


        log.info("building jenamodel for specification with \"{}\" domain specifications",
                specification.getDomainSpecifications().size());

        Model outModel = buildJenaModelInternal(specification, shapeType, null);

        log.info("building jenamodel completed. returning jenamodel: \"{}\" ", outModel);
        return outModel;
    }

    private Model buildJenaModelInternal(Specification specification, String shapeType, List<IResource> resources)
            throws URISyntaxException, DatatypeConfigurationException, IllegalAccessException,
            InvocationTargetException, OslcCoreApplicationException, ParseException {
        Model outModel = ModelFactory.createDefaultModel();

        // Iterating over all the Domain Specifications with in Specification Diagram
        for (Iterator<DomainSpecification> domainIterator = specification.getDomainSpecifications()
                .iterator(); domainIterator.hasNext();) {

            DomainSpecification domainSpecification = domainIterator.next();

            // Iterating over all the resources with in Domain Specification
            for (Iterator<Resource> resourceIterator = domainSpecification.getResources().iterator(); resourceIterator
                    .hasNext();) {

                Resource resource = resourceIterator.next();
                Model model = null;
                switch (shapeType) {
                case ExportConstants.OSLC_SHAPE:
                    // Creating Resource Shape
                    ResourceShape resourceShape = createResourceShape(resource, domainSpecification);
                    createProperty(resource, resourceShape);
                    for (Resource parentResource : resource.getExtends()) {
                        createProperty(parentResource, resourceShape);
                    }
                    if(null != resources) {
                        resources.add(resourceShape);
                    } else {
                        model = JenaModelHelper.createJenaModel(new Object[] { resourceShape });
                    }
                    break;
                case ExportConstants.SHACL_SHAPE:
                    Shape shaclShape = createShaclShape(resource, domainSpecification);
                    createShaclProperty(resource, shaclShape);
                    for (Resource parentResource : resource.getExtends()) {
                        createShaclProperty(parentResource, shaclShape);
                    }
                    if(null != resources) {
                        resources.add(shaclShape);
                    } else {
                        model = JenaModelHelper.createJenaModel(new Object[] { shaclShape });
                    }
                    break;
                }

                if(null != model) {
                    model.setNsPrefixes(getNameSpacePrefixes(domainSpecification));
                    // adding the model to the parent JenaModel.
                    outModel.add(model);
                }
                
            }
        }
        return outModel;
    }

    public List<IResource> getOSLCResources(Specification specification, String shapeType)
            throws IllegalAccessException, InvocationTargetException, URISyntaxException,
            DatatypeConfigurationException, OslcCoreApplicationException, ParseException {
        List<IResource> resources = Lists.newArrayList();
        buildJenaModelInternal(specification, shapeType, resources);
        return resources;
    }

    private void createProperty(Resource resource, ResourceShape resourceShape) throws URISyntaxException {
        // Iterating over all the properties of the resource
        for (Iterator<ResourceProperty> resourcePropertyIterator = resource.getResourceProperties()
                .iterator(); resourcePropertyIterator.hasNext();) {

            ResourceProperty resourceProperty = resourcePropertyIterator.next();

            // Adding each property in the resource shape
            resourceShape.addProperty(createPropertyInternal(resourceProperty));
        }
    }

    /**
     * <p>
     * This method is used for creating the {@link ResourceShape} instance of the
     * corresponding {@link Resource}
     *
     * @param resource
     *            {@link Resource} whose {@link ResourceShape} instance has to be
     *            created.
     * @param domainSpecification
     *            {@link DomainSpecification} to which whose {@link Resource}
     *            belongs.
     * @return Instance of {@link ResourceShape}
     * @throws URISyntaxException
     *             Throws {@link URISyntaxException} if the syntax of
     *             {@link DomainSpecification} <code> namespaceURI</code> is
     *             incorrect.
     */
    private ResourceShape createResourceShape(Resource resource, DomainSpecification domainSpecification)
            throws URISyntaxException {
        log.info("creating resource shape for resource \"{}\" ", resource.getName());

        String describes = "";
        ResourceShape resourceShape = new ResourceShape();
        resourceShape.setAbout(new URI(domainSpecification.getNamespaceURI() + resource.getName().replaceAll(" ", "")));
        resourceShape.setTitle(resource.getName());

        if (null != resource.getDescribes()) {
            Vocabulary vocabulary = (Vocabulary) resource.getDescribes().eContainer();
            describes = vocabulary.getNamespaceURI() + resource.getName();
        } else {
            describes = domainSpecification.getNamespaceURI() + resource.getName();
        }
        resourceShape.setDescribes(new URI[] { new URI(describes.replaceAll("\\s+","")) });

        log.info("instance of ResourceShape for resource \"{}\" created. returning \"{}\" ", resourceShape);
        return resourceShape;
    }

    /**
     * <p>
     * This method is used for creating the {@link Property} instance of the
     * corresponding {@link ResourceProperty}
     *
     * @param resourceProperty
     *            instance of {@link ResourceProperty}
     * @return {@link Property}
     * @throws URISyntaxException
     *             Throws {@link URISyntaxException} if the syntax of
     *             {@link DomainSpecification}
     */
    private Property createPropertyInternal(ResourceProperty resourceProperty) throws URISyntaxException {

        log.info("creating instance of Property for Specification.ResourceProperty  \"{}\" ",
                resourceProperty.getName());

        Property property = new Property();

        DomainSpecification domainSpecification = (DomainSpecification) resourceProperty.eContainer();
        if (resourceProperty.getPropertyDefinition() != null) {
            Vocabulary vocabulary = (Vocabulary) resourceProperty.getPropertyDefinition().eContainer();
            property.setPropertyDefinition(new URI(vocabulary.getNamespaceURI().endsWith("#")
                    ? vocabulary.getNamespaceURI() + resourceProperty.getName()
                    : vocabulary.getNamespaceURI() + "#" + resourceProperty.getName()));
        } else {
            property.setPropertyDefinition(new URI(domainSpecification.getNamespaceURI() + resourceProperty.getName()));
        }

        if (!Strings.isNullOrEmpty(resourceProperty.getName())) {
            property.setName(resourceProperty.getName());
        }

        if (!Strings.isNullOrEmpty(resourceProperty.getDescription())) {
            property.setDescription(resourceProperty.getDescription());
        }

        if (!Strings.isNullOrEmpty(resourceProperty.getTitle())) {
            property.setTitle(resourceProperty.getTitle());
        }

        if (null != resourceProperty.getRange() && resourceProperty.getRange().size()!=0) {
            for(Resource resource : resourceProperty.getRange()) {
                DomainSpecification ds = (DomainSpecification) resource.eContainer();
                property.addRange(new URI(ds.getNamespaceURI() + resource.getName()));
            }
        }

        property.setReadOnly(resourceProperty.isReadOnly());

        for (Iterator<String> allowedValuesIterator = resourceProperty.getAllowedValue()
                .iterator(); allowedValuesIterator.hasNext();) {
            property.setAllowedValuesRef(new URI(allowedValuesIterator.next()));
        }

        if (resourceProperty.getIsMemberProperty() != null) {
            if(resourceProperty.getIsMemberProperty().getValue() == 0) {
                property.setMemberProperty(false);
            } else if(resourceProperty.getIsMemberProperty().getValue() == 1) {
                property.setMemberProperty(true);
            } 
        }

        if (resourceProperty.getOccurs() != null) {
            switch (resourceProperty.getOccurs().getName()) {
            case "exactlyOne":
                property.setOccurs(Occurs.ExactlyOne);
                break;
            case "zeroOrOne":
                property.setOccurs(Occurs.ZeroOrOne);
                break;
            case "zeroOrMany":
                property.setOccurs(Occurs.ZeroOrMany);
                break;
            case "oneOrMany":
                property.setOccurs(Occurs.OneOrMany);
                break;
            }
        }

        if (resourceProperty.getRepresentation() != null) {
            switch (resourceProperty.getRepresentation().getName()) {
            case "reference":
                property.setRepresentation(Representation.Reference);
                break;
            case "inline":
                property.setRepresentation(Representation.Inline);
                break;
            }
        }

        if (resourceProperty.getValueType() != null) {
            switch (resourceProperty.getValueType().getName()) {
            case "Boolean":
                property.setValueType(ValueType.Boolean);
                break;
            case "String":
                property.setValueType(ValueType.String);
                break;
            case "DateTime":
                property.setValueType(ValueType.DateTime);
                break;
            case "XMLLiteral":
                property.setValueType(ValueType.XMLLiteral);
                break;
            case "Resource":
                property.setValueType(ValueType.Resource);
                break;
            case "LocalResource":
                property.setValueType(ValueType.LocalResource);
                break;
            case "Double":
                property.setValueType(ValueType.Double);
                break;
            case "Float":
                property.setValueType(ValueType.Float);
                break;
            case "Integer":
                property.setValueType(ValueType.Integer);
                break;
            }
        }

        log.info("instance of Property for Specification.ResourceProperty  \"{}\"  created. returning \"{}\" ",
                resourceProperty.getName(), property);
        return property;

    }

    private Shape createShaclShape(Resource resource, DomainSpecification domainSpecification)
            throws URISyntaxException {
        log.info("creating shacl shape for resource \"{}\" ", resource.getName());

        String describes = "";
        Shape shaclShape = new Shape();
        shaclShape.setAbout(new URI(domainSpecification.getNamespaceURI() + resource.getName().replaceAll(" ", "")));
        shaclShape.setTargetClass(
                new URI(domainSpecification.getNamespaceURI() + resource.getName().replaceAll(" ", "")));
        shaclShape.setLabel(resource.getName());
        log.info("instance of ShaclShape for resource \"{}\" created. returning \"{}\" ", shaclShape);
        return shaclShape;
    }

    private void createShaclProperty(Resource resource, Shape shaclShape)
            throws URISyntaxException, ParseException {
        // Iterating over all the properties of the resource
        for (Iterator<ResourceProperty> resourcePropertyIterator = resource.getResourceProperties()
                .iterator(); resourcePropertyIterator.hasNext();) {

            ResourceProperty resourceProperty = resourcePropertyIterator.next();

            // Adding each property in the resource shape
            shaclShape.addProperty(createShaclPropertyInternal(resourceProperty));
        }
    }

    private org.eclipse.lyo.shacl.Property createShaclPropertyInternal(ResourceProperty resourceProperty)
            throws URISyntaxException, ParseException {

        log.info("creating instance of Property for Specification.ResourceProperty  \"{}\" ",
                resourceProperty.getName());

        org.eclipse.lyo.shacl.Property shaclProperty = new org.eclipse.lyo.shacl.Property();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setMaximumFractionDigits(2);

        DomainSpecification domainSpecification = (DomainSpecification) resourceProperty.eContainer();
        if (resourceProperty.getPropertyDefinition() != null) {
            Vocabulary vocabulary = (Vocabulary) resourceProperty.getPropertyDefinition().eContainer();
            shaclProperty.setPath(new URI(vocabulary.getNamespaceURI().endsWith("#")
                    ? vocabulary.getNamespaceURI() + resourceProperty.getName()
                    : vocabulary.getNamespaceURI() + "#" + resourceProperty.getName()));
        } else {
            shaclProperty.setPath(new URI(domainSpecification.getNamespaceURI() + resourceProperty.getName()));
        }

        if (!Strings.isNullOrEmpty(resourceProperty.getName())) {
            shaclProperty.setName(resourceProperty.getName());
        }

        if (!Strings.isNullOrEmpty(resourceProperty.getDescription())) {
            shaclProperty.setDescription(resourceProperty.getDescription());
        }

        if (resourceProperty.getOccurs() != null) {
            switch (resourceProperty.getOccurs().getName()) {
            case "exactlyOne":
                shaclProperty.setMaxCount(new BigInteger("1"));
                shaclProperty.setMinCount(new BigInteger("1"));
                break;
            case "zeroOrOne":
                shaclProperty.setMaxCount(new BigInteger("1"));
                shaclProperty.setMinCount(new BigInteger("0"));
                break;
            case "zeroOrMany":
                shaclProperty.setMinCount(new BigInteger("0"));
                break;
            case "oneOrMany":
                shaclProperty.setMinCount(new BigInteger("1"));
                break;
            }
        }

        if (resourceProperty.getValueType() != null) {
            switch (resourceProperty.getValueType().getName()) {
            case "Boolean":
                shaclProperty.setDataType(new URI(ValueType.Boolean.toString()));
                break;
            case "String":
                shaclProperty.setDataType(new URI((ValueType.String.toString())));
                break;
            case "DateTime":
                shaclProperty.setDataType(new URI(ValueType.DateTime.toString()));
                break;
            case "XMLLiteral":
                shaclProperty.setDataType(new URI(ValueType.XMLLiteral.toString()));
                break;
            case "Double":
                shaclProperty.setDataType(new URI(ValueType.Double.toString()));
                break;
            case "Float":
                shaclProperty.setDataType(new URI(ValueType.Float.toString()));
                break;
            case "Integer":
                shaclProperty.setDataType(new URI(ValueType.Integer.toString()));
                break;
            }

            if (resourceProperty.getAllowedValue() != null && resourceProperty.getAllowedValue().size() != 0) {
                shaclProperty.setIn(Arrays.copyOf(resourceProperty.getAllowedValue().toArray(), resourceProperty.getAllowedValue().toArray().length, String[].class));
            }

            if (resourceProperty.getRange() != null && resourceProperty.getRange().size() != 0) {
                Resource resource = resourceProperty.getRange().get(0);
                DomainSpecification ds = (DomainSpecification) resource.eContainer();
                shaclProperty.setClassType(new URI(ds.getNamespaceURI() + resource.getName()));
            }
        }

        log.info("instance of Property for Specification.ResourceProperty  \"{}\"  created. returning \"{}\" ",
                resourceProperty.getName(), shaclProperty);
        return shaclProperty;

    }

    /**
     * <p>
     * This method is used for creating the map of {@link NamespacePrefix} of the
     * corresponding {@link DomainSpecification}
     *
     * @param domainSpecification
     *            {@link DomainSpecification} whose {@link NamespacePrefix} has to
     *            be extracted.
     * @return {@link Map} of {@link NamespacePrefix} of {@link DomainSpecification}
     */
    private Map<String, String> getNameSpacePrefixes(DomainSpecification domainSpecification) {
        log.info("filling map of prefixes Specification.DomainSpecification  \"{}\" ", domainSpecification.getName());

        Map<String, String> nameSpacePrefixesMap = Maps.newHashMap();
        nameSpacePrefixesMap.put(domainSpecification.getNamespacePrefix().getName(),
                domainSpecification.getNamespaceURI());

        log.info("filling map of prefixes Specification.DomainSpecification  \"{}\" completed. now returning \"{}\" ",
                domainSpecification.getName(), nameSpacePrefixesMap);
        return nameSpacePrefixesMap;
    }
}
