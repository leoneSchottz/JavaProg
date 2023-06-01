package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoUpdate {

	public TesteDaoUpdate() {

		try {
			ContatoDAO dao = new ContatoDAO();
			Scanner sc = new Scanner(System.in);
			System.out.println("Id a ser alterado: ");
			Long scid = sc.nextLong();

			Contato contato = dao.getListaById(scid);
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("*************************");
			System.out.println("Altere os dados, casos queira manter algum apenas tecle 'Enter' %n");

			System.out.println("Nome: ");
			String scnome = sc.nextLine();
			if (!scnome.isEmpty()) {
				contato.setNome(scnome);
			}

			System.out.println("Email: ");
			String scemail = sc.nextLine();
			if (!scemail.isEmpty()) {
				contato.setEmail(scemail);
			}

			System.out.println("Endereço: ");
			String scendereco = sc.nextLine();
			if (!scendereco.isEmpty()) {
				contato.setEndereco(scendereco);
			}
			ContatoDAO dao1 = new ContatoDAO();
			dao1.update(contato, scid);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
