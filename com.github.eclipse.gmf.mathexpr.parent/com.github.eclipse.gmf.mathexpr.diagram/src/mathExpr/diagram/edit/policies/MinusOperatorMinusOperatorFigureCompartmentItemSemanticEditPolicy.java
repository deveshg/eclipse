package mathExpr.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MinusOperatorMinusOperatorFigureCompartmentItemSemanticEditPolicy
		extends
		mathExpr.diagram.edit.policies.MathExprBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MinusOperatorMinusOperatorFigureCompartmentItemSemanticEditPolicy() {
		super(
				mathExpr.diagram.providers.MathExprElementTypes.MinusOperator_2002);
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
