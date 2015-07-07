package com.github.eclipse.gef.example.editor.parts

import org.eclipse.gef.EditPartListener
import org.eclipse.draw2d.IFigure
import org.eclipse.gef.commands.Command
import java.util.List
import org.eclipse.gef.editparts.AbstractGraphicalEditPart
import java.beans.PropertyChangeListener
import com.github.eclipse.gef.example.editor.model.Node
import org.eclipse.gef.Request
import org.eclipse.gef.RequestConstants
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.IPageLayout
import org.eclipse.ui.PartInitException
import org.eclipse.swt.widgets.Display

abstract class AppAbstractEditPart extends AbstractGraphicalEditPart with PropertyChangeListener {

  override def activate(): Unit = {
    super.activate();
    getModel().asInstanceOf[Node].addPropertyChangeListener(this);
  }

  override def deactivate(): Unit = {
    getModel().asInstanceOf[Node].removePropertyChangeListener(this);
    super.deactivate();

  }

  override def performRequest(req: Request): Unit = {
    if (req.getType().equals(RequestConstants.REQ_OPEN)) {
      Display.getDefault().asyncExec(new Runnable() {
        def run(): Unit = {
          try {
            val page =
              PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            page.showView(IPageLayout.ID_PROP_SHEET);
          } catch {
            case e: PartInitException => e.printStackTrace();
          }
        }
      })
    }
  }

}