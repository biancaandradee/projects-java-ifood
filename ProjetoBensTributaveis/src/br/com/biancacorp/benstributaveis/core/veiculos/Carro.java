package br.com.biancacorp.benstributaveis.core.veiculos;

import br.com.biancacorp.benstributaveis.taxes.BemTributavel;

public class Carro extends Veiculo implements BemTributavel{

	private int numeroPortas;
	private double potencia;
	
	public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, double potencia) {
		super(marca, modelo, ano, preco);
		this.numeroPortas = numeroPortas;
		this.potencia = potencia;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", numeroPortas="
				+ numeroPortas + ", potencia=" + potencia + "]";
	}

	@Override
	public double calcularImposto() {
		if (super.ano < 2000) {
			return 0.0;
		}
		return super.preco * 0.04;
	}
	
	
	
	
}
