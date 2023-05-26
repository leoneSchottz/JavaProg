package app;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDAO;
import dao.FuncionarioDAO;
import model.Funcionario;

public class TesteDaoDeleteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario= new Funcionario();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do contato a excluir: ");
		String scnome = sc.nextLine();
		funcionario.setNome(scnome);
		
		
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.delete(funcionario.getNome());

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
