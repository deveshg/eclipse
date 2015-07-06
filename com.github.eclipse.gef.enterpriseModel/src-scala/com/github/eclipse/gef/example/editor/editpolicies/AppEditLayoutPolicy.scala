package com.github.eclipse.gef.example.editor.editpolicies

import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.gef.EditPart
import org.eclipse.gef.commands.Command
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy
import org.eclipse.gef.requests.CreateRequest

import com.github.eclipse.gef.example.editor.commands.AbstractLayoutCommand
import com.github.eclipse.gef.example.editor.commands.EmployeChangeLayoutCommand
import com.github.eclipse.gef.example.editor.commands.ServiceChangeLayoutCommand
import com.github.eclipse.gef.example.editor.parts.EmployePart
import com.github.eclipse.gef.example.editor.parts.ServicePart

class AppEditLayoutPolicy extends XYLayoutEditPolicy {

  protected override def createChangeConstraintCommand(child: EditPart, constraint: Any): Command = {
    var command: AbstractLayoutCommand = null

    if (child.isInstanceOf[EmployePart])
      command = new EmployeChangeLayoutCommand();
    else if (child.isInstanceOf[ServicePart])
      command = new ServiceChangeLayoutCommand();

    command.setModel(child.getModel());
    command.setConstraint(constraint.asInstanceOf[Rectangle]);

    return command;
  }

  protected override def getCreateCommand(request: CreateRequest): Command = null

}