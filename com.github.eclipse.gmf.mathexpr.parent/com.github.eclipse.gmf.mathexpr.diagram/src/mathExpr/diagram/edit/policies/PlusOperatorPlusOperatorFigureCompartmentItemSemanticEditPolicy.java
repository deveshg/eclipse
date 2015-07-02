package mathExpr.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PlusOperatorPlusOperatorFigureCompartmentItemSemanticEditPolicy
		extends
		mathExpr.diagram.edit.policies.MathExprBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlusOperatorPlusOperatorFigureCompartmentItemSemanticEditPolicy() {
		super(mathExpr.diagram.providers.MathExprElementTypes.PlusOperator_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (mathExpr.diagram.providers.MathExprElementTypes.OperatorInput_3001 == req
				.getElementType()) {
			return getGEFWrapper(new mathExpr.diagram.edit.commands.OperatorInputCreateCommand(
					req));
		}
		if (mathExpr.diagram.providers.MathExprElementTypes.OperatorOutput_3002 == req
				.getElementType()) {
			return getGEFWrapper(new mathExpr.diagram.edit.commands.OperatorOutputCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
