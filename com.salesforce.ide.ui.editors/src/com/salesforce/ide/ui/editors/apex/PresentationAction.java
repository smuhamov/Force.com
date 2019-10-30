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
package com.salesforce.ide.ui.editors.apex;

import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.TextEditorAction;

import com.salesforce.ide.ui.editors.internal.utils.EditorMessages;

/**
 * A toolbar action which toggles the presentation model of the connected text editor. The editor shows either the
 * highlight range only or always the whole document.
 */
public class PresentationAction extends TextEditorAction {

    /**
     * Constructs and updates the action.
     */
    public PresentationAction() {
        super(EditorMessages.getResourceBundle(), "ApexEditor.TogglePresentation.", null); //$NON-NLS-1$
        update();
    }

    /*
     * (non-Javadoc) Method declared on IAction
     */
    @Override
    public void run() {

        ITextEditor editor = getTextEditor();

        editor.resetHighlightRange();
        boolean show = editor.showsHighlightRangeOnly();
        setChecked(!show);
        editor.showHighlightRangeOnly(!show);
    }

    /*
     * (non-Javadoc) Method declared on TextEditorAction
     */
    @Override
    public void update() {
        setChecked((getTextEditor() != null) && getTextEditor().showsHighlightRangeOnly());
        setEnabled(true);
    }
}
