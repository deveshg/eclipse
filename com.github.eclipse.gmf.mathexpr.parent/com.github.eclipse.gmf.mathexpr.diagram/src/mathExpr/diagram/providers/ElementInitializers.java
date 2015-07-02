package mathExpr.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = mathExpr.diagram.part.MathExprDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			mathExpr.diagram.part.MathExprDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
