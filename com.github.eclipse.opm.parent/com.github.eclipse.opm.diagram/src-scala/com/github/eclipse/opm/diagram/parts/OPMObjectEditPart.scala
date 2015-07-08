package com.github.eclipse.opm.diagram.parts

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import org.eclipse.draw2d.IFigure
import com.github.eclipse.opm.diagram.figures.OPMObjectFigure
import com.github.eclipse.opm.model.OPMObject
import scala.util.Random
import org.eclipse.draw2d.geometry.Rectangle

class OPMObjectEditPart extends OPMThingEditPart {

  protected override def createEditPolicies(): Unit = {}

  protected override def createFigure(): IFigure = new OPMObjectFigure

}