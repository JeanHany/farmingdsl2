package fr.esir.lsi.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activity.Activity
import exploitation.Culture
import exploitation.Elevage


@Aspect (className = Activity)
class ActivityAspect {
	
	def CharSequence simulate(){ 
		val atelier = _self.atelier
		 switch atelier {
		 	Culture : "c"
		 	Elevage : "b"
		 	default : "a"
		 }
	}
// 
//	def test_culture(Culture culture, Visiteur vist){
//		val cereal = culture.cereals
//		vist.setHumain(vist.getHumain + 1)
//		vist.setTracteur(vist.getTracteur + 1)
//		switch (cereal) {
//			case CORN : test_mais(_self)
//			case WHEAT: test_wheat(_self)
//			case SORGHUM : test_sorghum(_self)
//			default : true
//		}
//	}
//	
//	def test_elevage(Visiteur vist){
//		val name = _self.activites
//		switch (name) {
//			case ALIMENTATION : test_alimentation(_self, vist)
//			case TRAITE : test_traite(_self, vist)
//			case SURVEILLANCEAGNELAGE : test_surveillance_a(_self, vist)
//			case SURVEILLANGEVELAGE : test_surveillance_v(_self, vist)
//			default : true
//		}
//	}
//	
//	
//		
//	def test_wheat() {
//		val name = _self.activites
//		switch (name) {
//			case LABOUR : test_labour(_self)
//			case SEMIS : test_semis(_self)
//			case IRRIGATGION : test_irrigation(_self)
//			case RECOLTE : test_recolte(_self)
//			case FERTILISATION : test_fertilisation(_self)
//			default : true
//		}
//	}
//	
//	
//	def test_alimentation(Visiteur vist){
//		val fin = _self.debut
//		val debut = _self.fin
//		val difjour = fin.day - debut.day
//		val difmois = fin.month.ordinal - debut.month.ordinal
//		val result = difjour + difmois * 30	
//		vist.setHumain(vist.getHumain + result/2)	
//	}
//	
//	def test_traite(Visiteur vist){
//		vist.setHumain(vist.getHumain + 10*30/2)	
//	}
//	
//	def test_surveillance_a(Visiteur vist){
//		vist.setHumain(vist.getHumain + 7)
//	}
//	
//	def test_surveillance_v(Visiteur vist){
//		vist.setHumain(vist.getHumain + 7)
//	}
//	def test_culture(Culture culture, Visiteur vist){
//		val cereal = culture.cereals
//		vist.setHumain(vist.getHumain + 1)
//		vist.setTracteur(vist.getTracteur + 1)
//		switch (cereal) {
//			case CORN : test_mais(_self)
//			case WHEAT: test_wheat(_self)
//			case SORGHUM : test_sorghum(_self)
//			default : true
//		}
//	}
//	
//	def test_elevage(Visiteur vist){
//		val name = _self.activites
//		switch (name) {
//			case ALIMENTATION : test_alimentation(_self, vist)
//			case TRAITE : test_traite(_self, vist)
//			case SURVEILLANCEAGNELAGE : test_surveillance_a(_self, vist)
//			case SURVEILLANGEVELAGE : test_surveillance_v(_self, vist)
//			default : true
//		}
//	}
//	
//	
//		
//	def test_wheat() {
//		val name = _self.activites
//		switch (name) {
//			case LABOUR : test_labour(_self)
//			case SEMIS : test_semis(_self)
//			case IRRIGATGION : test_irrigation(_self)
//			case RECOLTE : test_recolte(_self)
//			case FERTILISATION : test_fertilisation(_self)
//			default : true
//		}
//	}
//	
//	
//	def test_alimentation(Visiteur vist){
//		val fin = _self.debut
//		val debut = _self.fin
//		val difjour = fin.day - debut.day
//		val difmois = fin.month.ordinal - debut.month.ordinal
//		val result = difjour + difmois * 30	
//		vist.setHumain(vist.getHumain + result/2)	
//	}
//	
//	def test_traite(Visiteur vist){
//		vist.setHumain(vist.getHumain + 10*30/2)	
//	}
//	
//	def test_surveillance_a(Visiteur vist){
//		vist.setHumain(vist.getHumain + 7)
//	}
//	
//	def test_surveillance_v(Visiteur vist){
//		vist.setHumain(vist.getHumain + 7)
//	}
//	
//	def test_sorghum() {
//		
//	}
//	
//	def test_mais(){
//		
//	}
//	
//	def test_labour(){	
//	}
//	
//	def test_semis(){
//		
//	}
//	
//	def test_irrigation(){
//		
//	}
//	
//	def test_recolte(){
//		
//	}
//	
//	def test_fertilisation(){
//		
//	}
}