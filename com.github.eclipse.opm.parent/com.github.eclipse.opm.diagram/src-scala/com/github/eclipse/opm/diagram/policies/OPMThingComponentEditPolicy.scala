package com.github.eclipse.opm.diagram.policies

import org.eclipse.gef.editpolicies.ComponentEditPolicy
import org.eclipse.emf.edit.command.DeleteCommand
import com.github.eclipse.opm.diagram.commands.OPMThingDeleteCommand
import org.eclipse.gef.commands.Command
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.gef.Request
import org.eclipse.gef.requests.GroupRequest

class OPMThingComponentEditPolicy extends ComponentEditPolicy {

  override def createDeleteCommand(deleteRequest : GroupRequest): Command = {
    val cmd = new OPMThingDeleteCommand
    cmd.setThing(getHost().getModel().asInstanceOf[OPMThing])
    return cmd
  }

}