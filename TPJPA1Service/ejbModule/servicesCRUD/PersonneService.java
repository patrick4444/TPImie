package servicesCRUD;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Personne;

/**
 * Session Bean implementation class PersonneService
 */
@Stateless
@LocalBean
public class PersonneService {

    @PersistenceContext
    EntityManager em;
	
	/**
     * Default constructor. 
     */
    public PersonneService() {
        
    }

    public List<Personne> findAll() {
    	@SuppressWarnings("unchecked")
    	List<Personne> retour = em.createNamedQuery("Personne.findAll").getResultList();
    	return retour;
    }
    
    public Personne findPersonneByName(String lastname) {
    	Personne retour = (Personne) em.createNamedQuery("Personne.findPersonneByName").setParameter("lastname", lastname).getSingleResult();  
    	return retour;
    }
    
    public void insertPersonne(String firstname, String lastname) {
    	Personne personne = new Personne();
    	personne.setFirstname(firstname);
    	personne.setLastname(lastname);
    	em.persist(personne);  
     }

    public void updatePersonne(Personne personne) {  
    	em.merge(personne);	
    }
    
    public void deletePersonne(Personne personne) {  
    	// 
    	//Personne pers = findPersonneById(personne.getId());
    	//em.remove(pers);
    	em.remove(em.getReference(Personne.class, personne.getId()));
    }
    
    public Personne findPersonneById(Integer id) {
    	Personne retour = (Personne) em.createNamedQuery("Personne.findPersonneById").setParameter("id", id).getSingleResult();  
    	return retour;
    }
    
}
