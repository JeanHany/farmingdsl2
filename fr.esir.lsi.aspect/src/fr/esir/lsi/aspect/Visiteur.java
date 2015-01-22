package fr.esir.lsi.aspect;

import java.util.ArrayList;
import java.util.HashMap;

import jdk.internal.util.xml.impl.Pair;

public class Visiteur {
	
	private double humain;
	private int tracteur;
	private int jour;
	private int mois;
	
	public Visiteur() {
		super();
		this.humain = 0;
		this.tracteur = 0;
	}

	public void setHm(ArrayList<String> hm) {
		this.hm = hm;
	}

	private ArrayList<String> hm = new ArrayList<String>();
	
	
	public ArrayList<String> getHm() {
		return hm;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public double getHumain() {
		return humain;
	}

	public void setHumain(double d) {
		this.humain = d;
	}

	public int getTracteur() {
		return tracteur;
	}

	public void setTracteur(int tracteur) {
		this.tracteur = tracteur;
	}
	
}
