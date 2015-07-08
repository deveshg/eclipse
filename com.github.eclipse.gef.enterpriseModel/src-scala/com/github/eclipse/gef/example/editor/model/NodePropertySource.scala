package com.github.eclipse.gef.example.editor.model

import org.eclipse.ui.views.properties.IPropertySource
import org.eclipse.ui.views.properties.IPropertyDescriptor
import scala.collection.mutable.ArrayBuffer
import org.eclipse.ui.views.properties.PropertyDescriptor
import org.eclipse.ui.views.properties.TextPropertyDescriptor
import org.eclipse.ui.views.properties.ColorPropertyDescriptor
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.RGB
import org.eclipse.jface.viewers.ICellEditorValidator
import org.eclipse.jface.viewers.ICellEditorValidator

class NodePropertySource(node: Node) extends IPropertySource {

  def getEditableValue(): Object = null

  def getPropertyDescriptors(): Array[IPropertyDescriptor] = {

    val numValidator = new ICellEditorValidator() {

      val message = (txt:String) => "Invalid Input : " + txt
      
      val b = (txt: String) => txt == null || txt.isEmpty() || !txt.matches("[0-9]+")

      def isValid(value: Any): String = if (!b(value.toString)) null else message(value.toString)

    }

    val properties = new ArrayBuffer[IPropertyDescriptor]

    properties += new TextPropertyDescriptor(Node.PROPERTY_RENAME, "Name");

    if (node.isInstanceOf[Service]) {
      properties += new ColorPropertyDescriptor(Service.PROPERTY_COLOR, "Color")
      val etagePropertyDesc = new TextPropertyDescriptor(Service.PROPERTY_FLOOR, "Etage")
      etagePropertyDesc.setValidator(numValidator)
      properties += etagePropertyDesc
    } else if (node.isInstanceOf[Entreprise]) {
      val capitalPropertyDesc = new TextPropertyDescriptor(Entreprise.PROPERTY_CAPITAL, "Capital")
      capitalPropertyDesc.setValidator(numValidator)
      properties += capitalPropertyDesc; ;
    } else if (node.isInstanceOf[Employe]) {
      properties += new TextPropertyDescriptor(Employe.PROPERTY_FIRSTNAME, "First Name");
    }

    return properties.toArray[IPropertyDescriptor]
  }

  def getPropertyValue(id: Any): Object = {

    return id match {
      case Node.PROPERTY_RENAME => node.getName()

      case Service.PROPERTY_COLOR => node.asInstanceOf[Service].getColor().getRGB()

      case Service.PROPERTY_FLOOR => node.asInstanceOf[Service].getEtage().toString

      case Entreprise.PROPERTY_CAPITAL => node.asInstanceOf[Entreprise].getCapital().toString

      case Employe.PROPERTY_FIRSTNAME => node.asInstanceOf[Employe].getPrenom()

      case _ => null

    }

  }

  def isPropertySet(x$1: Any): Boolean = false

  def resetPropertyValue(x$1: Any): Unit = {}

  def setPropertyValue(id: Any, value: Any): Unit = {

    id match {
      case Node.PROPERTY_RENAME => node.setName(value.toString)

      case Service.PROPERTY_COLOR => node.asInstanceOf[Service].setColor(
        new Color(null, value.asInstanceOf[RGB]))

      case Service.PROPERTY_FLOOR => node.asInstanceOf[Service].setEtage(value.toString.toInt)

      case Entreprise.PROPERTY_CAPITAL => node.asInstanceOf[Entreprise].setCapital(value.toString.toInt)

      case Employe.PROPERTY_FIRSTNAME => node.asInstanceOf[Employe].setPrenom(value.toString)

    }

  }

}