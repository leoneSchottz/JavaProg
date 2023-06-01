package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoListaByInicial {

	public TesteDaoListaByInicial() {

		try {
			ContatoDAO dao = new ContatoDAO();
			Scanner sc = new Scanner(System.in);
			System.out.println("Inicial: ");
			String scini = sc.nextLine();

			for (Contato contato : dao.getListaByInicial(scini.charAt(0))) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Endereço: " + contato.getEndereco());
				System.out.println("*************************");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
