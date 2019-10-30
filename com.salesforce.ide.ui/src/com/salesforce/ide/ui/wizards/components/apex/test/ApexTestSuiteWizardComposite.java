/*******************************************************************************
 * Copyright (c) 2016 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.wizards.components.apex.test;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.salesforce.ide.ui.wizards.components.generic.GenericComponentWizardComposite;

/**
 * Composite for the page in ApexTestSuite wizard that allows naming
 * the component.
 * 
 * @author jwidjaja
 */
public class ApexTestSuiteWizardComposite extends GenericComponentWizardComposite {

	public ApexTestSuiteWizardComposite(Composite parent, int style, String componentTypeDisplayName) {
		super(parent, style, componentTypeDisplayName);
		initialize();
	}
	
	@Override
	protected void initializeControls() {
        Group grpProperties = createPropertiesGroup(this);
        createNameText(null, grpProperties);
    }
}
