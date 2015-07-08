package com.github.eclipse.opm.diagram.commands

import org.eclipse.gef.commands.Command
import org.eclipse.draw2d.geometry.Dimension
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.draw2d.geometry.Rectangle
import com.github.eclipse.opm.model.OPMObjectProcessDiagram
import org.eclipse.draw2d.geometry.Point

class OPMThingCreateCommand extends Command {

  val defaultDimension = new Dimension(50, 50);
  val defaultName = "<...>";

  var newThing: OPMThing = _
  var constraints: Rectangle = _
  var opd: OPMObjectProcessDiagram = _

  override def execute(): Unit = {
    newThing.setName(defaultName);
    if (constraints != null) {
      newThing.setConstraints(constraints);
    }
    newThing.setOpd(opd);
  }

  override def undo(): Unit = {
    newThing.setOpd(null);
  }

  def setLocation(location: Point): Unit = {
    constraints = new Rectangle(location, defaultDimension);
  }

  def setParent(opd: OPMObjectProcessDiagram) {
    this.opd = opd;
  }

  def setThing(newThing: OPMThing): Unit = {
    this.newThing = newThing;
  }
}