package br.com.biancacorp.folhapagamento.core;

import br.com.biancacorp.folhapagamento.root.Funcionario;

public class Horista extends Funcionario {

	private double valorHora;
	private int numeroHoras;

	public Horista(String nome, int numeroRegistro, double valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	@Override
	public double calcularSalario() {
		return this.valorHora * this.numeroHoras;
		
	}

	@Override
	public String toString() {
		return "Horista [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", valorHora=" + valorHora
				+ ", numeroHoras=" + numeroHoras + "]";
	}

	
}
