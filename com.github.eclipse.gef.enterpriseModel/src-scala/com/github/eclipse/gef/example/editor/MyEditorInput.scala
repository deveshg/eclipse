package com.github.eclipse.gef.example.editor

import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IPersistableElement

class MyEditorInput(name: String) extends IEditorInput {

  def getName(): String = this.name

  def exists(): Boolean = getName() != null

  def getToolTipText(): String = getName()

  def getPersistable(): IPersistableElement = null

  def getImageDescriptor(): ImageDescriptor = ImageDescriptor.getMissingImageDescriptor()

  def getAdapter(adapter: Class[_]): Object = null

}