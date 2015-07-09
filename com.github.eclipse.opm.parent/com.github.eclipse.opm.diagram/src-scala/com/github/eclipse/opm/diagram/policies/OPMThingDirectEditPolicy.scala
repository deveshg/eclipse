package com.github.eclipse.opm.diagram.policies

import org.eclipse.gef.editpolicies.DirectEditPolicy
import com.github.eclipse.opm.diagram.commands.OPMThingRenameCommand
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.gef.requests.DirectEditRequest
import org.eclipse.gef.commands.Command
import com.github.eclipse.opm.diagram.figures.OPMThingFigure

class OPMThingDirectEditPolicy extends DirectEditPolicy {

  protected override def getDirectEditCommand(request: DirectEditRequest): Command = {
    val command = new OPMThingRenameCommand();
    command.setModel(getHost().getModel().asInstanceOf[OPMThing]);
    command.setNewName(request.getCellEditor().getValue().asInstanceOf[String]);
    return command;
  }

  protected override def showCurrentEditValue(request: DirectEditRequest): Unit = {
    val value = request.getCellEditor().getValue().asInstanceOf[String];
    getHostFigure().asInstanceOf[OPMThingFigure].getNameLabel().setText(value);
  }
}