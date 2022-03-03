package model;

public class Empreiteiro extends Funcionario {

	private double valorEmpreita;

	public Empreiteiro(int num, String nome, double valorEmpreita) {
		super(num, nome);
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
		return "Empreiteiro [num=" + num + ", nome=" + nome + ", valorEmpreita=" + valorEmpreita
				+ "]";
	}

	
	
}
