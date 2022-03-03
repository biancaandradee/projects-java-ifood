package model;

public class Horista extends Funcionario {
	
	private int numeroHoras;
	private double valorHora;
	
	public Horista(int num, String nome, int numeroHoras, double valorHora) {
		super(num, nome);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double calcularSalario() {
		return this.valorHora * this.numeroHoras;
	}

	@Override
	public String toString() {
		return "Horista [num=" + num + ", nome=" + nome + ", numeroHoras=" + numeroHoras
				+ ", valorHora=" + valorHora + "]";
	}
	
	
}
