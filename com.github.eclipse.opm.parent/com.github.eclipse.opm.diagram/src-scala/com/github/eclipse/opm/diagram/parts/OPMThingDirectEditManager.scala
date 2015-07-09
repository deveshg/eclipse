package com.github.eclipse.opm.diagram.parts

import org.eclipse.gef.GraphicalEditPart
import org.eclipse.gef.tools.CellEditorLocator
import org.eclipse.draw2d.Label
import org.eclipse.gef.tools.DirectEditManager

class OPMThingDirectEditManager(
  source: GraphicalEditPart, editorType: java.lang.Class[_],
  locator: CellEditorLocator, label: Label)
  extends DirectEditManager(source, editorType, locator) {

  protected override def initCellEditor(): Unit = {
    val initialLabelText = label.getText();
    getCellEditor().setValue(initialLabelText);
  }

}