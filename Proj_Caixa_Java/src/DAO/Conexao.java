package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//Status da conexão para consulta
	private String statusConexao = "Não conectado";
	
	public Connection getConexao(){
		
		//Atributo para conexão
		Connection conexao = null;
		
		//Tentativa para fazer a conexão 
		try {
			
			//Drive padrão para conexão
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			//Parametros para a conexão
			String server = "localhost";
			String schema = "caixa";
			
			//URL da minha base de dados
			String url = "jdbc:mysql://" + server + "/" + schema;
			
			//Parametro de login na base de dados
			String user = "root";
			String pass = "";
			
			//Setar a conexão
			conexao = (Connection)DriverManager.getConnection(url, user, pass);
			
			//Testar a conexão
			if(conexao != null) {
				statusConexao = ("Conectado");
			}else {
				statusConexao = ("Não conectado");
			}
			return conexao;	
			
		}catch(ClassNotFoundException e){
			//Caso não encontre o drive de conexão
			System.out.println("Driver de conexão não encontrado    ");
            return null;
		}catch(SQLException e){
			//Caso não consiga se conectar
			System.out.println("Segue o erro de conexçao -> " + e.getMessage());
            return null;
		}
	}
	
	//Metodo que retorna o estado da conexão
	public String statusConexao(){
		return statusConexao;
	}
	
	//Metodo para fechar a conexão
	public boolean fecharConexao(){
		try {
			getConexao().close();
			statusConexao = ("Conexão Encerrada");
			return true;			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
            return false;
		}
	}
	//Reinicie a conexão;
	public Connection reinicieConexao(){
		fecharConexao(); //Feche
		return getConexao(); //Abra e retorne
	}
}

