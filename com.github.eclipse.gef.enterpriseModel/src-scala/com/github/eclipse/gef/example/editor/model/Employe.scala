package com.github.eclipse.gef.example.editor.model

class Employe extends Node {

  private var prenom: String = _

  def setPrenom(newPrenom: String): Unit = this.prenom = newPrenom
  def getPrenom(): String = this.prenom

}