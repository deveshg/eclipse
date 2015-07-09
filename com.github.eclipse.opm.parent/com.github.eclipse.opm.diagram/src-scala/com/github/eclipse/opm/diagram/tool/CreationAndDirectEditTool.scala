package com.github.eclipse.opm.diagram.tool

import org.eclipse.gef.tools.CreationTool
import org.eclipse.gef.EditPart
import org.eclipse.swt.widgets.Display
import org.eclipse.gef.requests.DirectEditRequest

class CreationAndDirectEditTool extends CreationTool {

  protected override def performCreation(button: Int): Unit = {
    super.performCreation(button);

    val viewer = getCurrentViewer();
    val model = getCreateRequest().getNewObject();

    if (model == null || viewer == null) {
      return
    }

    val o = getCurrentViewer().getEditPartRegistry().get(model);
    if (o.isInstanceOf[EditPart]) {
      Display.getCurrent().asyncExec(new Runnable() {

        override def run() {
          val part = o.asInstanceOf[EditPart];
          val request = new DirectEditRequest();
          part.performRequest(request);
        }
      });
    }
  }
}