package com.github.eclipse.opm.diagram.figures

import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.ConnectionAnchor
import org.eclipse.draw2d.Ellipse
import org.eclipse.draw2d.XYLayout
import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.EllipseAnchor

class OPMProcessFigure extends Figure with OPMThingFigure {
  var label: Label = _
  var ellipseFigure: Ellipse = _
  var connectionAnchor: ConnectionAnchor = _

  {
    setLayoutManager(new XYLayout)
    ellipseFigure = new Ellipse
    add(ellipseFigure)
    label = new Label
    add(label)
  }

  /**
   *  @see Figure#paintFigure()
   */
  protected override def paintFigure(graphics: Graphics): Unit = {
    val r = getBounds().getCopy();
    setConstraint(ellipseFigure, new Rectangle(0, 0, r.width, r.height));
    setConstraint(label, new Rectangle(0, 0, r.width, r.height));

    ellipseFigure.invalidate();
    label.invalidate();
  }

  def getNameLabel(): Label = this.label

  def getConnectionAnchor(): ConnectionAnchor = {
    if (connectionAnchor == null)
      connectionAnchor = new EllipseAnchor(OPMProcessFigure.this)
    return connectionAnchor
  }

}