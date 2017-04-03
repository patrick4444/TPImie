package fr.imie.exo2;

public class EmServiceImpl implements EnvoiMessageService {

	@Override
	public void envoiMessage(String msg, String rec) {
		System.out.println("Email sent to "+rec+ " with Message="+msg);
		
	}

}
