package com.github.eclipse.gef.example.editor.commands

import scala.collection.mutable.ArrayBuffer

import org.eclipse.gef.commands.Command
import org.eclipse.gef.ui.actions.Clipboard

import com.github.eclipse.gef.example.editor.model.Employe
import com.github.eclipse.gef.example.editor.model.Node
import com.github.eclipse.gef.example.editor.model.Service

class CopyNodeCommand extends Command {

  val list = new ArrayBuffer[Node]

  def addElement(node: Node): Boolean = {

    if (list.contains(node))
      return false

    list += node
    return true
  }

  def isCopyableNode(node: Any): Boolean =
    node.isInstanceOf[Employe] || node.isInstanceOf[Service]

  override def canUndo(): Boolean = false

  override def canExecute(): Boolean = {
    if (list == null || list.size == 0)
      return false

    var collection = list.filter(node => !isCopyableNode(node))

    if (collection.size > 0) return false

    return true
  }

  override def execute(): Unit = {
    if (canExecute())
      Clipboard.getDefault().setContents(list);
  }

}