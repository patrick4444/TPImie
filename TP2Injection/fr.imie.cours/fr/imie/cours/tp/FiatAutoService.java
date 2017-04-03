package fr.imie.cours.tp;

import javax.inject.Named;

@Named("fiatAutoService")
public class FiatAutoService implements AutoService{

	@Override
	public void getService(){
		System.out.println("C'est une Fiat !!!!");
	}
}
