package com.github.eclipse.gef.example.editor.parts

import org.eclipse.draw2d.IFigure
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.gef.example.editor.figure.ServiceFigure
import com.github.eclipse.gef.example.editor.model.Service
import org.eclipse.gef.EditPolicy
import com.github.eclipse.gef.example.editor.editpolicies.AppEditLayoutPolicy
import java.beans.PropertyChangeEvent
import com.github.eclipse.gef.example.editor.model.Node
import com.github.eclipse.gef.example.editor.editpolicies.AppDeletePolicy

class ServicePart extends AppAbstractEditPart {

  protected override def createFigure(): IFigure = new ServiceFigure()

  protected def createEditPolicies(): Unit = {
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new AppEditLayoutPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
  }

  protected override def refreshVisuals(): Unit = {
    val figure = getFigure().asInstanceOf[ServiceFigure]
    val model = getModel().asInstanceOf[Service]

    figure.setName(model.getName());
    figure.setEtage(model.getEtage());
    figure.setLayout(model.getLayout());
    figure.setColor(model.getColor());
  }

  override def getModelChildren(): java.util.List[_] =
    getModel().asInstanceOf[Service].getChildrenArray()

  override def propertyChange(evt: PropertyChangeEvent) = {
    if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();

    if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();

    if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();

    if (evt.getPropertyName().equals(Node.PROPERTY_RENAME)) refreshVisuals();

    if (evt.getPropertyName().equals(Service.PROPERTY_COLOR)) refreshVisuals();

    if (evt.getPropertyName().equals(Service.PROPERTY_FLOOR)) refreshVisuals();

  }
}