package mathExpr.diagram.edit.parts.custom;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
 
public class MinusRoundedRectangle extends RoundedRectangle {
 
	public MinusRoundedRectangle() {
		super();
		setLineWidth(2);
	}
 
	public void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setLineStyle(Graphics.LINE_SOLID);
		graphics.setLineWidth(3);
		Rectangle r = getBounds();
		// horizontal line
		graphics.drawLine(
				new Point(r.x + r.width * 0.2, r.y + r.height / 2),
				new Point(r.x + r.width * 0.8, r.y + r.height / 2));
	};
 
}