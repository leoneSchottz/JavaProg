package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;

public class JdbcInsere {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "insert into contatos (nome, endereco, email) values (?,?,?)";
			PreparedStatement stmt =  con.prepareStatement(sql);
			stmt.setString(1, "Leone");
			stmt.setString(2, "Rua Marechal Floriano");
			stmt.setString(3, "schottzleone@gmail.com");
			stmt.execute();
			stmt.close();
			System.out.println("Feito!!");
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
