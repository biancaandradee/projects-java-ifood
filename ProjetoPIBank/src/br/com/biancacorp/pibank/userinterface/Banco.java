package br.com.biancacorp.pibank.userinterface;

import br.com.biancacorp.pibank.core.Conta;
import br.com.biancacorp.pibank.core.ContaEspecial;
import br.com.biancacorp.pibank.core.ContaPremium;

public class Banco {

	public static void main(String[] args) {
		
		//Conta c;
		//Conta ce;
		//Conta cp;
		
		//c = new Conta("Bianca Andrade", "123.456.789-00", 7777, 200.0);
		//ce = new ContaEspecial("Bianca Handan", "987.654.432-11", 1717, 200.0, 200.0);
		//cp = new ContaPremium("Bianca Andrade Handan", "111.222.333-44", 7171, 100.0, 200.0, 0.0);



		
		Conta c = new Conta("Bianca Andrade", "123.456.789-00", 7777, 200.0);
		
		System.out.println(c);   //Usando o toString()
		
		c.creditar(100);
		System.out.println(c.exibirInfo());
		c.debitar(200);
		System.out.println(c.exibirInfo());


		ContaEspecial ce = new ContaEspecial("Bianca Handan", "987.654.432-11", 1717, 200.0, 200.0);
		
		System.out.println(ce); 
		ce.debitar(200);
		System.out.println(ce.exibirInfo());
		ce.debitar(200);
		System.out.println(ce.exibirInfo());
		ce.debitar(200);
		System.out.println(ce.exibirInfo());
		
		
		ContaPremium cp = new ContaPremium("Bianca Andrade Handan", "111.222.333-44", 7171, 100.0, 200.0, 0.0);
		
		System.out.println(cp); 
		cp.debitar(200);
		
		if (c instanceof ContaPremium) {
			System.out.println("C é premium.");
			ContaPremium tmp2 = (ContaPremium)c;
			System.out.println("Suas milhas valem " + tmp2.getMilhas());
		} else if (c instanceof ContaEspecial) {
			System.out.println("C é especial.");
			ContaEspecial tmp = (ContaEspecial)c;
			System.out.println("Seu limite vale " + tmp.getLimite());
		} else {
			System.out.println("C é genérico.");
		}
	}

}
