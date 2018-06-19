package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//Status da conex�o para consulta
	private String statusConexao = "N�o conectado";
	
	public Connection getConexao(){
		
		//Atributo para conex�o
		Connection conexao = null;
		
		//Tentativa para fazer a conex�o 
		try {
			
			//Drive padr�o para conex�o
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			//Parametros para a conex�o
			String server = "localhost";
			String schema = "caixa";
			
			//URL da minha base de dados
			String url = "jdbc:mysql://" + server + "/" + schema;
			
			//Parametro de login na base de dados
			String user = "root";
			String pass = "";
			
			//Setar a conex�o
			conexao = (Connection)DriverManager.getConnection(url, user, pass);
			
			//Testar a conex�o
			if(conexao != null) {
				statusConexao = ("Conectado");
			}else {
				statusConexao = ("N�o conectado");
			}
			return conexao;	
			
		}catch(ClassNotFoundException e){
			//Caso n�o encontre o drive de conex�o
			System.out.println("Driver de conex�o n�o encontrado    ");
            return null;
		}catch(SQLException e){
			//Caso n�o consiga se conectar
			System.out.println("Segue o erro de conex�ao -> " + e.getMessage());
            return null;
		}
	}
	
	//Metodo que retorna o estado da conex�o
	public String statusConexao(){
		return statusConexao;
	}
	
	//Metodo para fechar a conex�o
	public boolean fecharConexao(){
		try {
			getConexao().close();
			statusConexao = ("Conex�o Encerrada");
			return true;			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
            return false;
		}
	}
	//Reinicie a conex�o;
	public Connection reinicieConexao(){
		fecharConexao(); //Feche
		return getConexao(); //Abra e retorne
	}
}

