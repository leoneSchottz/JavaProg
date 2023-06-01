package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoDelete {

	public TesteDaoDelete() {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.println("Id do contato a excluir: ");
		String scid = sc.nextLine();
		contato.setNome(scid);

		try {
			ContatoDAO dao = new ContatoDAO();
			dao.delete(contato.getId().toString());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
