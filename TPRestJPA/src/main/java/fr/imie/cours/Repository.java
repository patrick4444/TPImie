package fr.imie.cours;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
 public class Repository {
 
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("TutoJPA");
  
	 
	private EntityManager getEntityManager() {
 		return factory.createEntityManager();
 	}
 
	public List<Person> findAll() {
		return getEntityManager().createQuery("from Person p").getResultList();
	}

	public Person findOne(Person data) {
		return findOne(data.getId());
	}
 
	public Person findOne(int id) {
 		return getEntityManager().find(Person.class, id);
 	}
 
	public void create(Person data) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(data);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
 	}
 

	public void update(Person data) {
		getEntityManager().persist(data);
 	}
 
		
	public void delete(Integer id) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		try {
			em.remove(em.getReference(Person.class, id));
			
		} catch (Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
 	}
 
 }