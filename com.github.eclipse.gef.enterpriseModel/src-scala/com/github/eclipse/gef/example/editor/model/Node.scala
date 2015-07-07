package com.github.eclipse.gef.example.editor.model

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

import org.eclipse.core.runtime.IAdaptable
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.ui.views.properties.IPropertySource

class Node extends IAdaptable {

  import Node._

  private var name: String = "Unknown" //$NON-NLS-1$
  private var layout: Rectangle = new Rectangle(10, 10, 100, 100)
  private var listeners = new PropertyChangeSupport(this);

  private var parent: Node = null
  private var children = new java.util.ArrayList[Node]

  private var propertySource: IPropertySource = _

  def getName(): String = this.name
  def setName(newName: String): Unit = {
    val oldName = this.name
    this.name = newName
    getListeners().firePropertyChange(Node.PROPERTY_RENAME, oldName, newName);
  }

  def getLayout(): Rectangle = this.layout

  def setLayout(newLayout: Rectangle): Unit = {
    var oldLayout = this.layout
    this.layout = newLayout
    getListeners().firePropertyChange(Node.PROPERTY_LAYOUT, oldLayout, newLayout);
  }

  def getParent(): Node = this.parent
  def setParent(newParent: Node): Unit = this.parent = newParent

  def addChild(child: Node): Boolean = {
    val b = this.children.add(child);
    if (b) {
      child.setParent(Node.this);
      getListeners().firePropertyChange(PROPERTY_ADD, null, child);
    }
    return b;

  }

  def removeChild(child: Node): Boolean = {
    val b = this.children.remove(child);
    if (b)
      getListeners().firePropertyChange(PROPERTY_REMOVE, child, null);
    return b;
  }

  def getChildrenArray(): java.util.List[Node] = this.children

  def addPropertyChangeListener(listener: PropertyChangeListener) =
    listeners.addPropertyChangeListener(listener)

  def removePropertyChangeListener(listener: PropertyChangeListener) =
    listeners.removePropertyChangeListener(listener)

  def getListeners(): PropertyChangeSupport = this.listeners

  override def getAdapter(adapter: Class[_]): AnyRef = {
    if (adapter == classOf[IPropertySource]) {
      if (propertySource == null)
        propertySource = new NodePropertySource(this)
      return propertySource
    } else
      return null
  }

}

object Node {
  val PROPERTY_LAYOUT = "NodeLayout";
  val PROPERTY_ADD = "NodeAddChild";
  val PROPERTY_REMOVE = "NodeRemoveChild";
  val PROPERTY_RENAME = "NodeRENAME"

}