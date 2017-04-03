package fr.imie.cours.contact.persistence.jdbc;

import fr.imie.cours.contact.model.Personne;
import fr.imie.cours.contact.model.Product;
import fr.imie.cours.contact.persistence.DAO;
import fr.imie.cours.contact.persistence.Factory;

public class FactoryJDBC extends Factory {

	@Override
	public DAO<Personne> getPersonDAO() {
		return new PersonDaoJDBC();
	}

	@Override
	public DAO<Product> getProductDAO() {
		return new ProductDaoJDBC();
	}
	

}
