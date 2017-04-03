package fr.imie.exo2;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		
		return new MonApplicationService(new EmServiceImpl());
	}

}
