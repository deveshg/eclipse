package com.github.eclipse.opm.diagram.parts

import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.opm.diagram.figures.OPMThingFigure
import com.github.eclipse.opm.model.OPMThing
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.notify.Notification

abstract class OPMThingEditPart extends AbstractGraphicalEditPart {

  val adapter: Adapter = new OPMThingAdapter

  protected override def refreshVisuals(): Unit = {

    val figure = getFigure().asInstanceOf[OPMThingFigure]
    val model = getModel().asInstanceOf[OPMThing]

    val parent = getParent().asInstanceOf[ObjectProcessDiagramEditPart]

    figure.getNameLabel().setText(model.getName());

    val layout = new Rectangle(model.getConstraints().x, model.getConstraints().y,
      model.getConstraints().width, model.getConstraints().height)
    parent.setLayoutConstraint(this, figure, layout);
  }
  

  class OPMThingAdapter extends Adapter {
    def getTarget(): Notifier = getModel().asInstanceOf[OPMThing]
    def isAdapterForType(adapter: Any): Boolean = adapter == classOf[OPMThing]
    def notifyChanged(x$1: Notification): Unit = refreshVisuals()
    def setTarget(x$1: Notifier): Unit = {}
  }
}