package com.github.eclipse.opm.util

import com.github.eclipse.opm.model.OPMFactory
import com.github.eclipse.opm.model.OPMObjectProcessDiagram

class OPMModelUtils {

  val factory = OPMFactory.eINSTANCE

  def createModel(): OPMObjectProcessDiagram = {

    val opd = factory.createOPMObjectProcessDiagram();

    val object1 = factory.createOPMObject();
    object1.setName("O1");
    opd.getThings().add(object1);

    val object2 = factory.createOPMObject();
    object2.setName("O2");
    opd.getThings().add(object2);

    val process = factory.createOPMProcess();
    process.setName("P1");
    opd.getThings().add(process);

    val link = factory.createOPMLink();
    link.setSource(object1);
    link.setTarget(process);
    opd.getLinks().add(link);

    return opd;
  }
}

object OPMModelUtils {
  val eINSTANCE = new OPMModelUtils
}