package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	static String url = "jdbc:postgresql://localhost:5432/passaporte";
	static String usuario = "postgres";
	static String senha = "toor";
	static Connection con;

	public static Connection getConexao() throws SQLException {

		try {
			Class.forName("org.postgresql.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, usuario, senha);
			}
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

}
