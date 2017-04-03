package servicesCRUD;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Livre;

/**
 * Session Bean implementation class LivreService
 */
@Stateless
@LocalBean
public class LivreService {

	
	@PersistenceContext
    EntityManager em;
    /**
     * Default constructor. 
     */
    public LivreService() {
        // TODO Auto-generated constructor stub
    }

    public List<Livre> findAll() {
    	@SuppressWarnings("unchecked")
    	List<Livre> retour = em.createNamedQuery("Livre.findAll").getResultList();
    	return retour;
    }
}
