package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;

public class JdbcDelete {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "delete from contatos where nome=(?)";
			PreparedStatement stmt =  con.prepareStatement(sql);
			stmt.setString(1, "Leone");
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
