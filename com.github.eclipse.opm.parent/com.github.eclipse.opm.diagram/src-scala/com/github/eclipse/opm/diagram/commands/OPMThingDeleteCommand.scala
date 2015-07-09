package com.github.eclipse.opm.diagram.commands

import org.eclipse.gef.commands.Command
import com.github.eclipse.opm.model.OPMThing
import com.github.eclipse.opm.model.OPMObjectProcessDiagram

class OPMThingDeleteCommand extends Command {

  var thing: OPMThing = _
  var opd: OPMObjectProcessDiagram = _

  override def execute(): Unit = thing.setOpd(null)

  override def undo(): Unit = thing.setOpd(opd)

  def setThing(newThing: OPMThing): Unit = {
    this.thing = newThing
    this.opd = newThing.getOpd()
  }

}