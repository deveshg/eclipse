package com.github.eclipse.gef.example.editor.editpolicies

import org.eclipse.gef.editpolicies.ComponentEditPolicy
import org.eclipse.gef.commands.Command
import org.eclipse.gef.requests.GroupRequest
import com.github.eclipse.gef.example.editor.commands.DeleteCommand

class AppDeletePolicy extends ComponentEditPolicy {

  protected override def createDeleteCommand(deleteRequest: GroupRequest): Command = {
    val command = new DeleteCommand();
    command.setModel(getHost().getModel());
    command.setParentModel(getHost().getParent().getModel());
    return command;
  }

}