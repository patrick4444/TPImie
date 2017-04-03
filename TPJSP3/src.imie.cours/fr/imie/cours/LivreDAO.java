package fr.imie.cours;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivreDAO implements DAO<Livre> {

	private Connection getConnection() throws SQLException {
		// try {
		// String driverClass = "com.mysql.jdbc.Driver";
		// DriverManager.registerDriver((Driver) Class.forName(driverClass).newInstance());
	return DriverManager.getConnection("jdbc:postgresql://localhost:5432/TPJSP3","postgres","postgres");
		// } catch (ReflectiveOperationException ex) {
		// throw new SQLException(ex);
		// }
	}

	@Override
	public List<Livre> findAll() {
		String sql = " SELECT id_livre , nom_livre , auteur FROM livre ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet result = statement.executeQuery()) {
			List<Livre> list = new ArrayList<>();
			while (result.next()) {
				Livre livre = new Livre();
				livre.setId(result.getInt("id_livre"));
				livre.setNom_livre(result.getString("nom_livre"));
				livre.setAuteur(result.getString("auteur"));
				list.add(livre);
			}
			return list;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public List<Livre> findAll2() {
		Connection connection = null;
		try {
			try {
				connection = getConnection();
				return null;
			} finally {
				if (connection != null) {
					connection.close();
				}
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Livre findOne(Livre data) {
		return findOne(data.getId_livre());
	}

	@Override
	public Livre findOne(Integer id_livre) {
		String sql = " SELECT nom_livre , Auteur FROM Livre WHERE id_livre = ? ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setInt(1, id_livre);
			try (ResultSet result = statement.executeQuery();) {
				result.next();
				Livre Livre = new Livre();
				Livre.setId(id_livre);
				Livre.setNom_livre(result.getString("nom_livre"));
				Livre.setAuteur(result.getString("Auteur"));
				return Livre;
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	

	@Override
	public Livre insert(Livre data) {
		String sql = "Insert into Livre (nom_livre, Auteur) VALUES (?,?)";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			int index = 1;
			statement.setString(index++, data.getNom_livre());
			statement.setString(index++, data.getAuteur());
				statement.executeUpdate();
				//result.next();
				Livre Livre = new Livre();
				Livre.setId(data.getId_livre());
				Livre.setNom_livre(data.getNom_livre());
				Livre.setAuteur(data.getAuteur());
				return Livre;
			
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void update(Livre data) {
		String sql = " UPDATE Livre SET nom_livre = ? , Auteur = ? WHERE id_livre = ? ";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			int index = 1;
			statement.setString(index++, data.getNom_livre());
			statement.setString(index++, data.getAuteur());
			statement.setInt(index++, data.getId_livre());
			statement.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void delete(Livre data) {
		delete(data.getId_livre());
	}

	@Override
	public void delete(Integer id_livre) {
		String sql = "delete from Livre where id_livre=?";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			    statement.setInt(1, id_livre);
				statement.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void delete(List<Livre> data) {
		String sql = "delete from Livre where id_livre=?";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			for (Livre Livre : data) {
				statement.setInt(1, Livre.getId_livre());
				statement.executeUpdate();
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void deleteAll() {
		String sql = "delete from Livre";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
				statement.executeUpdate();
			}
		catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	

}