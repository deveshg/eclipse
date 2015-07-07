package com.github.eclipse.gef.example.util

import org.eclipse.draw2d.geometry.Rectangle

import com.github.eclipse.gef.example.editor.model.Employe
import com.github.eclipse.gef.example.editor.model.Entreprise
import com.github.eclipse.gef.example.editor.model.Service

object EntrepriseData {

  def getFakeEnterprise(): Entreprise = {

    val psyEntreprise = new Entreprise()

    psyEntreprise.setName("Example Entreprise")
    psyEntreprise.setAddress("Moving Planet")
    psyEntreprise.setCapital(100000)

    psyEntreprise.addChild(getFakeService1)
    psyEntreprise.addChild(getFakeService2)

    return psyEntreprise
  }

  private def getFakeService2: Service = {
    val rhService = new Service()
    rhService.setName("Ressources Humaine")
    rhService.setEtage(1)
    rhService.setLayout(new Rectangle(220, 230, 250, 150))
    rhService.setColor(Service.getRandomColor)
    
    val employePaul = new Employe()
    employePaul.setName("Dupond")
    employePaul.setPrenom("Paul")
    employePaul.setLayout(new Rectangle(40, 70, 60, 40))
    rhService.addChild(employePaul)

    val employeEric = new Employe()
    employeEric.setName("Durand")
    employeEric.setPrenom("Eric")
    employeEric.setLayout(new Rectangle(170, 100, 60, 40))

    return rhService
  }

  private def getFakeService1(): Service = {
    val comptaService = new Service()
    comptaService.setName("Compta")
    comptaService.setEtage(2)
    comptaService.setLayout(new Rectangle(30, 50, 250, 150))
    comptaService.setColor(Service.getRandomColor)
    
    
    val employeCat = new Employe()
    employeCat.setName("Debroua")
    employeCat.setPrenom("Cat")
    employeCat.setLayout(new Rectangle(25, 40, 60, 40))
    comptaService.addChild(employeCat)

    val employeJyce = new Employe()
    employeJyce.setName("Psykokwak")
    employeJyce.setPrenom("Jyce")
    employeJyce.setLayout(new Rectangle(100, 60, 60, 40))
    comptaService.addChild(employeJyce)

    val employeEva = new Employe()
    employeEva.setName("Longoria")
    employeEva.setPrenom("Eva")
    employeEva.setLayout(new Rectangle(180, 90, 60, 40))
    comptaService.addChild(employeEva)

    return comptaService
  }

}