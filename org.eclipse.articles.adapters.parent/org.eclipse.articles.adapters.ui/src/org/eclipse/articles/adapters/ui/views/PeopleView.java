/*******************************************************************************
 * Copyright (c) 2008 The Eclipse Foundation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    The Eclipse Foundation - initial API and implementation
 *******************************************************************************/
package org.eclipse.articles.adapters.ui.views;

import org.eclipse.articles.adapters.core.Person;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * This is a very simple view that is intended to show how to register a viewer
 * as the &quot;selection provider&quot;. It also serves as a convenient
 * mechanism for demonstrating how the Properties view can display information
 * about our own custom types. Note that the Properties view is not
 * automatically opened by this view.
 */
public class PeopleView extends ViewPart {
	TableViewer viewer;
	Person[] people = PeopleDAO.getPeople();

	


	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		getSite().setSelectionProvider(viewer);
		viewer.setInput(people);
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}
}