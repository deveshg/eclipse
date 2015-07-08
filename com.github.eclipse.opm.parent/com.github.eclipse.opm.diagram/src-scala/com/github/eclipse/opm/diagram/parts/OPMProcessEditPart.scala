package com.github.eclipse.opm.diagram.parts

import com.github.eclipse.opm.diagram.figures.OPMObjectFigure
import org.eclipse.draw2d.IFigure
import com.github.eclipse.opm.diagram.figures.OPMProcessFigure

class OPMProcessEditPart extends OPMThingEditPart {

  protected override def createEditPolicies(): Unit = {}

  protected override def createFigure(): IFigure = new OPMProcessFigure

}