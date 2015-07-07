package com.github.eclipse.gef.example.editor

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.draw2d.LightweightSystem
import org.eclipse.draw2d.Viewport
import org.eclipse.draw2d.parts.ScrollableThumbnail
import org.eclipse.gef.DefaultEditDomain
import org.eclipse.gef.KeyHandler
import org.eclipse.gef.KeyStroke
import org.eclipse.gef.LayerConstants
import org.eclipse.gef.MouseWheelHandler
import org.eclipse.gef.MouseWheelZoomHandler
import org.eclipse.gef.editparts.ScalableRootEditPart
import org.eclipse.gef.editparts.ZoomManager
import org.eclipse.gef.ui.actions.GEFActionConstants
import org.eclipse.gef.ui.actions.ZoomInAction
import org.eclipse.gef.ui.actions.ZoomOutAction
import org.eclipse.gef.ui.parts.ContentOutlinePage
import org.eclipse.gef.ui.parts.GraphicalEditor
import org.eclipse.swt.SWT
import org.eclipse.swt.custom.SashForm
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.widgets.Canvas
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.ui.actions.ActionFactory
import org.eclipse.ui.part.IPageSite
import org.eclipse.ui.views.contentoutline.IContentOutlinePage

import com.github.eclipse.gef.example.editor.parts.AppEditPartFactory
import com.github.eclipse.gef.example.editor.parts.tree.AppTreeEditPartFactory
import com.github.eclipse.gef.example.util.EntrepriseData

class MyEditor extends GraphicalEditor {

  var model = EntrepriseData.getFakeEnterprise()
  var keyHandler: KeyHandler = _

  {
    setEditDomain(new DefaultEditDomain(MyEditor.this))
  }

  def doSave(pm: IProgressMonitor): Unit = {}

  protected def initializeGraphicalViewer(): Unit = {
    val viewer = getGraphicalViewer()
    viewer.setContents(model)
  }

  protected override def configureGraphicalViewer(): Unit = {
    super.configureGraphicalViewer()

    val viewer = getGraphicalViewer()
    viewer.setEditPartFactory(new AppEditPartFactory())

    configureMyEditorZoomLevel()

    configureMyEditorKeyHandler()

    val provider = new AppContextMenuProvider(viewer,
      getActionRegistry());
    viewer.setContextMenu(provider);
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

    //  manager.setZoomLevelContributions(Arrays.asList(zoomContributions));

  }

  def configureMyEditorKeyHandler(): Unit = {
    keyHandler = new KeyHandler();
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

    var ref: AnyRef = null

    if (adapter == classOf[ZoomManager])
      getGraphicalViewer().getRootEditPart().asInstanceOf[ScalableRootEditPart].getZoomManager()
    else if (adapter == classOf[IContentOutlinePage])
      new OutlinePage()
    else
      super.getAdapter(adapter)
  }

  class OutlinePage extends ContentOutlinePage(new org.eclipse.gef.ui.parts.TreeViewer) {

    var sash: SashForm = _
    var thumbnail: ScrollableThumbnail = _
    var disposeListener: DisposeListener = _

    override def createControl(parent: Composite): Unit = {

      sash = new SashForm(parent, SWT.VERTICAL);

      getViewer().createControl(sash);
      getViewer().setEditDomain(getEditDomain());
      getViewer().setEditPartFactory(new AppTreeEditPartFactory());
      getViewer().setContents(MyEditor.this.model);
      getSelectionSynchronizer().addViewer(getViewer());

      createMinimizedView()
    }

    override def init(pageSite: IPageSite): Unit = {
      super.init(pageSite);
      // On hook les actions de l'editeur sur la toolbar
      val bars = getSite().getActionBars();

      bars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
        getActionRegistry().getAction(ActionFactory.UNDO.getId()));
      bars.setGlobalActionHandler(ActionFactory.REDO.getId(),
        getActionRegistry().getAction(ActionFactory.REDO.getId()));
      bars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
        getActionRegistry().getAction(ActionFactory.DELETE.getId()));
      bars.updateActionBars();

      getViewer().setKeyHandler(keyHandler);

      val provider = new AppContextMenuProvider(getViewer(),
        getActionRegistry());
      getViewer().setContextMenu(provider);
    }

    private def createMinimizedView(): Unit = {
      val canvas = new Canvas(sash, SWT.BORDER);
      val lws = new LightweightSystem(canvas);

      val rootEditPart = getGraphicalViewer().getRootEditPart().asInstanceOf[ScalableRootEditPart]

      thumbnail = new ScrollableThumbnail(rootEditPart.getFigure().asInstanceOf[Viewport])
      thumbnail.setSource(rootEditPart.getLayer(LayerConstants.PRINTABLE_LAYERS));

      lws.setContents(thumbnail);

      disposeListener = new DisposeListener() {
        override def widgetDisposed(e: DisposeEvent): Unit = {
          if (thumbnail != null) {
            thumbnail.deactivate();
            thumbnail = null;
          }
        }
      }
      getGraphicalViewer().getControl().addDisposeListener(disposeListener);
    }

    override def getControl(): Control = sash

    override def dispose(): Unit = {

      getSelectionSynchronizer().removeViewer(getViewer());

      if (getGraphicalViewer().getControl() != null && !getGraphicalViewer().getControl().isDisposed())
        getGraphicalViewer().getControl().removeDisposeListener(disposeListener);

      super.dispose();
    }

  }

}

object MyEditor {

  val EDITOR_ID = "com.github.eclipse.gef.enterpriseModel.EEditor"

}