package br.com.biancacorp.folhapagamento.core;

import br.com.biancacorp.folhapagamento.root.Funcionario;

public class Chefe extends Funcionario {
	
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTerno;
	
	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public double calcularSalario() {
		return this.salarioBase + (this.salarioBase * this.adicionalFuncao / 100) + this.beneficioTerno;
	}

	@Override
	public String toString() {
		return "Chefe [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", salarioBase=" + salarioBase
				+ ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno=" + beneficioTerno + "]";
	}
	
	
	
	
	

}
