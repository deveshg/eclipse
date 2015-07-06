package com.github.eclipse.gef.example.editor

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.gef.DefaultEditDomain
import org.eclipse.gef.ui.parts.GraphicalEditor
import com.github.eclipse.gef.example.editor.parts.AppEditPartFactory
import com.github.eclipse.gef.example.util.EntrepriseData
import org.eclipse.gef.editparts.ScalableRootEditPart
import org.eclipse.gef.ui.actions.ZoomInAction
import java.util.ArrayList
import org.eclipse.gef.editparts.ZoomManager
import org.eclipse.gef.ui.actions.ZoomOutAction
import org.eclipse.swt.SWT
import org.eclipse.gef.KeyHandler
import org.eclipse.gef.MouseWheelHandler
import org.eclipse.gef.KeyStroke
import org.eclipse.gef.MouseWheelZoomHandler
import org.eclipse.gef.ui.actions.GEFActionConstants
import org.eclipse.ui.actions.ActionFactory
import java.util.Arrays

class MyEditor extends GraphicalEditor {

  {
    setEditDomain(new DefaultEditDomain(MyEditor.this))
  }

  def doSave(pm: IProgressMonitor): Unit = {

  }

  protected def initializeGraphicalViewer(): Unit = {
    val viewer = getGraphicalViewer()
    viewer.setContents(EntrepriseData.getFakeEnterprise())
  }

  protected override def configureGraphicalViewer(): Unit = {
    super.configureGraphicalViewer()

    val viewer = getGraphicalViewer()
    viewer.setEditPartFactory(new AppEditPartFactory())

    configureMyEditorZoomLevel()

    configureMyEditorKeyHandler()
  }

  def configureMyEditorZoomLevel(): Unit = {

    val rootEditPart = new ScalableRootEditPart();
    getGraphicalViewer().setRootEditPart(rootEditPart);
    val manager = rootEditPart.getZoomManager();
    getActionRegistry().registerAction(new ZoomInAction(manager));
    getActionRegistry().registerAction(new ZoomOutAction(manager));

    // La liste des zooms possible. 1 = 100%
    var zoomLevels: Array[Double] =
      Array(0.25, 0.5, 0.75, 1.0,
        1.5, 2.0, 2.5, 3.0,
        4.0, 5.0, 10.0, 20.0);

    manager.setZoomLevels(zoomLevels);

    var zoomContributions = Array(
        ZoomManager.FIT_ALL, 
        ZoomManager.FIT_HEIGHT, 
        ZoomManager.FIT_WIDTH)
    
    manager.setZoomLevelContributions(Arrays.asList(zoomContributions));

  }

  def configureMyEditorKeyHandler(): Unit = {
    val keyHandler = new KeyHandler();
    keyHandler.put(
      KeyStroke.getPressed(SWT.DEL, 127, 0),
      getActionRegistry().getAction(ActionFactory.DELETE.getId()));
    keyHandler.put(
      KeyStroke.getPressed('+', SWT.KEYPAD_ADD, 0),
      getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
    keyHandler.put(
      KeyStroke.getPressed('-', SWT.KEYPAD_SUBTRACT, 0),
      getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));
    // On peut meme zoomer avec la molette de la souris.
    getGraphicalViewer().setProperty(
      MouseWheelHandler.KeyGenerator.getKey(SWT.NONE),
      MouseWheelZoomHandler.SINGLETON);
    getGraphicalViewer.setKeyHandler(keyHandler);
  }

  override def getAdapter(adapter: Class[_]): AnyRef = {
    if (adapter.isInstanceOf[ZoomManager])
      return getGraphicalViewer().getRootEditPart().asInstanceOf[ScalableRootEditPart]
        .getZoomManager()
    else
      return super.getAdapter(adapter);
  }

}

object MyEditor {

  val EDITOR_ID = "com.github.eclipse.gef.enterpriseModel.EEditor"

}