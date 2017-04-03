package fr.imie.cours;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

}