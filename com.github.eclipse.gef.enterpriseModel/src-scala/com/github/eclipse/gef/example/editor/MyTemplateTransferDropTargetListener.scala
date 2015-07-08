package com.github.eclipse.gef.example.editor

import org.eclipse.gef.dnd.TemplateTransferDropTargetListener
import org.eclipse.gef.EditPartViewer
import org.eclipse.gef.requests.CreationFactory
import com.github.eclipse.gef.example.editor.requests.NodeCreationFactory

class MyTemplateTransferDropTargetListener(viewer: EditPartViewer) 
	extends TemplateTransferDropTargetListener(viewer) {

  protected override def getFactory(template: Any): CreationFactory =
    new NodeCreationFactory(template.getClass);

}