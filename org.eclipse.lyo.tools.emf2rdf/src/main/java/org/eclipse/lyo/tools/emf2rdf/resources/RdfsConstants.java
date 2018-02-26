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

package org.eclipse.lyo.tools.emf2rdf.resources;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

public interface RdfsConstants {

    public static String RDFS_DOMAIN = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE_PREFIX = "rdfs";

    public static String RDFSCLASS = "RdfsClass";
    public static String PATH_RDFSCLASS = "rdfsClass";
    public static String TYPE_RDFSCLASS = RDFS_NAMSPACE + RDFSCLASS;
}
