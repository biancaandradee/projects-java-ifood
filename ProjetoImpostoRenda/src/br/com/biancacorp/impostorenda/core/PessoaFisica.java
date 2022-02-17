package br.com.biancacorp.impostorenda.core;

public class PessoaFisica extends Contribuinte{
	private String cpf;
	private double rendimentoAnual;
	private int dependentes;
	
	
	public PessoaFisica(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual,
			int dependentes) {
		super(numeroCadastral, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.dependentes = dependentes;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getRendimentoAnual() {
		return rendimentoAnual;
	}


	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}


	public int getDependentes() {
		return dependentes;
	}


	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	
	@Override
	public double calcularImpostoDevido() {
		double baseCalculo = this.rendimentoAnual - 1770.0 * this.dependentes;
		double imposto;
		if (baseCalculo < 25000.0) {
			imposto = 0.0;
		} else if (baseCalculo < 50000.0) {
			imposto = baseCalculo * 0.15;
		} else if (baseCalculo < 100000.0) {
			imposto = baseCalculo * 0.2;
		} else {
			imposto = baseCalculo * 0.275;
		}
		return imposto;
	}


	@Override
	public String toString() {
		return "PessoaFisica [numeroCadastral=" + numeroCadastral + ", nome=" + nome + ", endereco=" + endereco
				+ ", cpf=" + cpf + ", rendimentoAnual=" + rendimentoAnual + ", dependentes=" + dependentes + "]";
	}


	
	
	
}
