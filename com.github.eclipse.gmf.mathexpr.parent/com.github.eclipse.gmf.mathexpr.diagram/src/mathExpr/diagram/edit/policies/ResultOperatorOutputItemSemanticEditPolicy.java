package mathExpr.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ResultOperatorOutputItemSemanticEditPolicy extends
		mathExpr.diagram.edit.policies.MathExprBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultOperatorOutputItemSemanticEditPolicy() {
		super(
				mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
