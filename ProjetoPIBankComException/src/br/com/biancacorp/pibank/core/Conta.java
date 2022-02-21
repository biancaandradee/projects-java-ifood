package br.com.biancacorp.pibank.core;

import br.com.biancacorp.pibank.cor.exceptions.ContaException;

public class Conta  {
	
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;
	
	public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public boolean debitar(double valor) throws ContaException{
		if (valor <= 0) {
			throw new ContaException("Valor inválido para débito!", valor);
		}
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Débito realizado com sucesso!\n");
			return true;
		}
		System.out.println("Débito inválido! Saldo insuficiente.\n");
		return false;
	}
	
	public void creditar(double valor) throws ContaException{
		if (valor <= 0) {
			throw new ContaException("Valor inválido para crédito: ", valor);
		}
		this.saldo += valor;
	}
	
	public String exibirInfo() {
		String info = "Conta n. " + this.numeroConta + "\nNome Titular: " + this.nomeTitular + 
				"\nCPF: " + this.cpf + "\nSaldo: R$ " + String.format("%.2f\n", this.saldo);
		return info;
	}
	
	@Override
	public String toString() {
		return "Conta n. " + this.numeroConta + "\nNome Titular: " + this.nomeTitular + 
				"\nCPF: " + this.cpf + "\nSaldo: R$ " + String.format("%.2f\n", this.saldo);
	}

}
