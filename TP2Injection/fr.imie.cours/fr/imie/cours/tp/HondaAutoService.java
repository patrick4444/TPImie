package fr.imie.cours.tp;

import javax.inject.Named;

@Named("hondaAutoService")
public class HondaAutoService implements AutoService{

	@Override
	public void getService(){
		System.out.println("C'est une Honda !!!!");
	}
}
