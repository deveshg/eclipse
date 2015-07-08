package com.github.eclipse.opm.diagram.parts

import org.eclipse.gef.EditPart
import org.eclipse.gef.EditPartFactory
import com.github.eclipse.opm.model.OPMObject
import com.github.eclipse.opm.model.OPMObjectProcessDiagram
import com.github.eclipse.opm.model.OPMProcess

class OPMEditPartFactory extends EditPartFactory {

  override def createEditPart(context: EditPart, model: Any): EditPart = {

    var editPart: EditPart = null

    if (model.isInstanceOf[OPMObjectProcessDiagram])
      editPart = new ObjectProcessDiagramEditPart

    else if (model.isInstanceOf[OPMObject])
      editPart = new OPMObjectEditPart

    else if (model.isInstanceOf[OPMProcess])
      editPart = new OPMProcessEditPart

    if (editPart != null)
      editPart.setModel(model)

    return editPart

  }

}