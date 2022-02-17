package br.com.biancacorp.impostorenda.core;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;
	private double faturamento;
	
	public PessoaJuridica(int numeroCadastral, String nome, String endereco, String cnpj, double faturamento) {
		super(numeroCadastral, nome, endereco);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	
	@Override
	public double calcularImpostoDevido() {
		double imposto;
		if (faturamento < 100000.0) {
			imposto = 0.0;
		} else if (faturamento < 250000.0) {
			imposto = faturamento * 0.06;
		} else if (faturamento < 450000.0) {
			imposto = faturamento * 0.15;
		} else {
			imposto = faturamento * 0.25;
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", numeroCadastral=" + numeroCadastral + ", endereco=" + endereco
				+ ", cnpj=" + cnpj + ", faturamento=" + faturamento + "]";
	}

	
	
	
	
}
