package filesystem.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import filesystem.diagram.part.FilesystemVisualIDRegistry;

/**
 * @generated
 */
public class FilesystemEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FilesystemVisualIDRegistry.getVisualID(view)) {

			case FilesystemEditPart.VISUAL_ID:
				return new FilesystemEditPart(view);

			case FileEditPart.VISUAL_ID:
				return new FileEditPart(view);

			case FileNameEditPart.VISUAL_ID:
				return new FileNameEditPart(view);

			case FolderEditPart.VISUAL_ID:
				return new FolderEditPart(view);

			case FolderNameEditPart.VISUAL_ID:
				return new FolderNameEditPart(view);

			case Folder2EditPart.VISUAL_ID:
				return new Folder2EditPart(view);

			case FolderName2EditPart.VISUAL_ID:
				return new FolderName2EditPart(view);

			case File2EditPart.VISUAL_ID:
				return new File2EditPart(view);

			case FileName2EditPart.VISUAL_ID:
				return new FileName2EditPart(view);

			case FolderFolderCompartmentEditPart.VISUAL_ID:
				return new FolderFolderCompartmentEditPart(view);

			case FolderFolderCompartment2EditPart.VISUAL_ID:
				return new FolderFolderCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
