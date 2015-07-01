package filesystem.diagram.part;

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
		paletteContainer.add(createFolderFolders3CreationTool());
		paletteContainer.add(createFolderFiles4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFile1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.File1CreationTool_title,
				Messages.File1CreationTool_desc,
				Collections.singletonList(FilesystemElementTypes.File_2002));
		entry.setId("createFile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.File_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolder2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Folder2CreationTool_title,
				Messages.Folder2CreationTool_desc,
				Collections.singletonList(FilesystemElementTypes.Folder_2001));
		entry.setId("createFolder2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.Folder_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolderFolders3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FolderFolders3CreationTool_title,
				Messages.FolderFolders3CreationTool_desc,
				Collections
						.singletonList(FilesystemElementTypes.FolderFolders_4002));
		entry.setId("createFolderFolders3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.FolderFolders_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolderFiles4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FolderFiles4CreationTool_title,
				Messages.FolderFiles4CreationTool_desc,
				Collections
						.singletonList(FilesystemElementTypes.FolderFiles_4001));
		entry.setId("createFolderFiles4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes
				.getImageDescriptor(FilesystemElementTypes.FolderFiles_4001));
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
