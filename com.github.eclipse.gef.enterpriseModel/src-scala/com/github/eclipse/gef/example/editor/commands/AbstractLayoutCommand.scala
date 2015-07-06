package com.github.eclipse.gef.example.editor.commands

import org.eclipse.gef.commands.Command
import org.eclipse.draw2d.geometry.Rectangle

abstract class AbstractLayoutCommand extends Command {

  def setConstraint(rect: Rectangle): Unit

  def setModel(model: Any): Unit

}