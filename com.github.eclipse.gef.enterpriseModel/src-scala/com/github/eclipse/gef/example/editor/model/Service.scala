package com.github.eclipse.gef.example.editor.model

import org.eclipse.swt.graphics.Color

class Service extends Node {

  private var etage: Int = _
  private var color: Color = _

  def setEtage(newEtage: Int): Unit = {
    val oldEtage = this.etage
    this.etage = newEtage
    getListeners().firePropertyChange(Service.PROPERTY_FLOOR, oldEtage, newEtage);
  }
  def getEtage(): Int = this.etage

  def setColor(newColor: Color): Unit = {
    val oldColor = this.color
    this.color = newColor
    getListeners().firePropertyChange(Service.PROPERTY_COLOR, oldColor, newColor);
  }
  def getColor(): Color = this.color

}

object Service {
  val PROPERTY_COLOR = "ServiceColor";
  val PROPERTY_FLOOR = "ServiceFloor";

  def getRandomColor(): Color = new Color(null,
    (Math.random() * 128).toInt + 128,
    (Math.random() * 128).toInt + 128,
    (Math.random() * 128).toInt + 128)

}