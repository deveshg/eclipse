package com.github.eclipse.gef.example.editor.parts

import org.eclipse.gef.EditPartListener
import org.eclipse.draw2d.IFigure
import org.eclipse.gef.commands.Command
import java.util.List
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import java.beans.PropertyChangeListener
import com.github.eclipse.gef.example.editor.model.Node

abstract class AppAbstractEditPart extends AbstractGraphicalEditPart with PropertyChangeListener {

  override def activate(): Unit = {
    super.activate();
    getModel().asInstanceOf[Node].addPropertyChangeListener(this);
  }

  override def deactivate(): Unit = {
    super.deactivate();
    getModel().asInstanceOf[Node].removePropertyChangeListener(this);
  }

}