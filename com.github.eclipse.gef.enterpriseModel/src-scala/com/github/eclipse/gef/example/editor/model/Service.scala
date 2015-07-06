package com.github.eclipse.gef.example.editor.model

class Service extends Node {

  private var etage: Int = _

  def setEtage(newEtage: Int): Unit = this.etage = newEtage
  def getEtage(): Int = this.etage

}