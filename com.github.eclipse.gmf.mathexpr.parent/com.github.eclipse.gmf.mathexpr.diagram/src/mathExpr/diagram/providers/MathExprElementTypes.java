package mathExpr.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MathExprElementTypes {

	/**
	 * @generated
	 */
	private MathExprElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			mathExpr.diagram.part.MathExprDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MathDiagram_1000 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.MathDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlusOperator_2001 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.PlusOperator_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MinusOperator_2002 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.MinusOperator_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entry_2003 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.Entry_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Result_2004 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.Result_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatorInput_3001 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.OperatorInput_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatorOutput_3002 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.OperatorOutput_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ResultOperatorOutput_4001 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.ResultOperatorOutput_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NumberOperatorInputs_4002 = getElementType("com.github.eclipse.gmf.mathexpr.diagram.NumberOperatorInputs_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MathDiagram_1000,
					mathExpr.MathExprPackage.eINSTANCE.getMathDiagram());

			elements.put(PlusOperator_2001,
					mathExpr.MathExprPackage.eINSTANCE.getPlusOperator());

			elements.put(MinusOperator_2002,
					mathExpr.MathExprPackage.eINSTANCE.getMinusOperator());

			elements.put(Entry_2003,
					mathExpr.MathExprPackage.eINSTANCE.getEntry());

			elements.put(Result_2004,
					mathExpr.MathExprPackage.eINSTANCE.getResult());

			elements.put(OperatorInput_3001,
					mathExpr.MathExprPackage.eINSTANCE.getOperatorInput());

			elements.put(OperatorOutput_3002,
					mathExpr.MathExprPackage.eINSTANCE.getOperatorOutput());

			elements.put(ResultOperatorOutput_4001,
					mathExpr.MathExprPackage.eINSTANCE
							.getResult_OperatorOutput());

			elements.put(NumberOperatorInputs_4002,
					mathExpr.MathExprPackage.eINSTANCE
							.getNumber_OperatorInputs());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MathDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(PlusOperator_2001);
			KNOWN_ELEMENT_TYPES.add(MinusOperator_2002);
			KNOWN_ELEMENT_TYPES.add(Entry_2003);
			KNOWN_ELEMENT_TYPES.add(Result_2004);
			KNOWN_ELEMENT_TYPES.add(OperatorInput_3001);
			KNOWN_ELEMENT_TYPES.add(OperatorOutput_3002);
			KNOWN_ELEMENT_TYPES.add(ResultOperatorOutput_4001);
			KNOWN_ELEMENT_TYPES.add(NumberOperatorInputs_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case mathExpr.diagram.edit.parts.MathDiagramEditPart.VISUAL_ID:
			return MathDiagram_1000;
		case mathExpr.diagram.edit.parts.PlusOperatorEditPart.VISUAL_ID:
			return PlusOperator_2001;
		case mathExpr.diagram.edit.parts.MinusOperatorEditPart.VISUAL_ID:
			return MinusOperator_2002;
		case mathExpr.diagram.edit.parts.EntryEditPart.VISUAL_ID:
			return Entry_2003;
		case mathExpr.diagram.edit.parts.ResultEditPart.VISUAL_ID:
			return Result_2004;
		case mathExpr.diagram.edit.parts.OperatorInputEditPart.VISUAL_ID:
			return OperatorInput_3001;
		case mathExpr.diagram.edit.parts.OperatorOutputEditPart.VISUAL_ID:
			return OperatorOutput_3002;
		case mathExpr.diagram.edit.parts.ResultOperatorOutputEditPart.VISUAL_ID:
			return ResultOperatorOutput_4001;
		case mathExpr.diagram.edit.parts.NumberOperatorInputsEditPart.VISUAL_ID:
			return NumberOperatorInputs_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return mathExpr.diagram.providers.MathExprElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return mathExpr.diagram.providers.MathExprElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return mathExpr.diagram.providers.MathExprElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
