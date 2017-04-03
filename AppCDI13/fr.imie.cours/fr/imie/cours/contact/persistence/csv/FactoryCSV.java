package fr.imie.cours.contact.persistence.csv;

import fr.imie.cours.contact.model.Personne;
import fr.imie.cours.contact.model.Product;
import fr.imie.cours.contact.persistence.DAO;
import fr.imie.cours.contact.persistence.Factory;

public class FactoryCSV extends Factory {

	@Override
	public DAO<Personne> getPersonDAO() {
		return new PersonDaoCSV();
	}

	@Override
	public DAO<Product> getProductDAO() {
		return new ProductDAOCSV();
	}
	

}
