package br.com.biancacorp.vendingmachine.core;

public class Refrigerantes {

	private int id;
	private String nome;
	private double preco;
	private int qtdeEstoque;
	
	public Refrigerantes(int id, String nome, double preco, int qtdeEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	

	
	
}
