package com.github.eclipse.gef.example.editor.model

class Entreprise extends Node {

  private var address: String = _
  private var capital: Int = _

  def setAddress(newAddress: String): Unit = this.address = newAddress
  def getAddress(): String = this.address

  def setCapital(newCapital: Int): Unit = this.capital = newCapital
  def getCapital(): Int = this.capital

}