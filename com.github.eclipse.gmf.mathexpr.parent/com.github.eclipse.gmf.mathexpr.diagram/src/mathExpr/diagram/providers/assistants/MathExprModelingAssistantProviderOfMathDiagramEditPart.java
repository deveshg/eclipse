package mathExpr.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MathExprModelingAssistantProviderOfMathDiagramEditPart extends
		mathExpr.diagram.providers.MathExprModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.PlusOperator_2001);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.MinusOperator_2002);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.Entry_2003);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.Result_2004);
		return types;
	}

}
