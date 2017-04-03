package fr.imie.cours.heritage.single;

import javax.persistence.Entity;

@Entity
public class Salarie extends Personne {

	private Integer salaire;
	public Integer getSalaire() {
		return salaire;
	}
	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}
	
}