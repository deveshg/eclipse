package filesystem.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import filesystem.File;
import filesystem.Filesystem;
import filesystem.Folder;
import filesystem.diagram.edit.parts.File2EditPart;
import filesystem.diagram.edit.parts.FileEditPart;
import filesystem.diagram.edit.parts.FilesystemEditPart;
import filesystem.diagram.edit.parts.Folder2EditPart;
import filesystem.diagram.edit.parts.FolderEditPart;
import filesystem.diagram.edit.parts.FolderFolderCompartment2EditPart;
import filesystem.diagram.edit.parts.FolderFolderCompartmentEditPart;

/**
 * @generated
 */
public class FilesystemDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FilesystemNodeDescriptor> getSemanticChildren(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000SemanticChildren(view);
		case FolderFolderCompartmentEditPart.VISUAL_ID:
			return getFolderFolderCompartment_7001SemanticChildren(view);
		case FolderFolderCompartment2EditPart.VISUAL_ID:
			return getFolderFolderCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemNodeDescriptor> getFilesystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Filesystem modelElement = (Filesystem) view.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFolders().iterator(); it
				.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FolderEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FilesystemNodeDescriptor> getFolderFolderCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Folder modelElement = (Folder) containerView.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFolders().iterator(); it
				.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Folder2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == File2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FilesystemNodeDescriptor> getFolderFolderCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Folder modelElement = (Folder) containerView.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFolders().iterator(); it
				.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Folder2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == File2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getContainedLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2001ContainedLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002ContainedLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001ContainedLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getIncomingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FileEditPart.VISUAL_ID:
			return getFile_2001IncomingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002IncomingLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001IncomingLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getOutgoingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FileEditPart.VISUAL_ID:
			return getFile_2001OutgoingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002OutgoingLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001OutgoingLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFilesystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFolder_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getFile_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FilesystemNodeDescriptor> getSemanticChildren(View view) {
			return FilesystemDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FilesystemLinkDescriptor> getContainedLinks(View view) {
			return FilesystemDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FilesystemLinkDescriptor> getIncomingLinks(View view) {
			return FilesystemDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FilesystemLinkDescriptor> getOutgoingLinks(View view) {
			return FilesystemDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
