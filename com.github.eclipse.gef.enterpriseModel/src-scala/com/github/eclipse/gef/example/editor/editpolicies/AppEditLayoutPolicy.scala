package com.github.eclipse.gef.example.editor.editpolicies

import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.gef.EditPart
import org.eclipse.gef.RequestConstants
import org.eclipse.gef.commands.Command
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy
import org.eclipse.gef.requests.CreateRequest

import com.github.eclipse.gef.example.editor.commands.AbstractLayoutCommand
import com.github.eclipse.gef.example.editor.commands.EmployeChangeLayoutCommand
import com.github.eclipse.gef.example.editor.commands.EmployeCreateCommand
import com.github.eclipse.gef.example.editor.commands.ServiceChangeLayoutCommand
import com.github.eclipse.gef.example.editor.commands.ServiceCreateCommand
import com.github.eclipse.gef.example.editor.figure.EmployeFigure
import com.github.eclipse.gef.example.editor.figure.ServiceFigure
import com.github.eclipse.gef.example.editor.parts.EmployePart
import com.github.eclipse.gef.example.editor.parts.EntreprisePart
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

  protected override def getCreateCommand(request: CreateRequest): Command = {
    if (request.getType() == RequestConstants.REQ_CREATE && getHost().isInstanceOf[EntreprisePart]) {
      val cmd = new ServiceCreateCommand();
      cmd.setEntreprise(getHost().getModel());
      cmd.setService(request.getNewObject());

      cmd.setLayout(getCustomConstraintFor(request,
        ServiceFigure.SERVICE_FIGURE_DEFWIDTH,
        ServiceFigure.SERVICE_FIGURE_DEFHEIGHT));
      return cmd;
    } else if (request.getType() == RequestConstants.REQ_CREATE && getHost().isInstanceOf[ServicePart]) {
      val cmd = new EmployeCreateCommand();
      cmd.setService(getHost().getModel());
      cmd.setEmploye(request.getNewObject());

      cmd.setLayout(getCustomConstraintFor(request,
        EmployeFigure.EMPLOYE_FIGURE_DEFHEIGHT,
        EmployeFigure.EMPLOYE_FIGURE_DEFHEIGHT));
      return cmd;
    }
    return null;
  }

  private def getCustomConstraintFor(request: CreateRequest, width: Int, height: Int): Rectangle = {

    var constraint = getConstraintFor(request).asInstanceOf[Rectangle]

    constraint.x = if (constraint.x < 0) 0 else constraint.x;
    constraint.y = if (constraint.y < 0) 0 else constraint.y;
    
    constraint.width = if (constraint.width <= 0) width else constraint.width;
    constraint.height = if (constraint.height <= 0) height else constraint.height;

    return constraint
  }

}