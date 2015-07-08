package com.github.eclipse.gef.example.editor.commands

import org.eclipse.gef.commands.Command
import com.github.eclipse.gef.example.editor.model.Entreprise
import com.github.eclipse.gef.example.editor.model.Service
import org.eclipse.draw2d.geometry.Rectangle

class ServiceCreateCommand extends Command {

  private var entreprise: Entreprise = _
  private var service: Service = _

  def setService(obj: AnyRef): Unit = {
    if (obj != null && obj.isInstanceOf[Service])
      this.service = obj.asInstanceOf[Service]
    else
      this.service = null
  }

  def setEntreprise(obj: AnyRef): Unit = {
    if (obj != null && obj.isInstanceOf[Entreprise])
      this.entreprise = obj.asInstanceOf[Entreprise]
    else
      this.entreprise = null
  }

  def setLayout(rect: Rectangle): Unit = {
    if (rect != null && this.service != null)
      this.service.setLayout(rect)
  }

  override def execute(): Unit = {
    if (checkNotNull)
      this.entreprise.addChild(this.service)
  }

  override def undo(): Unit = {
    if (checkNotNull)
      this.entreprise.removeChild(this.service)
  }

  override def canUndo(): Boolean = checkNotNull && this.entreprise.contains(this.service)

  override def redo(): Unit = {
    if (checkNotNull)
      this.entreprise.addChild(this.service)
  }

  private def checkNotNull: Boolean = this.entreprise != null && this.service != null

}