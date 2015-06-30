package org.eclipse.articles.adapters.ui.views;

import org.eclipse.articles.adapters.core.Person;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ViewContentProvider implements IStructuredContentProvider {
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		if (parent instanceof Person[])
			return (Person[]) parent;
		return new Person[0];
	}
}