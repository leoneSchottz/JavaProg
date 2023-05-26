package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancojava.ConnectionFactory;
import model.Funcionario;

public class FuncionarioDAO {
	private Connection con;
	
	public FuncionarioDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	public void adiciona(Funcionario funcionario) throws SQLException {
		String sql = "insert into funcionarios (nome, usuario, senha) values (?,?,?)";
		PreparedStatement stmt =  con.prepareStatement(sql);
		stmt.setString(1, funcionario.getNome());
		stmt.setString(2, funcionario.getUsuario());
		stmt.setString(3, funcionario.getSenha());
		stmt.execute();
		stmt.close();
		System.out.println("Inserido!");
		con.close();
	}
	
	public void delete(String nome) throws SQLException {
		String sql = "delete from funcionarios where nome=(?)";
		PreparedStatement stmt =  con.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		stmt.close();
		System.out.println("Deletado!");
		con.close();
	}
	
	public List<Funcionario> getLista() throws SQLException {
		
		String sql = "select * from funcionarios";
		PreparedStatement stmt =  con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		while (rs.next()) {
			Funcionario funcionario= new Funcionario();
			funcionario.setNome(rs.getString("nome"));
			funcionario.setUsuario(rs.getString("usuario"));
			funcionario.setSenha(rs.getString("senha"));
			funcionarios.add(funcionario);
		}
		System.out.println("Consultado!");
		stmt.close();
		con.close();
		
		return funcionarios;
		
	}
}
