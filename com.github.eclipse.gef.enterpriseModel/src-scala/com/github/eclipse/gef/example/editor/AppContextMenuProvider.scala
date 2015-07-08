package com.github.eclipse.gef.example.editor

import org.eclipse.gef.ContextMenuProvider
import org.eclipse.gef.ui.actions.ActionRegistry
import org.eclipse.gef.EditPartViewer
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IAction
import org.eclipse.gef.ui.actions.GEFActionConstants
import org.eclipse.ui.actions.ActionFactory

class AppContextMenuProvider(viewer: EditPartViewer, registry: ActionRegistry)
  extends ContextMenuProvider(viewer) {

  val actionRegistry: ActionRegistry = registry

  override def buildContextMenu(menu: IMenuManager): Unit = {
    var action: IAction = null
    GEFActionConstants.addStandardActionGroups(menu);
    action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
    menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
    action = getActionRegistry().getAction(ActionFactory.REDO.getId());
    menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
    action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
    menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
  }

  private def getActionRegistry(): ActionRegistry = actionRegistry

}