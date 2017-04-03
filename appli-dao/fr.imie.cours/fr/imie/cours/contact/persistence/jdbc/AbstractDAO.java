package fr.imie.cours.contact.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.imie.cours.contact.persistence.DAO;

public abstract class AbstractDAO<T> implements DAO<T> {

	protected Connection getConnection() throws SQLException {
//		try {

			// lecture du fichier jdbc.properties
//			Properties p = new Properties();
//			p.load(getClass().getResourceAsStream("/jdbc.properties"));
//			String driver = p.getProperty("driver");
//			String url = p.getProperty("url");
//			String user = p.getProperty("user");
//			String password = p.getProperty("password");

			// connexion à la bdd
			//DriverManager.registerDriver((Driver) Class.forName(driver).newInstance());
			
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/APPCDI13","postgres","postgres");
			
//		} catch (IOException | ReflectiveOperationException ex) {
//			throw new SQLException(ex);
//		}
	}

}