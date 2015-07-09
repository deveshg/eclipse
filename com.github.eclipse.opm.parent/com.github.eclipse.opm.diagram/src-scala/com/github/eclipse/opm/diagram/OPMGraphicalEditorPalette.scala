package com.github.eclipse.opm.diagram

import org.eclipse.gef.palette.CreationToolEntry
import org.eclipse.gef.palette.PaletteGroup
import org.eclipse.gef.palette.PaletteRoot
import org.eclipse.gef.palette.SelectionToolEntry
import com.github.eclipse.opm.diagram.factory.OPMObjectFactory
import com.github.eclipse.opm.diagram.factory.OPMProcessFactory
import com.github.eclipse.opm.diagram.tool.CreationAndDirectEditTool

class OPMGraphicalEditorPalette extends PaletteRoot {

  val group = new PaletteGroup("OPM Controls")

  {
    addSelectionTool()
    addOPMObjectTool()
    addOPMProcessTool()
    add(group)
  }

  def addSelectionTool(): Unit = {
    val entry = new SelectionToolEntry
    group.add(entry)
    setDefaultEntry(entry)
  }

  def addOPMObjectTool(): Unit = {
    val entry = new CreationToolEntry("OPM Object", "Create a new OPM Object", new OPMObjectFactory(), null, null)
    entry.setToolClass(classOf[CreationAndDirectEditTool])
    group.add(entry)

  }
  def addOPMProcessTool(): Unit = {
    val entry = new CreationToolEntry("OPM Process", "Create a new OPM Process", new OPMProcessFactory(), null, null)
    entry.setToolClass(classOf[CreationAndDirectEditTool])
    group.add(entry)
  }
}