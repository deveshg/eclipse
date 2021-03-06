package com.github.eclipse.gef.example.editor.figure

import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.XYLayout
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.LineBorder
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder
import org.eclipse.draw2d.Graphics

class EntrepriseFigure extends Figure {

  private val labelName = new Label()
  private val labelAddress = new Label()
  private val labelCapital = new Label()

  private[this] var layout: XYLayout = _

  {
    layout = new XYLayout();
    setLayoutManager(layout);

    labelName.setForegroundColor(ColorConstants.blue);
    add(labelName);
    setConstraint(labelName, new Rectangle(5, 5, -1, -1));

    labelAddress.setForegroundColor(ColorConstants.lightBlue);
    add(labelAddress);
    setConstraint(labelAddress, new Rectangle(5, 17, -1, -1));

    labelCapital.setForegroundColor(ColorConstants.lightBlue);
    add(labelCapital);
    setConstraint(labelCapital, new Rectangle(5, 30, -1, -1));

    setForegroundColor(ColorConstants.black);

    var border = new LineBorder(2)
    border.setStyle(Graphics.LINE_DASHDOTDOT)
    setBorder(border);
  }

  def setLayout(rect: Rectangle): Unit = setBounds(rect)

  def setName(name: String): Unit = labelName.setText(name)

  def setAddress(address: String): Unit = labelAddress.setText(address)

  def setCapital(capital: Int): Unit = {

    var getCaptialText = () => StringBuilder.newBuilder.append("Capital :").append(capital).toString

    labelCapital.setText(getCaptialText())

  }

}
