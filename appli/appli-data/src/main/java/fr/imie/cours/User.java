package fr.imie.cours;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User  {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Integer getId() { return id;}
	public void setId(Integer id) {this.id = id; };
}
