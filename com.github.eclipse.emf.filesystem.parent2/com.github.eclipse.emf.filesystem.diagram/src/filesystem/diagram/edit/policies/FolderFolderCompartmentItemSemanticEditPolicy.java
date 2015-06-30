package filesystem.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import filesystem.diagram.edit.commands.File2CreateCommand;
import filesystem.diagram.edit.commands.Folder2CreateCommand;
import filesystem.diagram.providers.FilesystemElementTypes;

/**
 * @generated
 */
public class FolderFolderCompartmentItemSemanticEditPolicy extends
		FilesystemBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FolderFolderCompartmentItemSemanticEditPolicy() {
		super(FilesystemElementTypes.Folder_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FilesystemElementTypes.Folder_3001 == req.getElementType()) {
			return getGEFWrapper(new Folder2CreateCommand(req));
		}
		if (FilesystemElementTypes.File_3002 == req.getElementType()) {
			return getGEFWrapper(new File2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
