/**
 * 
 */
package fr.imie.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.model.AdresseDTO;
import fr.imie.model.EtablissementDTO;

/**
 * @author imiedev
 *
 */
public class EtablissementDAO implements IEtablissementDAO{

	@Override
	public List<EtablissementDTO> listAllEtablissement() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<EtablissementDTO> etablissementDTOs = new ArrayList<>();
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fcpe", "postgres", "postgres");
			String selectAllEtablissementQuery = "Select id, nom, num_rue, nom_rue, code_postal, ville from etablissement";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectAllEtablissementQuery);
			while (resultSet.next()) {
				// System.out.println(resultSet.getString("nom"));

				AdresseDTO adresseDTO = new AdresseDTO().initDTO(resultSet.getInt("num_rue"),
						resultSet.getString("nom_rue"), resultSet.getString("code_postal"),
						resultSet.getString("ville"));
				EtablissementDTO etablissement = new EtablissementDTO().initDTO(resultSet.getString("nom"), adresseDTO);

				etablissementDTOs.add(etablissement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && !resultSet.isClosed()) {
					resultSet.close();
				}
				if (statement != null && !statement.isClosed()) {
					statement.close();
				}
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return etablissementDTOs;
	}
	
	

}
