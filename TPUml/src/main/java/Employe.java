import java.util.HashSet;


/**
 * Description of Employe.
 * 
 * @author imiedev
 */
public class Employe {
	
	public HashSet<Formation> formations = new HashSet<Formation>();
	private String telephone;
	private float salaire;
	public HashSet<Mission> missions = new HashSet<Mission>();
	private String nom;
	private String prenom;
	private String adresse;
	
	
	
	public void inscrire (Formation f){
		this.formations.add(f);
		//f.s employes.add;
	};
	
	public void effectuer (Mission m) {
		this.missions.add(m);
	};
	
	/**
	 * The constructor.
	 */
	public Employe() {
		super();
	}


	public HashSet<Formation> getFormations() {
		return this.formations;
	}
	
	public HashSet<Mission> getMissions() {
		return this.missions;
	}


	public Object getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Object newTelephone) {
		this.telephone = telephone;
	}

	public Object getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Object newSalaire) {
		this.salaire = salaire;
	}

	public Object getNom() {
		return this.nom;
	}

	public void setNom(Object newNom) {
		this.nom = nom;
	}

	public Object getPrenom() {
		return this.prenom;
	}

	public void setPrenom(Object newPrenom) {
		this.prenom = prenom;
	}

	public Object getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Object newAdresse) {
		this.adresse = adresse;
	}

}
