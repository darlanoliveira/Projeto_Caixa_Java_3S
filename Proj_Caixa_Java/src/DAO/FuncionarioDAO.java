package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDAO {
	private Connection connection;
	String id,nome,cpf,email_func, senha_func,cargo;
	
	public FuncionarioDAO(){
		 this.connection = new Conexao().getConexao();	
	}
	
	public void adicionaFuncionario(Funcionario funcionario){
		String sql = "INSERT INTO tb_funcionario(nome_func,cpf_func,email_func,senha_func,cargo_func) VALUES(?,?,?,?,?)";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getCpf());
			stmt.setString(3, funcionario.getEmail());
			stmt.setString(4, funcionario.getSenha());
			stmt.setString(5, funcionario.getCargo());
			stmt.execute();	
			connection.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Funcionario> lerFuncionarios() throws Exception{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		String sql = "select * from tb_funcionario";
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		
		if(rs.next()){
			do{
			Funcionario funcionario = new Funcionario();
			funcionario.setId(rs.getString("id_func"));
			funcionario.setNome(rs.getString("nome_func"));
			funcionario.setCpf(rs.getString("cpf_func"));
			funcionario.setEmail(rs.getString("email_func"));
			funcionario.setSenha(rs.getString("senha_func"));
			funcionario.setCargo(rs.getString("cargo_func"));
			funcionarios.add(funcionario);
			}while(rs.next() != false);
		}else {
			System.out.println("erro");
		}
		rs.close();
		stmt.close();
		return funcionarios;
	}
	
	public Funcionario checarFuncionario(String email, String senha) throws SQLException{
		Funcionario funcionario = null;
		String sql = "select *from tb_funcionario where nome_func=? or email_func=? and senha_func=?";
		try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setObject(1, email);
		stmt.setObject(2, email);
		stmt.setObject(3, senha);
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			id = rs.getString("id_func");
			nome = rs.getString("nome_func");
			cpf = rs.getString("cpf_func");
			email_func = rs.getString("email_func");
			senha_func = rs.getString("senha_func");
			cargo = rs.getString("cargo_func");
			
			funcionario = new Funcionario();			
			funcionario.setId(id);
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setEmail(email);
			funcionario.setSenha(senha);
			funcionario.setCargo(cargo);
			stmt.close();
			
		}else{
			System.out.println("Usuario ou senha incorreto!!!");
		}
		
		return funcionario;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}

