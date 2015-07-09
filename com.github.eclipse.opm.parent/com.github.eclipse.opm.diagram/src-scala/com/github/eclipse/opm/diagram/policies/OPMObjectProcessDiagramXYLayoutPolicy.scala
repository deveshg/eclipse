package com.github.eclipse.opm.diagram.policies

import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.gef.EditPart
import org.eclipse.gef.commands.Command
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy
import org.eclipse.gef.requests.CreateRequest

import com.github.eclipse.opm.diagram.commands.OPMThingChangeConstraintCommand
import com.github.eclipse.opm.diagram.commands.OPMThingCreateCommand
import com.github.eclipse.opm.model.OPMObjectProcessDiagram
import com.github.eclipse.opm.model.OPMThing

class OPMObjectProcessDiagramXYLayoutPolicy extends XYLayoutEditPolicy {

  protected override def createChangeConstraintCommand(child: EditPart, constraint: AnyRef): Command = {
    val command = new OPMThingChangeConstraintCommand();
    command.setModel(child.getModel().asInstanceOf[OPMThing]);
    command.setNewConstraint(constraint.asInstanceOf[Rectangle]);
    return command;
  }

  protected override def getCreateCommand(request: CreateRequest): Command = {
    var retVal: Command = null;
    if (request.getNewObject().isInstanceOf[OPMThing]) {
      val command = new OPMThingCreateCommand();
      command.setLocation(request.getLocation());
      command.setParent(getHost().getModel().asInstanceOf[OPMObjectProcessDiagram]);
      command.setThing(request.getNewObject().asInstanceOf[OPMThing]);
      retVal = command;
    }
    return retVal;
  }
}