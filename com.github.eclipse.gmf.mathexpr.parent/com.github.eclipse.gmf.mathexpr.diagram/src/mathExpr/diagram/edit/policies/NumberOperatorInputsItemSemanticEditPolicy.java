package mathExpr.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class NumberOperatorInputsItemSemanticEditPolicy extends
		mathExpr.diagram.edit.policies.MathExprBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NumberOperatorInputsItemSemanticEditPolicy() {
		super(
				mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
