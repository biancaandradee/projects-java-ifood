package br.com.biancacorp.javavirtual.core;

public class Pedido {

	private String data;           //Pelo construtor padrão data = null
	private Cliente cliente;       //Pelo construtor padrão cliente = null
	private Produto produto;       //Pelo construtor padrão produto = null
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String exibir() {
		return "Pedido: " + data + "\n" + "Produto: " + produto.exibir() + "\n" + "Cliente: " + cliente.exibir();
	}
}
