package fr.imie;

public class Livre {
	private String titre;
	private int isbn;

	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String nom) {
		this.titre = nom;
	}

	@Override
	public String toString() {
		// en dessous, ce qui est généré par l'override
		//return super.toString();
		return this.titre;
	}
	
	
}
