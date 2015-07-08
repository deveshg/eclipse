package com.github.eclipse.gef.example.editor.parts.tree

import java.beans.PropertyChangeEvent
import com.github.eclipse.gef.example.editor.model.Node
import com.github.eclipse.gef.example.editor.model.Entreprise
import com.github.eclipse.gef.example.editor.parts.tree.AppAbstractTreeEditPart

class EntrepriseTreeEditPart extends AppAbstractTreeEditPart {

  protected override def getModelChildren(): java.util.List[Node] =
    getModel().asInstanceOf[Entreprise].getChildrenArray()

  override def propertyChange(evt: PropertyChangeEvent): Unit = {
    if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
    if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
  }
}