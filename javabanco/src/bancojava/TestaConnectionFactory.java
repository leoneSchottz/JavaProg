package bancojava;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConnectionFactory {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
