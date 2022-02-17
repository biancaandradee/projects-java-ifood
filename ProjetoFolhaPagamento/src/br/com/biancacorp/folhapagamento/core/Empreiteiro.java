package br.com.biancacorp.folhapagamento.core;

import br.com.biancacorp.folhapagamento.root.Funcionario;

public class Empreiteiro extends Funcionario {
	private double valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, double valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public double calcularSalario() {
		return this.valorEmpreita;
	}

	@Override
	public String toString() {
		return "Empreiteiro [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", valorEmpreita=" + valorEmpreita
				+ "]";
	}

	
}
