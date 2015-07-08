package com.github.eclipse.opm.diagram.figures

import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.Label

trait OPMThingFigure extends IFigure {

  def getNameLabel(): Label

}