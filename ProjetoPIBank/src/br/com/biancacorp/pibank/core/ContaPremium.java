package br.com.biancacorp.pibank.core;

public class ContaPremium extends ContaEspecial {

	protected double milhas;

	public ContaPremium(String nomeTitular, String cpf, int numeroConta, double saldo, double limite, double milhas) {
		super(nomeTitular, cpf, numeroConta, saldo, limite);
		this.milhas = milhas;
	}

	public double getMilhas() {
		return milhas;
	}

	public void setMilhas(double milhas) {
		this.milhas = milhas;
	}
	
	@Override
	public boolean debitar(double valor) {
		//Versão mais curta
		if (super.debitar(valor)) {        //Ou if (super.saldo + super.limite >= valor)
			this.milhas += valor / 100;    //         super.saldo -= valor;
			return true;                   //         this.milhas += valor / 100;
		}                                  //         return true;
		return false;                      //             ...
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Milhas: " + String.format("%.3f\n", this.milhas);
	}
	
}
