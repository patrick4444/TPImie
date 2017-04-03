package fr.imie.exo2;

public class SMSServiceImpl implements EnvoiMessageService {

	@Override
	public void envoiMessage(String msg, String rec) {
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
		
	}

}
