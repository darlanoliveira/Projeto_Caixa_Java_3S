package model;



public class Pedidos {
	
	private String id_prato;
	private String nome_prato;
	private Double valor_prato;
	
	public String getId_prato() {
		return id_prato;
	}
	public void setId_prato(String id_prato) {
		this.id_prato = id_prato;
	}
	
	public String getNome_prato() {
		return nome_prato;
	}
	
	public void setNome_prato(String nome_prato) {
		this.nome_prato = nome_prato;
	}
	
	public Double getValor_prato() {
		return valor_prato;
	}
	
	public void setValor_prato(Double valor_prato) {
		this.valor_prato = valor_prato;
	}
	
	@Override
	public String toString() {
		return getNome_prato();
	}
	
	
	
	
	
}
