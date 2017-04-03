package fr.imie;
/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author imiedev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello");
		Livre livre = new Livre();
		System.out.println(livre);
		livre.setNom("Gang of for");
		System.out.println(livre); */
		
		// --- LIVRE ---- //
		// liste
		List<Livre> listLivres = new ArrayList<>();
		
		Livre livre1 = new Livre();
		livre1.setTitre("Design Pattern - La tête la première");
		livre1.setIsbn(1551235454);
		listLivres.add(livre1);
		
		Livre livre2 = new Livre();
		livre2.setTitre("Elements of Reusable Objetct-Oriented Software");
		livre2.setIsbn(1551235466);
		listLivres.add(livre2);
		
		for (Livre livreRecord : listLivres) {
			System.out.println(livreRecord);
			// ou
			//System.out.println(livreRecord).toString();
			System.out.println(livreRecord.getIsbn());
		}
		
		// --- BIBLIOTHEQUE ---- //
		Bibliotheque bibliotheque = new Bibliotheque();
		bibliotheque.setNom("Victor HUGO");
		System.out.println(bibliotheque); 
		
		// --- EMPRUNT ---- //
		Emprunt emprunt = new Emprunt();
		emprunt.setDate("12/01/2017");
		System.out.println(emprunt); 
		
		// --- Adherent ---- //
		Adherent adherent = new Adherent();
		adherent.setNom("DROUIN");
		System.out.println(adherent); 
		
		
		
		
	}
	
		
		
		
	
		
	}


