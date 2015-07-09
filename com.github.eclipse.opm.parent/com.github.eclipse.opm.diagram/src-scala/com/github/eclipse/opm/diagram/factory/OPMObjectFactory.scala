package com.github.eclipse.opm.diagram.factory

import org.eclipse.gef.requests.CreationFactory
import com.github.eclipse.opm.model.OPMObject
import com.github.eclipse.opm.model.OPMFactory

class OPMObjectFactory extends CreationFactory {

  /**
   * @see CreationFactory#getNewObject()
   * */
  def getNewObject(): Object = OPMFactory.eINSTANCE.createOPMObject();
  
  /**
   * @see CreationFactory#getObjectType()
   * */
  def getObjectType(): Object = classOf[OPMObject]

}