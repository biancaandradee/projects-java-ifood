package br.com.biancacorp.benstributaveis.core.imoveis;

import br.com.biancacorp.benstributaveis.taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel {

	private double metragem;

	public Residencial(String endereco, double valorVenal, double metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	@Override
	public double calcularImposto() {
		if (this.metragem <= 100) {
			return super.valorVenal * 0.015;
		} 
			return super.valorVenal * 0.03;
	}

	@Override
	public String toString() {
		return "Residencial [endereco=" + endereco + ", valorVenal=" + valorVenal + ", metragem=" + metragem + "]";
	}
	
	
}
