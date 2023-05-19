package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;
import model.Contato;

public class ContatoDAO {
	private Connection con;
	
	public ContatoDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	public void adiciona(Contato contato) throws SQLException {
		String sql = "insert into contatos (nome, endereco, email) values (?,?,?)";
		PreparedStatement stmt =  con.prepareStatement(sql);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEndereco());
		stmt.setString(3, contato.getEmail());
		stmt.execute();
		stmt.close();
		this.con.close();
	}
	
	public void delete(String nome) throws SQLException {
		String sql = "delete from contatos where nome=(?)";
		PreparedStatement stmt =  con.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		stmt.close();
		System.out.println("Feito!!");
		con.close();
	}
}
