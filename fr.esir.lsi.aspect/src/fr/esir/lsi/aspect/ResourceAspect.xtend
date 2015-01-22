package fr.esir.lsi.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import exploitation.Ressource

@Aspect (className = Ressource)
class ResourceAspect {
	
	def simulate(Visiteur vist){
		val type = _self.resourceType.name
		switch (type) {
			case "tracteur" : vist.setTracteur(vist.getTracteur+1)
			case "humain" : vist.setHumain(vist.getHumain+1)
			default : new Visiteur
		}
		vist
	}
	
}