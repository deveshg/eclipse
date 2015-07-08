package com.github.eclipse.gef.example.editor.commands

import org.eclipse.gef.commands.Command
import com.github.eclipse.gef.example.editor.model.Employe
import com.github.eclipse.gef.example.editor.model.Service
import org.eclipse.draw2d.geometry.Rectangle

class EmployeCreateCommand extends Command {

  private var service: Service = _
  private var emp: Employe = _

  def setEmploye(obj: AnyRef): Unit = {
    if (obj != null && obj.isInstanceOf[Employe])
      this.emp = obj.asInstanceOf[Employe]
    else
      this.emp = null
  }

  def setService(obj: AnyRef): Unit = {
    if (obj != null && obj.isInstanceOf[Service])
      this.service = obj.asInstanceOf[Service]
    else
      this.service = null
  }

  def setLayout(rect: Rectangle): Unit = {
    if (rect != null && this.emp != null)
      this.emp.setLayout(rect)
  }

  override def execute(): Unit = {
    if (checkNotNull)
      this.service.addChild(this.emp)
  }

  override def undo(): Unit = {
    if (checkNotNull)
      this.service.removeChild(this.emp)
  }

  override def canUndo(): Boolean = checkNotNull && this.service.contains(this.emp)

  override def redo(): Unit = {
    if (checkNotNull)
      this.service.addChild(this.emp)
  }

  private def checkNotNull: Boolean = this.service != null && this.emp != null

}