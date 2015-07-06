package com.github.eclipse.gef.example.editor.model

import org.eclipse.draw2d.geometry.Rectangle
import scala.collection.mutable.ListBuffer
import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener

class Node {

  import Node._

  private var name: String = "Unknown"
  private var layout: Rectangle = new Rectangle(10, 10, 100, 100)
  private var listeners = new PropertyChangeSupport(this);

  private var parent: Node = null
  private var children = new java.util.ArrayList[Node]

  def getName(): String = this.name
  def setName(newName: String): Unit = this.name = newName

  def getLayout(): Rectangle = this.layout

  def setLayout(newLayout: Rectangle): Unit = {
    var oldLayout = this.layout
    this.layout = newLayout
    getListeners().firePropertyChange(Node.PROPERTY_LAYOUT, oldLayout, newLayout);
  }

  def getParent(): Node = this.parent
  def setParent(newParent: Node): Unit = this.parent = newParent

  def addChild(child: Node): Boolean = {

    this.children.add(child)

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

}

object Node {
  val PROPERTY_LAYOUT = "NodeLayout";
  val PROPERTY_ADD = "NodeAddChild";
  val PROPERTY_REMOVE = "NodeRemoveChild";
}