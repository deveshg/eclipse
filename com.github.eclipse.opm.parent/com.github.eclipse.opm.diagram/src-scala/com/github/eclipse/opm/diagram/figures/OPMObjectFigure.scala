package com.github.eclipse.opm.diagram.figures

import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.XYLayout
import org.eclipse.draw2d.RectangleFigure
import org.eclipse.draw2d.Graphics

class OPMObjectFigure extends Figure with OPMThingFigure {
  var label: Label = _
  var rectangleFigure: RectangleFigure = _

  {
    setLayoutManager(new XYLayout)
    rectangleFigure = new RectangleFigure
    add(rectangleFigure)
    label = new Label
    add(label)
  }

  protected override def paintFigure(graphics: Graphics): Unit = {
    val r = getBounds().getCopy();
    setConstraint(rectangleFigure, new Rectangle(0, 0, r.width, r.height));
    setConstraint(label, new Rectangle(0, 0, r.width, r.height));
  }

  def getNameLabel(): Label = this.label

}