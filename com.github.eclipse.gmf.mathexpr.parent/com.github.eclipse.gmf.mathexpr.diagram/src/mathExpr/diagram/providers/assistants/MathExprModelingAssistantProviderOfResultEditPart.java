package mathExpr.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MathExprModelingAssistantProviderOfResultEditPart extends
		mathExpr.diagram.providers.MathExprModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((mathExpr.diagram.edit.parts.ResultEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			mathExpr.diagram.edit.parts.ResultEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001);
		types.add(mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(mathExpr.diagram.edit.parts.ResultEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			mathExpr.diagram.edit.parts.ResultEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof mathExpr.diagram.edit.parts.OperatorOutputEditPart) {
			types.add(mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001);
		}
		if (targetEditPart instanceof mathExpr.diagram.edit.parts.OperatorInputEditPart) {
			types.add(mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(mathExpr.diagram.edit.parts.ResultEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			mathExpr.diagram.edit.parts.ResultEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001) {
			types.add(mathExpr.diagram.providers.MathExprElementTypes.OperatorOutput_3002);
		} else if (relationshipType == mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002) {
			types.add(mathExpr.diagram.providers.MathExprElementTypes.OperatorInput_3001);
		}
		return types;
	}

}
