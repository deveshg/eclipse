package com.github.eclipse.gef.example.editor.figure

import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.ToolbarLayout
import org.eclipse.draw2d.XYLayout
import org.eclipse.draw2d.LineBorder
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.swt.graphics.Color
import org.eclipse.draw2d.ToolbarLayout
import org.eclipse.draw2d.OrderedLayout

class ServiceFigure extends Figure {

  private val labelName = new Label();
  private val labelEtage = new Label();

  {
    val layout = new XYLayout();
    setLayoutManager(layout);

    labelName.setForegroundColor(ColorConstants.darkGray);
    add(labelName, OrderedLayout.ALIGN_CENTER);
    setConstraint(labelName, new Rectangle(5, 17, -1, -1));

    labelEtage.setForegroundColor(ColorConstants.black);
    add(labelEtage, OrderedLayout.ALIGN_CENTER);
    setConstraint(labelEtage, new Rectangle(5, 5, -1, -1));

    /** Just for Fun :) **/

    var randomInt128 = () => (Math.random() * 128).toInt

    setForegroundColor(new Color(null,
      randomInt128(),
      randomInt128(),
      randomInt128()))

    setBackgroundColor(new Color(null,
      randomInt128() + 128,
      randomInt128() + 128,
      randomInt128() + 128))

    setBorder(new LineBorder(1));
    setOpaque(true);
  }

  def setName(text: String): Unit = labelName.setText(text)
  def setEtage(etage: Int): Unit = labelEtage.setText("Etage:" + etage)
  
  def setLayout(rect: Rectangle): Unit = getParent().setConstraint(ServiceFigure.this, rect);

}