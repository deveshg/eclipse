package mathExpr.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MathExprModelingAssistantProviderOfOperatorInputEditPart extends
		mathExpr.diagram.providers.MathExprModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((mathExpr.diagram.edit.parts.OperatorInputEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			mathExpr.diagram.edit.parts.OperatorInputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(mathExpr.diagram.edit.parts.OperatorInputEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			mathExpr.diagram.edit.parts.OperatorInputEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002) {
			types.add(mathExpr.diagram.providers.MathExprElementTypes.Entry_2003);
			types.add(mathExpr.diagram.providers.MathExprElementTypes.Result_2004);
		}
		return types;
	}

}
