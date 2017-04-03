package fr.imie.cours.contact.persistence;

import fr.imie.cours.contact.model.Personne;
import fr.imie.cours.contact.model.Product;
import fr.imie.cours.contact.persistence.jdbc.FactoryJDBC;

public abstract class Factory {
	
	public static Factory getInstance() {
		return new FactoryJDBC();
	}
	
	public abstract DAO<Personne> getPersonDAO();
	
	public abstract DAO<Product> getProductDAO();

}
