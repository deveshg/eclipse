package com.github.eclipse.gef.example.editor.requests

import org.eclipse.gef.requests.CreationFactory

import com.github.eclipse.gef.example.editor.model.Employe
import com.github.eclipse.gef.example.editor.model.Service

class NodeCreationFactory(template: Class[_]) extends CreationFactory {

  def getNewObject(): AnyRef = {

    var ref: AnyRef = null

    if (template == classOf[Service]) {
      ref = new Service
    }
    else if (template == classOf[Employe])
      ref = new Employe

    return ref

  }

  def getObjectType(): AnyRef = template

}