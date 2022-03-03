package model;

public class Comissionado extends Funcionario {

	private double salarioBase;
	private double comissao;
	
	public Comissionado(int num, String nome, double salarioBase, double comissao) {
		super(num, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return this.salarioBase + (this.salarioBase * this.comissao / 100);
	}

	@Override
	public String toString() {
		return "Comissionado [num=" + num + ", nome=" + nome + ", salarioBase=" + salarioBase
				+ ", comissao=" + comissao + "]";
	}
	
	
	
}
