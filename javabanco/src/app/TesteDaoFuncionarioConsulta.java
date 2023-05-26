package app;

import java.sql.SQLException;


import dao.FuncionarioDAO;

import model.Funcionario;

public class TesteDaoFuncionarioConsulta {
	public static void main(String[] args) {
		
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			
			for (Funcionario funcionario : dao.getLista()) {
				System.out.println("Nome: "+funcionario.getNome()); 
				System.out.println("Usuario: "+funcionario.getUsuario()); 
				System.out.println("Senha: "+funcionario.getSenha()); 
				System.out.println("*************************");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
