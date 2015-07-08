package com.github.eclipse.gef.example.editor.figure

import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.LineBorder
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.OrderedLayout
import org.eclipse.draw2d.ToolbarLayout

class EmployeFigure extends Figure {

  private val labelName = new Label();
  private val labelFirstName = new Label();

  {
    val layout = new ToolbarLayout();
    setLayoutManager(layout);

    labelFirstName.setForegroundColor(ColorConstants.black);
    add(labelFirstName, OrderedLayout.ALIGN_CENTER);

    labelName.setForegroundColor(ColorConstants.darkGray);
    add(labelName, OrderedLayout.ALIGN_CENTER);

    setForegroundColor(ColorConstants.darkGray);
    setBackgroundColor(ColorConstants.lightGray);

    setBorder(new LineBorder(1));
    setOpaque(true);
  }

  def setName(text: String) = labelName.setText(text)

  def setFirstName(text: String) = labelFirstName.setText(text)

  def setLayout(rect: Rectangle): Unit = getParent().setConstraint(EmployeFigure.this, rect);

}

object EmployeFigure {
  val EMPLOYE_FIGURE_DEFWIDTH = 200;
  val EMPLOYE_FIGURE_DEFHEIGHT = 40;
}