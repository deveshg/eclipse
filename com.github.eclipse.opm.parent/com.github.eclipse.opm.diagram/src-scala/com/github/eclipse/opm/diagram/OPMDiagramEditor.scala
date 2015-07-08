package com.github.eclipse.opm.diagram

import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette
import org.eclipse.ui.IPropertyListener
import org.eclipse.swt.graphics.Image
import org.eclipse.gef.palette.PaletteRoot
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.gef.DefaultEditDomain
import com.github.eclipse.opm.util.OPMModelUtils
import com.github.eclipse.opm.diagram.parts.OPMEditPartFactory
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorSite
import org.eclipse.ui.PartInitException
import com.github.eclipse.opm.model.OPMPackage
import org.eclipse.ui.IFileEditorInput
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.core.resources.IResource
import org.eclipse.emf.ecore.resource.Resource
import com.github.eclipse.opm.model.OPMObjectProcessDiagram

class OPMDiagramEditor extends GraphicalEditorWithFlyoutPalette {

  var opd : OPMObjectProcessDiagram = _
  var opdResource : Resource = _
  {
    setEditDomain(new DefaultEditDomain(this));
  }

  override def doSave(pm: IProgressMonitor): Unit = {}

  def getPaletteRoot(): PaletteRoot = null

  protected override def initializeGraphicalViewer(): Unit = {
    super.initializeGraphicalViewer();
    getGraphicalViewer().setContents(opd);
  }

  protected override def configureGraphicalViewer(): Unit = {
    super.configureGraphicalViewer();
    getGraphicalViewer().setEditPartFactory(new OPMEditPartFactory());
  }

  @throws[PartInitException]
  override def init(site :IEditorSite ,  input :IEditorInput)  {
  super.init(site, input);
   
  OPMPackage.eINSTANCE.eClass(); // This initializes the OPMPackage singleton implementation.
  val resourceSet = new ResourceSetImpl();
  if(input.isInstanceOf[IFileEditorInput]) {
    val fileInput =  input.asInstanceOf[IFileEditorInput];
    val file = fileInput.getFile();
    opdResource = resourceSet.createResource(URI.createURI(file.getLocationURI().toString()));
    try {
      opdResource.load(null);
      opd =  opdResource.getContents().get(0).asInstanceOf[OPMObjectProcessDiagram];
    } catch {
      case e: IOException =>
      e.printStackTrace();
      opdResource = null;
    }
  }
}
  
}