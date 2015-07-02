package mathExpr.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MathExprEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (mathExpr.diagram.part.MathExprVisualIDRegistry
					.getVisualID(view)) {

			case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.MathDiagramEditPart(view);

			case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.PlusOperatorEditPart(
						view);

			case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.MinusOperatorEditPart(
						view);

			case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.EntryEditPart(view);

			case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.ResultEditPart(view);

			case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.OperatorInputEditPart(
						view);

			case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.OperatorOutputEditPart(
						view);

			case mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart(
						view);

			case mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart(
						view);

			case mathExpr.diagram.edit.parts.ResultOperatorOutputEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.ResultOperatorOutputEditPart(
						view);

			case mathExpr.diagram.edit.parts.NumberOperatorInputsEditPart.VISUAL_ID:
				return new mathExpr.diagram.edit.parts.NumberOperatorInputsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
