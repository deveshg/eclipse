package com.github.eclipse.opm.diagram.parts

import org.eclipse.jface.viewers.CellEditor
import org.eclipse.gef.tools.CellEditorLocator
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.geometry.Point
import org.eclipse.swt.SWT
import org.eclipse.draw2d.Label

class OPMThingCellEditorLocator(nameLabel: Label) extends CellEditorLocator {

  override def relocate(celleditor: CellEditor) {
    val text = celleditor.getControl();
    val pref = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
    val rect = nameLabel.getTextBounds().getCopy();
    nameLabel.translateToAbsolute(rect);
    text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1);
  }
}