package fr.imie.exo2;

public class MonApplicationService implements Consumer {

//	Cette classe aura pour attribut EnvoiMessageService.  
//	Son constructeur aura comme paramètre un élément de type EnvoiMessageService 
//	Dans la méthode processMessages() de notre classe MonApplicationService appeler 
//	l’attribut de la classe MonApplicationService et appeler la méthode envoiMessage()
//	I b = new B();
//
//	b.doSomething();
	
	
	private EnvoiMessageService msg;
	
	
	public MonApplicationService(EnvoiMessageService msg) {
		super();
		this.msg = msg;
	}

    public void processMessages(String msg, String rec){ 
       this.msg.envoiMessage(msg, rec);
    } 

}
