package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@NamedQuery(name="Personne.findAll", query="SELECT p FROM Personne p")
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String firstname;

	private String lastname;

	//uni-directional one-to-one association to Livre
	@OneToOne
	@JoinColumn(name="id_livre")
	private Livre livre1;

	//uni-directional many-to-one association to Livre
	@ManyToOne
	@JoinColumn(name="id_livre")
	private Livre livre2;

	public Personne() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Livre getLivre1() {
		return this.livre1;
	}

	public void setLivre1(Livre livre1) {
		this.livre1 = livre1;
	}

	public Livre getLivre2() {
		return this.livre2;
	}

	public void setLivre2(Livre livre2) {
		this.livre2 = livre2;
	}

}