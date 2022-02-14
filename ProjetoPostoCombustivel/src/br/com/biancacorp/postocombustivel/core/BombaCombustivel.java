package br.com.biancacorp.postocombustivel.core;

public class BombaCombustivel {

	private String nomeCombustivel;
	private double valorLitro;
	private double qtdeLitros;
	private double valorTotal;

	public BombaCombustivel(String nomeCombustivel, double valorLitro) {
		super();
		this.nomeCombustivel = nomeCombustivel;
		this.valorLitro = valorLitro;
	}


	public void abastecerValor(double valor) {
		this.valorTotal = valor;
		this.qtdeLitros = this.valorTotal / this.valorLitro;
	}

	public void abastecerLitros(double litros) {
		this.qtdeLitros = litros;
		this.valorTotal = this.qtdeLitros * this.valorLitro;
	}
	
	public String exibirRecibo() {
		String recibo = "==============================\n" +
						"    POSTO  DE  COMBUSTÍVEL    \n" +
						"==============================\n" + 
						"RECIBO: \nCombustível: " + this.nomeCombustivel + "\nPreço Litro: R$ " + String.format("%.3f\n", this.valorLitro) + 
						"Abastecidos: " + String.format("%.3f litros\n", qtdeLitros) + "Valor total: R$ " + String.format("%.2f\n", valorTotal);
		return recibo;
	}
}
