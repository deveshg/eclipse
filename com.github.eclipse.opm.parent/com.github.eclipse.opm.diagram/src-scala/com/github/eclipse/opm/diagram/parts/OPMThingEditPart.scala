package com.github.eclipse.opm.diagram.parts

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.opm.diagram.figures.OPMThingFigure
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.draw2d.geometry.Rectangle

abstract class OPMThingEditPart extends AbstractGraphicalEditPart {

  protected override def refreshVisuals(): Unit = {

    val figure = getFigure().asInstanceOf[OPMThingFigure]
    val model = getModel().asInstanceOf[OPMThing]

    val parent = getParent().asInstanceOf[ObjectProcessDiagramEditPart]

    figure.getNameLabel().setText(model.getName());

    val layout = new Rectangle(model.getConstraints().x, model.getConstraints().y,
      model.getConstraints().width, model.getConstraints().height)
    parent.setLayoutConstraint(this, figure, layout);
  }

}