package fr.esir.lsi.aspect;

public class Visiteur {
	
	private int humain;
	private int tracteur;
	
	public Visiteur() {
		super();
		this.humain = 0;
		this.tracteur = 0;
	}

	public int getHumain() {
		return humain;
	}

	public void setHumain(int humain) {
		this.humain = humain;
	}

	public int getTracteur() {
		return tracteur;
	}

	public void setTracteur(int tracteur) {
		this.tracteur = tracteur;
	}
	
}
