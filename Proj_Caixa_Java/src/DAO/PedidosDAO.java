package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;


import model.Pedidos;


public class PedidosDAO {
	
	
	public List<Pedidos> getListaDePedidos(){
		
		try {
			Conexao con = new Conexao();
			con.getConexao();
			
			String sql = "select * from tb_pedido";
			
			PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            
            List<Pedidos> listaDePedidos = new ArrayList<Pedidos>();
            while (resultado.next()) {
                Pedidos c = new Pedidos(); 
                c.setId_prato(resultado.getString("id_prato")); 
                c.setNome_prato(resultado.getString("nome_prato")); 
                c.setValor_prato(resultado.getDouble("valor_prato")); 
               
 
               
                listaDePedidos.add(c);
            }
            resultado.close();
            comando.close();
            con.getConexao().close();
            
            return listaDePedidos;
		}
		catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
	 }
   }
	

	
	
}


