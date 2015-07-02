package mathExpr.diagram.edit.parts.custom;
import java.util.List;

import mathExpr.diagram.edit.parts.OperatorInputEditPart;
import mathExpr.diagram.edit.parts.OperatorOutputEditPart;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
 
public class OperatorCompartmentFigureListener implements FigureListener {
 
	private ListCompartmentEditPart compartmentEditPart = null;
	private RoundedRectangle roundedRectangle = null;
 
	public static final double MARGIN = 20; // The margin to apply before drawing our operator
	public static final double R = 50; // The base length
	public static final double REF_W = 2 * MARGIN + R * 6; // Reference width
	public static final double REF_H = 2 * MARGIN + R * 5; // Reference height
 
	public OperatorCompartmentFigureListener(ListCompartmentEditPart compartmentEditPart, RoundedRectangle roundedRectangle) {
		this.compartmentEditPart = compartmentEditPart;
		this.roundedRectangle = roundedRectangle;
	}
 
	@Override
	public void figureMoved(IFigure f) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;
		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();
			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right) / REF_W;
			double yScale = ((double) figure.getSize().height - is.top - is.bottom) / REF_H;
 
			// Set the constraints (bounds) for the rounded rectangle
			Rectangle constraint = new Rectangle(
					(int) ((MARGIN + R) * xScale),
					(int) ((MARGIN) * yScale), 
					(int) (R * 4 * xScale),
					(int) (R * 5 * yScale));
			contentPane.setConstraint(roundedRectangle, constraint);
 
			// Set the constraints for the input and output nodes
			List<AbstractEditPart> childs = compartmentEditPart.getChildren();
			boolean firstInputProcessed = false;
			for (AbstractEditPart child : childs) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					// Operator output ?
					if (gEditPart instanceof OperatorOutputEditPart) {
						constraint = new Rectangle(
								(int) ((REF_W - MARGIN - R) * xScale),
								(int) ((REF_H - R) / 2 * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
					}
					// Operator input ?
					else if (gEditPart instanceof OperatorInputEditPart) {
						constraint = new Rectangle(
								(int) (MARGIN * xScale),
								!firstInputProcessed ? (int) ((MARGIN + R) * yScale) : (int) ((MARGIN + R * 3) * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
						firstInputProcessed = true; // This boolean heps to know if we process the first or the seconde operator input
					}
				}
			}
		}
	}
 
}