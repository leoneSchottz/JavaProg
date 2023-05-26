package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import model.Contato;

public class TesteDaoLista {

	public static void main(String[] args) {
		
		try {
			ContatoDAO dao = new ContatoDAO();
			
			for (Contato contato : dao.getLista()) {
				System.out.println("Nome: "+contato.getNome()); 
				System.out.println("Email: "+contato.getEmail()); 
				System.out.println("Endereço: "+contato.getEndereco()); 
				System.out.println("*************************");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
