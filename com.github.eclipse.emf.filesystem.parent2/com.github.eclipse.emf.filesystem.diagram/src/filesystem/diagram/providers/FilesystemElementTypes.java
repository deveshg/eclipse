package filesystem.diagram.providers;

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

import filesystem.FilesystemPackage;
import filesystem.diagram.edit.parts.File2EditPart;
import filesystem.diagram.edit.parts.FileEditPart;
import filesystem.diagram.edit.parts.FilesystemEditPart;
import filesystem.diagram.edit.parts.Folder2EditPart;
import filesystem.diagram.edit.parts.FolderEditPart;
import filesystem.diagram.part.FilesystemDiagramEditorPlugin;

/**
 * @generated
 */
public class FilesystemElementTypes {

	/**
	 * @generated
	 */
	private FilesystemElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FilesystemDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Filesystem_1000 = getElementType("com.github.eclipse.emf.filesystem.diagram.Filesystem_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType File_2001 = getElementType("com.github.eclipse.emf.filesystem.diagram.File_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Folder_2002 = getElementType("com.github.eclipse.emf.filesystem.diagram.Folder_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Folder_3001 = getElementType("com.github.eclipse.emf.filesystem.diagram.Folder_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType File_3002 = getElementType("com.github.eclipse.emf.filesystem.diagram.File_3002"); //$NON-NLS-1$

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

			elements.put(Filesystem_1000,
					FilesystemPackage.eINSTANCE.getFilesystem());

			elements.put(File_2001, FilesystemPackage.eINSTANCE.getFile());

			elements.put(Folder_2002, FilesystemPackage.eINSTANCE.getFolder());

			elements.put(Folder_3001, FilesystemPackage.eINSTANCE.getFolder());

			elements.put(File_3002, FilesystemPackage.eINSTANCE.getFile());
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
			KNOWN_ELEMENT_TYPES.add(Filesystem_1000);
			KNOWN_ELEMENT_TYPES.add(File_2001);
			KNOWN_ELEMENT_TYPES.add(Folder_2002);
			KNOWN_ELEMENT_TYPES.add(Folder_3001);
			KNOWN_ELEMENT_TYPES.add(File_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FilesystemEditPart.VISUAL_ID:
			return Filesystem_1000;
		case FileEditPart.VISUAL_ID:
			return File_2001;
		case FolderEditPart.VISUAL_ID:
			return Folder_2002;
		case Folder2EditPart.VISUAL_ID:
			return Folder_3001;
		case File2EditPart.VISUAL_ID:
			return File_3002;
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
			return filesystem.diagram.providers.FilesystemElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return filesystem.diagram.providers.FilesystemElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return filesystem.diagram.providers.FilesystemElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
