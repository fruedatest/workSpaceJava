package mainPackage.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mainPackage.connector.Connector;
import mainPackage.model.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao{

	@Override
	public boolean registrar(Usuario usuario) {
		boolean registrar = false;
		
		Statement statement = null;
		Connection connection = null;
		
		String sql = "INSERT INTO `mydb`.`usuario` VALUES (NULL,'"+usuario.getUsername()+"','"+usuario.getPassword()+"','"+usuario.getEmail()+"')";
		
		try {
			connection = Connector.conectar();
			statement = connection.createStatement();
			statement.execute(sql);
			
			registrar = true;
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			System.err.println("Error al registrar un usuario." + e.toString());
		}
		
		
		return registrar;
	}

	@Override
	public List<Usuario> obtener() {
		Statement statement = null;
		Connection connection = null;
		ResultSet resultSet = null;
		
		String sql = "SELECT * FROM `mydb`.`usuario`";
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			connection = Connector.conectar();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setIdUusario(resultSet.getInt(1));
				usuario.setUsername(resultSet.getString(2));
				usuario.setPassword(resultSet.getString(3));
				usuario.setEmail(resultSet.getString(4));
				
				listaUsuarios.add(usuario);
			}
			
			connection.close();
			statement.close();
			resultSet.close();
			
		} catch (Exception e) {
			System.err.println("Error al obtener lista de usuarios: "+e.toString());
		}
		
		return listaUsuarios;
	}

	@Override
	public boolean eliminar(Usuario usuario) {
		Connection connection = null;
		Statement statement = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM `mydb`.`usuario` WHERE idUsuario="+usuario.getIdUusario();
		
		try {
			connection = Connector.conectar();
			statement = connection.createStatement();
			statement.execute(sql);
			eliminar = true;
		
		} catch (SQLException e) {
			System.err.println("Error al eliminar usuario: "+e.toString());
		
		}
		
		return eliminar;
	}
	
	@Override
	public boolean actualizar(Usuario usuario) {
		Connection connection = null;
		Statement statement = null;
		boolean actualizar = false;
		
		String sql = "UPDATE `mydb`.`usuario` SET username='"+usuario.getUsername()+"', password='"+usuario.getPassword()+"', email='"+usuario.getEmail()+"'" +" WHERE idUsuario="+usuario.getIdUusario();
		
		try {
			connection = Connector.conectar();
			statement = connection.createStatement();
			statement.execute(sql);
			actualizar = true;
			
		} catch (Exception e) {
			System.err.println("Error al actualizar el usuario "+e.toString());
		}
		
		return actualizar;
	}

	

}
