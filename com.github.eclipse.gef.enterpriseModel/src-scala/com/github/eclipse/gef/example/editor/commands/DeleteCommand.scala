package com.github.eclipse.gef.example.editor.commands

import org.eclipse.gef.commands.Command
import com.github.eclipse.gef.example.editor.model.Node

class DeleteCommand extends Command {
  private var model: Node = _
  private var parentModel: Node = _;

  override def execute(): Unit = this.parentModel.removeChild(model);

  def setModel(model: Any) = this.model = model.asInstanceOf[Node]

  def setParentModel(model: Any) = this.parentModel = model.asInstanceOf[Node]

  override def undo(): Unit = this.parentModel.addChild(model)

}