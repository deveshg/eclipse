package com.github.eclipse.gef.example.editor.parts

import org.eclipse.gef.EditPartFactory
import org.eclipse.gef.EditPart
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.gef.example.editor.model.Entreprise
import com.github.eclipse.gef.example.editor.model.Service
import com.github.eclipse.gef.example.editor.model.Employe

class AppEditPartFactory extends EditPartFactory {

  override def createEditPart(context: EditPart, model: Any): EditPart = {

    var part: AbstractGraphicalEditPart = null

    if (model.isInstanceOf[Entreprise])
      part = new EntreprisePart()
    else if (model.isInstanceOf[Service])
      part = new ServicePart()
    else if (model.isInstanceOf[Employe])
      part = new EmployePart()

    part.setModel(model)

    return part
  }
}