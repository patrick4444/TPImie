package fr.imie.exo1;

import fr.imie.exo2.MonApplicationService;

public class TestApplicationTest {

	public static void main(String[] args) {
		MonApplicationService application = new MonApplicationService(); 
        application.processMessages("Hello", "test@imie.com");

	}

}
