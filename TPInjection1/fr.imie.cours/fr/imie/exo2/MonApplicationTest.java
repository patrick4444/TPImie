package fr.imie.exo2;

public class MonApplicationTest {

	public static void main(String[] args) {
		String msg = "Bonjour Toto";

		String email = "toto@imie.com";

		String phone = "0606060606";

		MessageServiceInjector injector = null;

		Consumer app = null;

		//Send email

		injector = new EmailServiceInjector();

		app = injector.getConsumer();

		app.processMessages(msg, email);

		//Send SMS

		injector = new SMSServiceInjector();

		app = injector.getConsumer();

		app.processMessages(msg, phone);

	}

}
