package com.github.eclipse.gef.example.editor.parts.tree

import java.beans.PropertyChangeListener

import org.eclipse.gef.editparts.AbstractTreeEditPart

import com.github.eclipse.gef.example.editor.model.Node

abstract class AppAbstractTreeEditPart extends AbstractTreeEditPart with PropertyChangeListener {

  override def activate(): Unit = {
    super.activate();
    getModel().asInstanceOf[Node].addPropertyChangeListener(this);
  }

  override def deactivate(): Unit = {
    getModel().asInstanceOf[Node].removePropertyChangeListener(this);
    super.deactivate();

  }

}