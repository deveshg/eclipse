package com.github.eclipse.opm.diagram.parts

import java.util.List
import org.eclipse.draw2d.FreeformLayer
import org.eclipse.draw2d.FreeformLayout
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.LineBorder
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import com.github.eclipse.opm.model.OPMObject
import com.github.eclipse.opm.model.OPMObjectProcessDiagram
import com.github.eclipse.opm.model.OPMThing
import com.github.eclipse.opm.diagram.policies.OPMObjectProcessDiagramXYLayoutPolicy
import org.eclipse.gef.EditPolicy
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.Adapter

class ObjectProcessDiagramEditPart extends AbstractGraphicalEditPart {

  var adapter = new OPMObjectProcessDiagramAdapter

  protected override def createEditPolicies(): Unit = {
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new OPMObjectProcessDiagramXYLayoutPolicy());
  }

  protected override def createFigure(): IFigure = {
    val layer = new FreeformLayer
    layer.setLayoutManager(new FreeformLayout)
    layer.setBorder(new LineBorder(1))
    return layer
  }

  protected override def getModelChildren(): java.util.List[OPMThing] = {
    val objects = new java.util.ArrayList[OPMThing]
    val opd = getModel().asInstanceOf[OPMObjectProcessDiagram]

    objects.addAll(opd.getThings())
    return objects
  }

  /**
   *  @see EditPart#activate()
   */
  override def activate(): Unit = {
    if (!isActive()) {
      getModel().asInstanceOf[OPMObjectProcessDiagram].eAdapters().add(adapter);
    }
    super.activate();
  }

  override def deactivate(): Unit = {
    if (isActive()) {
      getModel().asInstanceOf[OPMObjectProcessDiagram].eAdapters().remove(adapter);
    }
    super.deactivate();
  }

  class OPMObjectProcessDiagramAdapter extends Adapter {
    def getTarget(): Notifier = getModel().asInstanceOf[OPMObjectProcessDiagram]
    def isAdapterForType(adapter: Any): Boolean = adapter == classOf[OPMObjectProcessDiagram]
    def notifyChanged(x$1: Notification): Unit = refreshChildren()
    def setTarget(x$1: Notifier): Unit = {}
  }

}