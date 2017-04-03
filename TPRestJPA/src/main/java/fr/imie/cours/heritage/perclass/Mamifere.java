package fr.imie.cours.heritage.perclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Mamifere {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	private String name;
	
}