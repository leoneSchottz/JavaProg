package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String scnome = sc.nextLine();
		contato.setNome(scnome);
		
		System.out.println("Email: ");
		String scemail = sc.nextLine();
		contato.setEmail(scemail);
		
		System.out.println("Endereço: ");
		String scendereco = sc.nextLine();
		contato.setEndereco(scendereco);
		sc.close();
		
		try {
			ContatoDAO dao = new ContatoDAO();
			dao.adiciona(contato);
//			dao.delete(contato.getNome());
			System.out.println("FEITO CERTO!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
