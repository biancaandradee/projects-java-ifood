package br.com.biancacorp.pibank.core;

import br.com.biancacorp.pibank.cor.exceptions.ContaException;

public class ContaEspecial extends Conta {

	double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(double valor) throws ContaException {
		if (valor <= 0) {
			throw new ContaException("Valor inválido para débito!", valor);
		}
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			System.out.println("Débito realizado com sucesso!\n");
			return true;
		}
		System.out.println("Débito inválido! Saldo e limite insuficientes.\n");
		return false;
	}
	
//	@Override
//	public boolean debitar(double valor) {
//		if (super.saldo >= valor) {
//			super.saldo -= valor;
//			System.out.println("Débito realizado com sucesso!\n");
//			return true;
//		} else if (super.saldo < valor && this.limite >= valor) {
//			super.saldo -= valor;
//			this.limite -= valor;
//			System.out.println("Débito realizado com sucesso!\n");
//			return true;
//		} else if (valor > this.limite) {
//			System.out.println("Débito inválido! Saldo insuficiente.\n");
//		}
//		return false;
//	}
	
	@Override
	public String exibirInfo() {
		String info = "Conta n. " + super.numeroConta + "\nNome Titular: " + super.nomeTitular + 
				"\nCPF: " + super.cpf + "\nSaldo: R$ " + String.format("%.2f\n", super.saldo) + 
				"Limite: R$ " + String.format("%.2f\n", this.limite);
		return info;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Limite: R$ " + String.format("%.2f\n", this.limite);
	}
}
