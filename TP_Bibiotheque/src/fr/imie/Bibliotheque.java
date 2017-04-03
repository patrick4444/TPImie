package fr.imie;

public class Bibliotheque {
	private String nomBibliotheque;

	public String getNom() {
		return nomBibliotheque;
	}

	public void setNom(String nomBibliotheque) {
		this.nomBibliotheque = nomBibliotheque;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return this.nomBibliotheque;
	}
	
	
	

}
