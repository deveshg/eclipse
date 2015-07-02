package mathExpr.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MathExprModelingAssistantProviderOfPlusOperatorEditPart extends
		mathExpr.diagram.providers.MathExprModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.OperatorInput_3001);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.OperatorOutput_3002);
		return types;
	}

}
