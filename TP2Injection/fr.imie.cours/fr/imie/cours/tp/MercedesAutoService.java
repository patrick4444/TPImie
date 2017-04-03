package fr.imie.cours.tp;

import javax.inject.Named;

@Named("mercedesAutoService")
public class MercedesAutoService implements AutoService{

	@Override
	public void getService(){
		System.out.println("C'est une Mercedes !!!!");
	}
}
