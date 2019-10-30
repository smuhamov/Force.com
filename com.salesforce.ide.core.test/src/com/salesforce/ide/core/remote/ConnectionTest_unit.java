/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.core.remote;

import junit.framework.TestCase;

public class ConnectionTest_unit extends TestCase{

    public void testSetMetdataEndpointAndMessageHandler() throws Exception {
        Connection c = new Connection();
        c.setMetadataServerUrl("foo");

        c.setMetdataEndpointAndMessageHandler();
        assertEquals("foo",c.getMetadataConnectorConfig().getServiceEndpoint());
        assertTrue(c.getMetadataConnectorConfig().getMessagerHandlers().hasNext());
    }
}
