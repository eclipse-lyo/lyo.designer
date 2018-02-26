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

package org.eclipse.lyo.tools.emf2rdf.helper;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public enum Status {
    
    SUCCESSFUL,
    UNSUCCESSFUL,
    CANCEL;
    
    @Override
    public String toString() {
      switch(this) {
        case SUCCESSFUL: return "Successful";
        case UNSUCCESSFUL: return "Unsuccessful";
        case CANCEL: return "Cancel";
        default: throw new IllegalArgumentException();
      }
    }
    

}
