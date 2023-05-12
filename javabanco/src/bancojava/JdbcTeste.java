package bancojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "";
		
		try {
			Connection con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Tudo em casa!");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
