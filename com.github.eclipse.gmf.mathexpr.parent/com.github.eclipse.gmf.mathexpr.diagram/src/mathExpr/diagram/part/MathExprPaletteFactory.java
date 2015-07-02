package mathExpr.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MathExprPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMathExpr1Group());
	}

	/**
	 * Creates "mathExpr" palette tool group
	 * @generated
	 */
	private PaletteContainer createMathExpr1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				mathExpr.diagram.part.Messages.MathExpr1Group_title);
		paletteContainer.setId("createMathExpr1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntry1CreationTool());
		paletteContainer.add(createNumberOperatorInputs2CreationTool());
		paletteContainer.add(createMinusOperator3CreationTool());
		paletteContainer.add(createOperatorOutputResult4CreationTool());
		paletteContainer.add(createPlusOperator5CreationTool());
		paletteContainer.add(createResult6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntry1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.Entry1CreationTool_title,
				mathExpr.diagram.part.Messages.Entry1CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.Entry_2003));
		entry.setId("createEntry1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.Entry_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNumberOperatorInputs2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.NumberOperatorInputs2CreationTool_title,
				mathExpr.diagram.part.Messages.NumberOperatorInputs2CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.OperatorInput_3001));
		entry.setId("createNumberOperatorInputs2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.OperatorInput_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMinusOperator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.MinusOperator3CreationTool_title,
				mathExpr.diagram.part.Messages.MinusOperator3CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.MinusOperator_2002));
		entry.setId("createMinusOperator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.MinusOperator_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperatorOutputResult4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.OperatorOutputResult4CreationTool_title,
				mathExpr.diagram.part.Messages.OperatorOutputResult4CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.OperatorOutput_3002));
		entry.setId("createOperatorOutputResult4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.OperatorOutput_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlusOperator5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.PlusOperator5CreationTool_title,
				mathExpr.diagram.part.Messages.PlusOperator5CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.PlusOperator_2001));
		entry.setId("createPlusOperator5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.PlusOperator_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResult6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				mathExpr.diagram.part.Messages.Result6CreationTool_title,
				mathExpr.diagram.part.Messages.Result6CreationTool_desc,
				Collections
						.singletonList(mathExpr.diagram.providers.MathExprElementTypes.Result_2004));
		entry.setId("createResult6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(mathExpr.diagram.providers.MathExprElementTypes
				.getImageDescriptor(mathExpr.diagram.providers.MathExprElementTypes.Result_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
