package app;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Scanner;

import dao.FuncionarioDAO;
import model.Funcionario;

public class TesteDaoFuncionarioInsere {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String scnome = sc.nextLine();
		funcionario.setNome(scnome);
		
		System.out.println("Usuario: ");
		String scusuario = sc.nextLine();
		funcionario.setUsuario(scusuario);
		
		System.out.println("Senha: ");
		String scsenha = sc.nextLine();
		byte[] encodedBytes = Base64.getEncoder().encode(scsenha.getBytes("UTF-8"));
		
		funcionario.setSenha(new String(encodedBytes));
		sc.close();
		
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.adiciona(funcionario);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
