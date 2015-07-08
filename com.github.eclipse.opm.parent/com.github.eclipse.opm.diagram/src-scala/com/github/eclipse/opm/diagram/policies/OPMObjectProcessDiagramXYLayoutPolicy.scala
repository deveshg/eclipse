package com.github.eclipse.opm.diagram.policies

import org.eclipse.gef.editpolicies.XYLayoutEditPolicy
import com.github.eclipse.opm.diagram.commands.OPMThingCreateCommand
import com.github.eclipse.opm.model.OPMObjectProcessDiagram
import org.eclipse.gef.requests.CreateRequest
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.gef.commands.Command

class OPMObjectProcessDiagramXYLayoutPolicy extends XYLayoutEditPolicy {
 
   protected override def getCreateCommand(request : CreateRequest ) : Command = {
    var retVal : Command = null;
    if(request.getNewObject().isInstanceOf[OPMThing]) {
      val command = new OPMThingCreateCommand();
      command.setLocation(request.getLocation());
      command.setParent(getHost().getModel().asInstanceOf[OPMObjectProcessDiagram]);
      command.setThing(request.getNewObject().asInstanceOf[OPMThing]);
      retVal = command;
    }
    return retVal;
  }
}