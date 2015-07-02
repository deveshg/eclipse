package mathExpr.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MathExprVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.github.eclipse.gmf.mathexpr.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (mathExpr.diagram.edit.parts.MathDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mathExpr.diagram.part.MathExprVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				mathExpr.diagram.part.MathExprDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (mathExpr.MathExprPackage.eINSTANCE.getMathDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((mathExpr.MathDiagram) domainElement)) {
			return mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mathExpr.diagram.part.MathExprVisualIDRegistry
				.getModelID(containerView);
		if (!mathExpr.diagram.edit.parts.MathDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (mathExpr.diagram.edit.parts.MathDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			if (mathExpr.MathExprPackage.eINSTANCE.getPlusOperator()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID;
			}
			if (mathExpr.MathExprPackage.eINSTANCE.getMinusOperator()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID;
			}
			if (mathExpr.MathExprPackage.eINSTANCE.getEntry().isSuperTypeOf(
					domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID;
			}
			if (mathExpr.MathExprPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID;
			}
			break;
		case mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (mathExpr.MathExprPackage.eINSTANCE.getOperatorInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID;
			}
			if (mathExpr.MathExprPackage.eINSTANCE.getOperatorOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID;
			}
			break;
		case mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (mathExpr.MathExprPackage.eINSTANCE.getOperatorInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID;
			}
			if (mathExpr.MathExprPackage.eINSTANCE.getOperatorOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mathExpr.diagram.part.MathExprVisualIDRegistry
				.getModelID(containerView);
		if (!mathExpr.diagram.edit.parts.MathDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (mathExpr.diagram.edit.parts.MathDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = mathExpr.diagram.part.MathExprVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			if (mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
			if (mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
			if (mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(mathExpr.MathDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case mathExpr.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
		case mathExpr.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			return false;
		case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
		case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
		case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
		case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mathExpr.diagram.part.MathExprVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
