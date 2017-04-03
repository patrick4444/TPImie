package fr.imie.cours.heritage.single;

import javax.persistence.Entity;

@Entity
public class Stagiaire extends Personne {

	private String tuteur;
	public String getTuteur() {
		return tuteur;
	}
	public void setTuteur(String tuteur) {
		this.tuteur = tuteur;
	}
	
}