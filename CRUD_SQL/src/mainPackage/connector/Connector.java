package mainPackage.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	/*
	 * Para poder realizar la conexión con la base de datos mediante JDBC hay que importar el jar descargado en:
	 * https://jar-download.com/artifacts/mysql/mysql-connector-java
	 */
	public static Connection conectar() {
		
		Connection connection = null;
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://127.0.0.1:3306/artist?user="+user+"&password="+password;
		
		try {
			connection = DriverManager.getConnection(url);
			if (connection != null) {
				System.out.println("Operación realizada con éxtio!");
			}
			
		} catch (SQLException e) {
			System.err.println("Error al realizar la operación! Error: "+e.toString());

		}
		
		return connection;
		
	}
}
