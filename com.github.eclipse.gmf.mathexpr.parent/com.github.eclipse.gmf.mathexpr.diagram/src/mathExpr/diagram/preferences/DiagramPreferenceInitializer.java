package mathExpr.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		mathExpr.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		mathExpr.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		mathExpr.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		mathExpr.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		mathExpr.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return mathExpr.diagram.part.MathExprDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
