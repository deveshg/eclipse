package filesystem.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import filesystem.diagram.providers.FilesystemElementTypes;

/**
 * @generated
 */
public class FilesystemPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFilesystem1Group());
	}

	/**
	 * Creates "filesystem" palette tool group
	 * @generated
	 */
	private PaletteContainer createFilesystem1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Filesystem1Group_title);
		paletteContainer.setId("createFilesystem1Group"); //$NON-NLS-1$
		paletteContainer.add(createFile1CreationTool());
		paletteContainer.add(createFolder2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFile1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FilesystemElementTypes.File_2001);
		types.add(FilesystemElementTypes.File_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.File1CreationTool_title,
				Messages.File1CreationTool_desc, types);
		entry.setId("createFile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.File_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolder2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FilesystemElementTypes.Folder_2002);
		types.add(FilesystemElementTypes.Folder_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Folder2CreationTool_title,
				Messages.Folder2CreationTool_desc, types);
		entry.setId("createFolder2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.Folder_2002));
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
}
