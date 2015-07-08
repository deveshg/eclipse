package com.github.eclipse.gef.example.editor.model

class Entreprise extends Node {

  import Entreprise._

  private var address: String = _
  private var capital: Int = _

  def setAddress(newAddress: String): Unit = this.address = newAddress
  def getAddress(): String = this.address

  def setCapital(newCapital: Int): Unit = {
    val oldCaptital = this.capital
    this.capital = newCapital
    getListeners().firePropertyChange(Entreprise.PROPERTY_CAPITAL, oldCaptital, newCapital);
  }
  def getCapital(): Int = this.capital

  override def clone(): Entreprise = ???

}

object Entreprise {
  val PROPERTY_CAPITAL = "EntrepriseCapital";
}