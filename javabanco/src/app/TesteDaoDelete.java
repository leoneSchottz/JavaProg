package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoDelete {

	public static void main(String[] args) {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do contato a excluir: ");
		String scnome = sc.nextLine();
		contato.setNome(scnome);
		
		
		try {
			ContatoDAO dao = new ContatoDAO();
			dao.delete(contato.getNome());

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
