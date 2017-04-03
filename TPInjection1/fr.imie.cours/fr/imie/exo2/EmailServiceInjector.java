package fr.imie.exo2;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// retourner une nouvelle instance de la classe MonApplicationService 
		// avec pour paramètre une nouvelle instance d’une classe de service.
		return new MonApplicationService(new EmServiceImpl());
		
	}

}
