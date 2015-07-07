package com.github.eclipse.gef.example.editor.model

class Employe extends Node {

  private var prenom: String = _

  def setPrenom(newPrenom: String): Unit = {
    val oldPreNom = this.prenom
    this.prenom = newPrenom
    getListeners().firePropertyChange(Employe.PROPERTY_FIRSTNAME, oldPreNom, newPrenom);
  }
  def getPrenom(): String = this.prenom

}

object Employe {
  val PROPERTY_FIRSTNAME = "EmployePrenom";
}