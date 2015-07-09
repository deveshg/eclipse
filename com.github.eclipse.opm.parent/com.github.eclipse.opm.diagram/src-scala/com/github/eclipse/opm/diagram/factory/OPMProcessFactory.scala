package com.github.eclipse.opm.diagram.factory

import com.github.eclipse.opm.model.OPMFactory
import com.github.eclipse.opm.model.OPMProcess
import org.eclipse.gef.requests.CreationFactory

class OPMProcessFactory extends CreationFactory {

  /**
   * @see CreationFactory#getNewObject()
   */
  override def getNewObject(): Object = OPMFactory.eINSTANCE.createOPMProcess();

  /**
   * @see CreationFactory#getObjectType()
   */
  override def getObjectType(): Object = classOf[OPMProcess]

}