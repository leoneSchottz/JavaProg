package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancojava.ConnectionFactory;
import model.Contato;

public class ContatoDAO {
	private Connection con;

	public ContatoDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	public void adiciona(Contato contato) throws SQLException {
		String sql = "insert into contatos (nome, endereco, email) values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEndereco());
		stmt.setString(3, contato.getEmail());
		stmt.execute();
		stmt.close();
		System.out.println("Inserido!");
		this.con.close();
	}

	public void delete(String nome) throws SQLException {
		String sql = "delete from contatos where nome=(?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		stmt.close();
		System.out.println("Deletado!");
		con.close();
	}

	public List<Contato> getListaByInicial(char c) throws SQLException {

		String sql = "select * from contatos where nome like (?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, c + "%");
		ResultSet rs = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();
		while (rs.next()) {
			Contato contato = new Contato();
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));
			contatos.add(contato);
		}
		System.out.println("Consultado!");
		stmt.close();
		con.close();

		return contatos;

	}

	public Contato getListaById(Long id) throws SQLException {

		String sql = "select * from contatos where id=(?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, id);
		ResultSet rs = stmt.executeQuery();

		rs.next();
		Contato contato = new Contato();
		contato.setNome(rs.getString("nome"));
		contato.setEmail(rs.getString("email"));
		contato.setEndereco(rs.getString("endereco"));

		System.out.println("Consultado!");
		stmt.close();
		con.close();

		return contato;

	}

	public void update(Contato contato, Long id) throws SQLException {
		String sql = "update contatos set nome=(?), endereco=(?), email=(?) where id=(?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEndereco());
		stmt.setString(3, contato.getEmail());
		stmt.setLong(4, id);
		stmt.execute();
		stmt.close();
		System.out.println("Alterado!");
		this.con.close();
	}

}
