package com.github.eclipse.gef.example.editor.parts

import org.eclipse.draw2d.IFigure
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.gef.example.editor.figure.EntrepriseFigure
import com.github.eclipse.gef.example.editor.model.Entreprise
import scala.collection.mutable.ListBuffer
import com.github.eclipse.gef.example.editor.model.Node
import java.util.ArrayList
import com.github.eclipse.gef.example.editor.editpolicies.AppEditLayoutPolicy
import org.eclipse.gef.EditPolicy
import java.beans.PropertyChangeEvent

class EntreprisePart extends AppAbstractEditPart {

  protected def createEditPolicies(): Unit = {
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new AppEditLayoutPolicy());
  }

  protected def createFigure(): IFigure = new EntrepriseFigure()

  protected override def refreshVisuals(): Unit = {
    val figure = getFigure().asInstanceOf[EntrepriseFigure]
    val model = getModel().asInstanceOf[Entreprise]

    figure.setName(model.getName());
    figure.setAddress(model.getAddress());
    figure.setCapital(model.getCapital());
  }

  override def getModelChildren(): java.util.List[Node] =
    getModel().asInstanceOf[Entreprise].getChildrenArray()

  override def propertyChange(evt: PropertyChangeEvent) = {
    if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
    
    if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
    if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
    
    if (evt.getPropertyName().equals(Entreprise.PROPERTY_CAPITAL)) refreshVisuals();
    if (evt.getPropertyName().equals(Node.PROPERTY_RENAME)) refreshVisuals();
    
  }
}