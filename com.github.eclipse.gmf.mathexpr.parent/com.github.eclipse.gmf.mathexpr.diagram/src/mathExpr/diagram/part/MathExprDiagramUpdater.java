package mathExpr.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MathExprDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprNodeDescriptor> getSemanticChildren(
			View view) {
		switch (mathExpr.diagram.part.MathExprVisualIDRegistry
				.getVisualID(view)) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			return getMathDiagram_1000SemanticChildren(view);
		case mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			return getPlusOperatorPlusOperatorFigureCompartment_7001SemanticChildren(view);
		case mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			return getMinusOperatorMinusOperatorFigureCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprNodeDescriptor> getMathDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		mathExpr.MathDiagram modelElement = (mathExpr.MathDiagram) view
				.getElement();
		LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperators().iterator(); it
				.hasNext();) {
			mathExpr.Operator childElement = (mathExpr.Operator) it.next();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntries().iterator(); it
				.hasNext();) {
			mathExpr.Entry childElement = (mathExpr.Entry) it.next();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getResults().iterator(); it
				.hasNext();) {
			mathExpr.Result childElement = (mathExpr.Result) it.next();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprNodeDescriptor> getPlusOperatorPlusOperatorFigureCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		mathExpr.PlusOperator modelElement = (mathExpr.PlusOperator) containerView
				.getElement();
		LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			mathExpr.OperatorInput childElement = (mathExpr.OperatorInput) it
					.next();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			mathExpr.OperatorOutput childElement = modelElement.getOutput();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprNodeDescriptor> getMinusOperatorMinusOperatorFigureCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		mathExpr.MinusOperator modelElement = (mathExpr.MinusOperator) containerView
				.getElement();
		LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			mathExpr.OperatorInput childElement = (mathExpr.OperatorInput) it
					.next();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			mathExpr.OperatorOutput childElement = modelElement.getOutput();
			int visualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID) {
				result.add(new mathExpr.diagram.part.MathExprNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getContainedLinks(
			View view) {
		switch (mathExpr.diagram.part.MathExprVisualIDRegistry
				.getVisualID(view)) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			return getMathDiagram_1000ContainedLinks(view);
		case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2001ContainedLinks(view);
		case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2002ContainedLinks(view);
		case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
			return getEntry_2003ContainedLinks(view);
		case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
			return getResult_2004ContainedLinks(view);
		case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001ContainedLinks(view);
		case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getIncomingLinks(
			View view) {
		switch (mathExpr.diagram.part.MathExprVisualIDRegistry
				.getVisualID(view)) {
		case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2001IncomingLinks(view);
		case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2002IncomingLinks(view);
		case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
			return getEntry_2003IncomingLinks(view);
		case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
			return getResult_2004IncomingLinks(view);
		case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001IncomingLinks(view);
		case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (mathExpr.diagram.part.MathExprVisualIDRegistry
				.getVisualID(view)) {
		case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2001OutgoingLinks(view);
		case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2002OutgoingLinks(view);
		case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
			return getEntry_2003OutgoingLinks(view);
		case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
			return getResult_2004OutgoingLinks(view);
		case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001OutgoingLinks(view);
		case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getMathDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getPlusOperator_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getMinusOperator_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getEntry_2003ContainedLinks(
			View view) {
		mathExpr.Entry modelElement = (mathExpr.Entry) view.getElement();
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getResult_2004ContainedLinks(
			View view) {
		mathExpr.Result modelElement = (mathExpr.Result) view.getElement();
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Result_OperatorOutput_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorInput_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorOutput_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getPlusOperator_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getMinusOperator_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getEntry_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getResult_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorInput_3001IncomingLinks(
			View view) {
		mathExpr.OperatorInput modelElement = (mathExpr.OperatorInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Number_OperatorInputs_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorOutput_3002IncomingLinks(
			View view) {
		mathExpr.OperatorOutput modelElement = (mathExpr.OperatorOutput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Result_OperatorOutput_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getPlusOperator_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getMinusOperator_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getEntry_2003OutgoingLinks(
			View view) {
		mathExpr.Entry modelElement = (mathExpr.Entry) view.getElement();
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getResult_2004OutgoingLinks(
			View view) {
		mathExpr.Result modelElement = (mathExpr.Result) view.getElement();
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Result_OperatorOutput_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorInput_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<mathExpr.diagram.part.MathExprLinkDescriptor> getOperatorOutput_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<mathExpr.diagram.part.MathExprLinkDescriptor> getIncomingFeatureModelFacetLinks_Result_OperatorOutput_4001(
			mathExpr.OperatorOutput target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == mathExpr.MathExprPackage.eINSTANCE
					.getResult_OperatorOutput()) {
				result.add(new mathExpr.diagram.part.MathExprLinkDescriptor(
						setting.getEObject(),
						target,
						mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001,
						mathExpr.diagram.edit.parts.ResultOperatorOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<mathExpr.diagram.part.MathExprLinkDescriptor> getIncomingFeatureModelFacetLinks_Number_OperatorInputs_4002(
			mathExpr.OperatorInput target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == mathExpr.MathExprPackage.eINSTANCE
					.getNumber_OperatorInputs()) {
				result.add(new mathExpr.diagram.part.MathExprLinkDescriptor(
						setting.getEObject(),
						target,
						mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002,
						mathExpr.diagram.edit.parts.NumberOperatorInputsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<mathExpr.diagram.part.MathExprLinkDescriptor> getOutgoingFeatureModelFacetLinks_Result_OperatorOutput_4001(
			mathExpr.Result source) {
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		mathExpr.OperatorOutput destination = source.getOperatorOutput();
		if (destination == null) {
			return result;
		}
		result.add(new mathExpr.diagram.part.MathExprLinkDescriptor(
				source,
				destination,
				mathExpr.diagram.providers.MathExprElementTypes.ResultOperatorOutput_4001,
				mathExpr.diagram.edit.parts.ResultOperatorOutputEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<mathExpr.diagram.part.MathExprLinkDescriptor> getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4002(
			mathExpr.Number source) {
		LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor> result = new LinkedList<mathExpr.diagram.part.MathExprLinkDescriptor>();
		for (Iterator<?> destinations = source.getOperatorInputs().iterator(); destinations
				.hasNext();) {
			mathExpr.OperatorInput destination = (mathExpr.OperatorInput) destinations
					.next();
			result.add(new mathExpr.diagram.part.MathExprLinkDescriptor(
					source,
					destination,
					mathExpr.diagram.providers.MathExprElementTypes.NumberOperatorInputs_4002,
					mathExpr.diagram.edit.parts.NumberOperatorInputsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<mathExpr.diagram.part.MathExprNodeDescriptor> getSemanticChildren(
				View view) {
			return MathExprDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<mathExpr.diagram.part.MathExprLinkDescriptor> getContainedLinks(
				View view) {
			return MathExprDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<mathExpr.diagram.part.MathExprLinkDescriptor> getIncomingLinks(
				View view) {
			return MathExprDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<mathExpr.diagram.part.MathExprLinkDescriptor> getOutgoingLinks(
				View view) {
			return MathExprDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
