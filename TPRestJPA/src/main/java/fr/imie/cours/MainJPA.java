package fr.imie.cours;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.imie.cours.heritage.join.CD;
import fr.imie.cours.heritage.join.Livre;
import fr.imie.cours.heritage.perclass.Baleine;
import fr.imie.cours.heritage.perclass.Humain;
import fr.imie.cours.heritage.single.Salarie;
import fr.imie.cours.heritage.single.Stagiaire;

public class MainJPA {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TutoJPA");
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin();

			// single => 1 table
			
			em.persist(new Salarie());
			em.persist(new Stagiaire());

			// per class => 2 tables
			
			em.persist(new Humain());
			em.persist(new Baleine());
			
			// join => 3 tables
			
			CD cd = new CD();
			cd.setName("nevermind");
			cd.setGenre("metal");
			em.persist(cd);

			Livre livre = new Livre();
			livre.setName("harry potter");
			livre.setIsbn("123456789");
			em.persist(livre);

			//
//			// TOUR OPERATOR
//
//			Airport2 airport = new Airport2();
//			Flight2 flight = new Flight2();
//
//			airport.getListFlights().add(flight);
//			
//			em.persist(airport);
//			em.persist(flight);
//			
//			// AMAZON
//
//			Product product = new Product();
//			Cart cart = new Cart();
//
//			cart.addProduct(product);
//			
//			em.persist(product);
//			em.persist(cart);
//
			em.getTransaction().commit();
		} finally {
			em.close();
			factory.close();
		}

		
//		Repository repo = new Repository();
//
//		{
//			Person person;
//
//			person = new Person();
//			person.setId(2);
//			person.setFirstName("angelina");
//			person.setLastName("joli");
//			repo.update(person);
//
//			person = repo.findOne(2);
//			System.out.println(person.getFirstName());
//			System.out.println(person.getLastName());
//		}
//
//		for (Person person : repo.findAll()) {
//			System.out.println(person.getFirstName());
//			System.out.println(person.getLastName());
//		}

	}

}