package com.github.eclipse.gef.example.editor

import org.eclipse.gef.ui.actions.ActionBarContributor
import org.eclipse.gef.ui.actions.RedoRetargetAction
import org.eclipse.gef.ui.actions.UndoRetargetAction
import org.eclipse.ui.actions.ActionFactory
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.gef.ui.actions.DeleteRetargetAction
import org.eclipse.gef.ui.actions.ZoomInRetargetAction
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction
import org.eclipse.gef.ui.actions.ZoomComboContributionItem
import org.eclipse.gef.ui.actions.GEFActionConstants

class MyActionBarContributor extends ActionBarContributor {

  protected def buildActions(): Unit = {
    addRetargetAction(new UndoRetargetAction());
    addRetargetAction(new RedoRetargetAction());
    addRetargetAction(new DeleteRetargetAction())

    addRetargetAction(new ZoomInRetargetAction());
    addRetargetAction(new ZoomOutRetargetAction());

  }
  protected def declareGlobalActionKeys(): Unit = {
  }

  override def contributeToToolBar(toolBarManager: IToolBarManager): Unit = {
    toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
    toolBarManager.add(getAction(ActionFactory.REDO.getId()));
    toolBarManager.add(getAction(ActionFactory.DELETE.getId()));

    toolBarManager.add(getAction(GEFActionConstants.ZOOM_IN));
    toolBarManager.add(getAction(GEFActionConstants.ZOOM_OUT));
    toolBarManager.add(new ZoomComboContributionItem(getPage()));
  }

}