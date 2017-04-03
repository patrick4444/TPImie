package fr.imie;

public class Adherent {
	private String nom;
	private String adherent;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return this.nom;
	}

	public String getAdherent() {
		return adherent;
	}

	public void setAdherent(String adherent) {
		this.adherent = adherent;
	}
	
	
	
	
	
}
