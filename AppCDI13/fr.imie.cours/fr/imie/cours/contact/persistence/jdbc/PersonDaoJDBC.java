package fr.imie.cours.contact.persistence.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.imie.cours.contact.model.Personne;
import fr.imie.cours.contact.persistence.DAO;

public class PersonDaoJDBC extends AbstractDAO<Personne> implements DAO<Personne> {

	@Override
	public List<Personne> findAll() {
		String sql = " SELECT id , firstname , lastname FROM Personne";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet result = statement.executeQuery()) {
			    List<Personne> list = new ArrayList<>();
			while (result.next()) {
				Personne Personne= mapResultToDTO(result);
				Personne.setId(result.getInt("id"));
				list.add(Personne);
			}
			return list;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Personne findOne(Personne data) {
		return findOne(data.getId());
	}

	@Override
	public Personne findOne(Integer id) {
		String sql = " SELECT firstname , lastname FROM Personne WHERE id = ? ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setInt(1, id);
			try (ResultSet result = statement.executeQuery();) {
				result.next();
				Personne personne= mapResultToDTO(result);
				personne.setId(id);
				return personne;
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	private Personne mapResultToDTO(ResultSet result) throws SQLException {
		Personne personne= new Personne();
		personne.setFirstName(result.getString("firstname"));
		personne.setLastName(result.getString("lastname"));
		return personne;
	}

	@Override
	public Personne insert(Personne data) {
		String sql = " INSERT INTO Personne( firstname , lastname ) VALUES ( ? , ? ) ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			fillStatement(data, statement, false);
			statement.executeUpdate();
			// récupère l'id après insertion
			ResultSet keys = statement.getGeneratedKeys();
			keys.next();
			// alimente le dto avec l'id trouvé
			data.setId(keys.getInt(1));
			return data;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void update(Personne data) {
		String sql = " UPDATE Personne SET firstname = ? , lastname = ? WHERE id = ? ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			fillStatement(data, statement, true);
			statement.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	private void fillStatement(Personne data, PreparedStatement statement, boolean isUpdate) throws SQLException {
		int index = 1;
		statement.setString(index++, data.getFirstName());
		statement.setString(index++, data.getLastName());
		if (isUpdate) {
			statement.setInt(index++, data.getId());
		}
	}

	@Override
	public void delete(Personne data) {
		delete(data.getId());
	}

	@Override
	public void delete(Integer id) {
		String sql = " DELETE FROM Personne WHERE id = ? ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void delete(List<Personne> data) {
		for (Personne personne: data) {
			delete(personne);
		}
	}

	@Override
	public void deleteAll() {
		String sql = " DELETE FROM Personne";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

}