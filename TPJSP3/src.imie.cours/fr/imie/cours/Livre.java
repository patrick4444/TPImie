package fr.imie.cours;

public class Livre {

	private Integer id_livre;
	public Integer getId_livre() { return id_livre; }
	public void setId(Integer id_livre) { this.id_livre = id_livre; }

	private String nom_livre;
	public String getNom_livre() { return nom_livre; }
	public void setNom_livre(String nom_livre) { this.nom_livre = nom_livre; }

	private String auteur;
	public String getAuteur() { return auteur; }
	public void setAuteur(String auteur) { this.auteur = auteur; }

}