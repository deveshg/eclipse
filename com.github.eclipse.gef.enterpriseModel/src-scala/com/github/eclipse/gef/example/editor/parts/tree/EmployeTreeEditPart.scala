package com.github.eclipse.gef.example.editor.parts.tree

import com.github.eclipse.gef.example.editor.model.Node
import com.github.eclipse.gef.example.editor.model.Employe
import java.beans.PropertyChangeEvent
import com.github.eclipse.gef.example.editor.editpolicies.AppDeletePolicy
import org.eclipse.gef.EditPolicy
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ISharedImages

class EmployeTreeEditPart extends AppAbstractTreeEditPart {

  protected override def getModelChildren(): java.util.List[Node] =
    getModel().asInstanceOf[Employe].getChildrenArray()

  override def propertyChange(evt: PropertyChangeEvent): Unit = {
    if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
    if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
  }

  protected override def createEditPolicies(): Unit = {
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
  }

  override def refreshVisuals(): Unit = {
    val model = getModel().asInstanceOf[Employe]
    setWidgetText(model.getName());
    setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT))
  }
}