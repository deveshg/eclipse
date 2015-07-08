package com.github.eclipse.gef.example.editor.model

class Employe extends Node {

  private var prenom: String = _

  {
    setPrenom("Unknown") //$NON-NLS-1$
  }

  def setPrenom(newPrenom: String): Unit = {
    val oldPreNom = this.prenom
    this.prenom = newPrenom
    getListeners().firePropertyChange(Employe.PROPERTY_FIRSTNAME, oldPreNom, newPrenom);
  }
  def getPrenom(): String = this.prenom

  override def clone(): Employe = {
    val emp = new Employe
    emp.setPrenom(getPrenom)
    copyPropertyToClone(emp)
    return emp
  }

}

object Employe {
  val PROPERTY_FIRSTNAME = "EmployePrenom";
}