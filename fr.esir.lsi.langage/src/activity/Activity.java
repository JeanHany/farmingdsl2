/**
 */
package activity;

import exploitation.Atelier;
import fr.esir.lsi.aspect.Visiteur;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Activity#getPeriodicite <em>Periodicite</em>}</li>
 *   <li>{@link activity.Activity#getRes_alloc <em>Res alloc</em>}</li>
 *   <li>{@link activity.Activity#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.Activity#getFin <em>Fin</em>}</li>
 *   <li>{@link activity.Activity#getDebut <em>Debut</em>}</li>
 *   <li>{@link activity.Activity#getAtelier <em>Atelier</em>}</li>
 *   <li>{@link activity.Activity#getActivites <em>Activites</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Periodicite</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.Periodicite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicite</em>' attribute.
	 * @see activity.Periodicite
	 * @see #setPeriodicite(Periodicite)
	 * @see activity.ActivityPackage#getActivity_Periodicite()
	 * @model
	 * @generated
	 */
	Periodicite getPeriodicite();

	/**
	 * Sets the value of the '{@link activity.Activity#getPeriodicite <em>Periodicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicite</em>' attribute.
	 * @see activity.Periodicite
	 * @see #getPeriodicite()
	 * @generated
	 */
	void setPeriodicite(Periodicite value);

	/**
	 * Returns the value of the '<em><b>Res alloc</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Res_Alloc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res alloc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res alloc</em>' containment reference list.
	 * @see activity.ActivityPackage#getActivity_Res_alloc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Res_Alloc> getRes_alloc();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see activity.ActivityPackage#getActivity_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Date)
	 * @see activity.ActivityPackage#getActivity_Fin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getFin();

	/**
	 * Sets the value of the '{@link activity.Activity#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Date value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Date)
	 * @see activity.ActivityPackage#getActivity_Debut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link activity.Activity#getDebut <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' containment reference.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Atelier</b></em>' reference list.
	 * The list contents are of type {@link exploitation.Atelier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atelier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atelier</em>' reference list.
	 * @see activity.ActivityPackage#getActivity_Atelier()
	 * @model
	 * @generated
	 */
	EList<Atelier> getAtelier();

	/**
	 * Returns the value of the '<em><b>Activites</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.Activites}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activites</em>' attribute.
	 * @see activity.Activites
	 * @see #setActivites(Activites)
	 * @see activity.ActivityPackage#getActivity_Activites()
	 * @model
	 * @generated
	 */
	Activites getActivites();

	/**
	 * Sets the value of the '{@link activity.Activity#getActivites <em>Activites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activites</em>' attribute.
	 * @see activity.Activites
	 * @see #getActivites()
	 * @generated
	 */
	void setActivites(Activites value);
	
	default String parcours(){
		Visiteur visit = new Visiteur();
		EList<Atelier> atel = getAtelier();		
		Activites activities = getActivites();
		switch (activities) {
		case ALIMENTATION : testalimentation(visit);
		break;
		case SURVEILLANCEAGNELAGE : testSurv(visit);
		break;
		case SURVEILLANGEVELAGE : testSurv2(visit);
		break;
		case TRAITE : testTraite(visit);
		break;
		case IRRIGATGION : testirrigation(visit);
		break;
		case LABOUR : testLabour(visit);
		break;
		case SEMIS : testSemis(visit);
		break;
		case RECOLTE : testrecolte(visit);
		break;
		case FERTILISATION : testTraite(visit);
		break;
		default : testculture(visit);
		break;
		}
		System.out.println(visit.getHumain()+" "+visit.getTracteur());

		return visit.getHumain()+" "+visit.getTracteur();
	}

	default void testalimentation(Visiteur visit){
		if(visit.getMois() >= 3 && visit.getJour() >= 1 
				&& visit.getMois() <= 12 && visit.getJour() <= 30){
			visit.setHumain(visit.getHumain() + 1/2);
			visit.getHm().add("alimentation");
		}
		
	}

	//TODO test date
	default void testTraite(Visiteur visit){
		if(visit.getMois() >= 3 && visit.getJour() >= 1 
				&& visit.getMois() <= 12 && visit.getJour() <= 30){
			visit.setHumain(visit.getHumain() + 1/2);
		}
	}

	default void testSurv(Visiteur visit){
		if(visit.getMois() >= 5 && visit.getJour() >= 1
				&& visit.getMois() <= 5 && visit.getJour() <= 8){
			visit.setHumain(visit.getHumain() + 1);
		}
	}

	default void testSurv2(Visiteur visit){
		if(visit.getMois() >= 12 && visit.getJour() >= 1
				&& visit.getMois() <= 12 && visit.getJour() <= 8){
			visit.setHumain(visit.getHumain() + 1);
		}
	}

	//TODO todo
	default void testirrigation(Visiteur vist){
		
	}
	
	default void testLabour(Visiteur visit){
		if(visit.getMois() >= getDebut().getMonth().ordinal() && visit.getJour() >= getDebut().getDay() 
				&& visit.getMois() <= getFin().getMonth().ordinal() && visit.getJour() <= getFin().getDay()){
			visit.setHumain(visit.getHumain() + 1);
			visit.setTracteur(visit.getTracteur()+ 1);
			visit.getHm().add("labour");
		}
	}
		
		default void testSemis(Visiteur visit){
			if(visit.getMois() >= getDebut().getMonth().ordinal() && visit.getJour() >= getDebut().getDay() 
					&& visit.getMois() <= getFin().getMonth().ordinal() && visit.getJour() <= getFin().getDay()){
				visit.setHumain(visit.getHumain() + 1);
				visit.setTracteur(visit.getTracteur()+ 1);
				visit.getHm().add("semis");
			}
		}
			
			default void testrecolte(Visiteur visit){
				if(visit.getMois() >= getDebut().getMonth().ordinal() && visit.getJour() >= getDebut().getDay() 
						&& visit.getMois() <= getFin().getMonth().ordinal() && visit.getJour() <= getFin().getDay()){
					visit.setHumain(visit.getHumain() + 1);
					visit.setTracteur(visit.getTracteur()+ 1);
					visit.getHm().add("recolte");
				}
			}
//		int difjour = getFin().getDay() - getDebut().getDay();
//		int difmois =  getFin().getMonth().ordinal() - getDebut().getMonth().ordinal();
//		int result = difjour + difmois * 30	;
//		visit.setHumain(visit.getHumain() + result);
		
	
	default void testculture(Visiteur visit){
		int difjour = getFin().getDay() - getDebut().getDay();
		int difmois =  getFin().getMonth().ordinal() - getDebut().getMonth().ordinal();
		int result = difjour + difmois * 30	;
		visit.setHumain(visit.getHumain() + result);
		visit.setTracteur(visit.getTracteur()+result);
	}
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
	//	
	//	
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

} // Activity
