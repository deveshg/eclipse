package com.github.eclipse.gef.example.editor.parts.tree

import org.eclipse.gef.EditPartFactory
import org.eclipse.gef.EditPart
import com.github.eclipse.gef.example.editor.model.Entreprise
import com.github.eclipse.gef.example.editor.model.Service
import com.github.eclipse.gef.example.editor.model.Employe

class AppTreeEditPartFactory extends EditPartFactory {

  override def createEditPart(context: EditPart, model: Any): EditPart = {
    var part: EditPart = null

    if (model.isInstanceOf[Entreprise])
      part = new EntrepriseTreeEditPart();
    else if (model.isInstanceOf[Service])
      part = new ServiceTreeEditPart();
    else if (model.isInstanceOf[Employe])
      part = new EmployeTreeEditPart();

    if (part != null)
      part.setModel(model);

    return part;
  }
}