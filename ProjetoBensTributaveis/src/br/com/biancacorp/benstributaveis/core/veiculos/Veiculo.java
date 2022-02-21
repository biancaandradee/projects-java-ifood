package br.com.biancacorp.benstributaveis.core.veiculos;

public abstract class Veiculo {

	protected String marca;
	protected String modelo;
	protected int    ano;
	protected double preco;
	
	public Veiculo(String marca, String modelo, int ano, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
