package com.github.eclipse.gef.example.editor.parts

import com.github.eclipse.gef.example.editor.figure.EmployeFigure
import com.github.eclipse.gef.example.editor.model.Employe
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import org.eclipse.draw2d.IFigure
import java.beans.PropertyChangeEvent
import com.github.eclipse.gef.example.editor.model.Node
import org.eclipse.gef.EditPolicy
import com.github.eclipse.gef.example.editor.editpolicies.AppDeletePolicy

class EmployePart extends AppAbstractEditPart {

  protected def createFigure(): IFigure = new EmployeFigure()

  protected def createEditPolicies(): Unit = {
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
  }

  protected override def refreshVisuals(): Unit = {
    val figure = getFigure().asInstanceOf[EmployeFigure]
    val model = getModel().asInstanceOf[Employe];

    figure.setName(model.getName());
    figure.setFirstName(model.getPrenom());
    figure.setLayout(model.getLayout());
  }

  override def getModelChildren(): java.util.List[_] =
    getModel().asInstanceOf[Employe].getChildrenArray()

  override def propertyChange(evt: PropertyChangeEvent) = {
    if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) 
      refreshVisuals();
    
  }
}