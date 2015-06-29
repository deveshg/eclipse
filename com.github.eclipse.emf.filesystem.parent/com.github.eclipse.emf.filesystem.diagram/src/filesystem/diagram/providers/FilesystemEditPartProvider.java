package filesystem.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import filesystem.diagram.edit.parts.FilesystemEditPart;
import filesystem.diagram.edit.parts.FilesystemEditPartFactory;
import filesystem.diagram.part.FilesystemVisualIDRegistry;

/**
 * @generated
 */
public class FilesystemEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FilesystemEditPartProvider() {
		super(new FilesystemEditPartFactory(),
				FilesystemVisualIDRegistry.TYPED_INSTANCE,
				FilesystemEditPart.MODEL_ID);
	}

}
