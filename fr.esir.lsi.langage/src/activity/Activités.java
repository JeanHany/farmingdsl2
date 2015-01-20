/**
 */
package activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activités</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage#getActivités()
 * @model
 * @generated
 */
public enum Activités implements Enumerator {
	/**
	 * The '<em><b>Labour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABOUR_VALUE
	 * @generated
	 * @ordered
	 */
	LABOUR(0, "labour", "Labour"),

	/**
	 * The '<em><b>Semis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMIS_VALUE
	 * @generated
	 * @ordered
	 */
	SEMIS(1, "semis", "semis"),

	/**
	 * The '<em><b>Irrigatgion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRRIGATGION_VALUE
	 * @generated
	 * @ordered
	 */
	IRRIGATGION(2, "irrigatgion", "irrigatgion"),

	/**
	 * The '<em><b>Fertilisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERTILISATION_VALUE
	 * @generated
	 * @ordered
	 */
	FERTILISATION(3, "fertilisation", "fertilisation"),

	/**
	 * The '<em><b>Recolte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOLTE_VALUE
	 * @generated
	 * @ordered
	 */
	RECOLTE(4, "recolte", "recolte"), /**
	 * The '<em><b>ALIMENTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ALIMENTATION(5, "ALIMENTATION", "ALIMENTATION"), /**
	 * The '<em><b>Traite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAITE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAITE(6, "traite", "traite"), /**
	 * The '<em><b>Surveillance agnelage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_AGNELAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEILLANCE_AGNELAGE(0, "surveillance_agnelage", "surveillance_agnelage"), /**
	 * The '<em><b>Surveillange velage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANGE_VELAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEILLANGE_VELAGE(0, "surveillange_velage", "surveillange_velage");

	/**
	 * The '<em><b>Labour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Labour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABOUR
	 * @model name="labour" literal="Labour"
	 * @generated
	 * @ordered
	 */
	public static final int LABOUR_VALUE = 0;

	/**
	 * The '<em><b>Semis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMIS
	 * @model name="semis"
	 * @generated
	 * @ordered
	 */
	public static final int SEMIS_VALUE = 1;

	/**
	 * The '<em><b>Irrigatgion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Irrigatgion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRRIGATGION
	 * @model name="irrigatgion"
	 * @generated
	 * @ordered
	 */
	public static final int IRRIGATGION_VALUE = 2;

	/**
	 * The '<em><b>Fertilisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fertilisation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FERTILISATION
	 * @model name="fertilisation"
	 * @generated
	 * @ordered
	 */
	public static final int FERTILISATION_VALUE = 3;

	/**
	 * The '<em><b>Recolte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recolte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOLTE
	 * @model name="recolte"
	 * @generated
	 * @ordered
	 */
	public static final int RECOLTE_VALUE = 4;

	/**
	 * The '<em><b>ALIMENTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALIMENTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIMENTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALIMENTATION_VALUE = 5;

	/**
	 * The '<em><b>Traite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Traite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAITE
	 * @model name="traite"
	 * @generated
	 * @ordered
	 */
	public static final int TRAITE_VALUE = 6;

	/**
	 * The '<em><b>Surveillance agnelage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surveillance agnelage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_AGNELAGE
	 * @model name="surveillance_agnelage"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEILLANCE_AGNELAGE_VALUE = 0;

	/**
	 * The '<em><b>Surveillange velage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surveillange velage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANGE_VELAGE
	 * @model name="surveillange_velage"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEILLANGE_VELAGE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Activités</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Activités[] VALUES_ARRAY =
		new Activités[] {
			LABOUR,
			SEMIS,
			IRRIGATGION,
			FERTILISATION,
			RECOLTE,
			ALIMENTATION,
			TRAITE,
			SURVEILLANCE_AGNELAGE,
			SURVEILLANGE_VELAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Activités</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Activités> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activités</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activités get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activités result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activités</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activités getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activités result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activités</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activités get(int value) {
		switch (value) {
			case LABOUR_VALUE: return LABOUR;
			case SEMIS_VALUE: return SEMIS;
			case IRRIGATGION_VALUE: return IRRIGATGION;
			case FERTILISATION_VALUE: return FERTILISATION;
			case RECOLTE_VALUE: return RECOLTE;
			case ALIMENTATION_VALUE: return ALIMENTATION;
			case TRAITE_VALUE: return TRAITE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Activités(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Activités
