package br.com.biancacorp.impostorenda.userinterface;

import br.com.biancacorp.impostorenda.core.Contribuinte;
import br.com.biancacorp.impostorenda.core.PessoaFisica;
import br.com.biancacorp.impostorenda.core.PessoaJuridica;

public class SecretariaDaFazenda {

	public static void main(String[] args) {

		Contribuinte lista[] = new Contribuinte[5];
		lista[0] = new PessoaFisica(100012, "Bianca", "Rua Amadeu 436", "123.456.789-00", 85000.00, 2);
		lista[1] = new PessoaFisica(100022, "Bianca", "Rua Amadeu 436", "123.456.789-00", 150000.00, 15);
		lista[2] = new PessoaFisica(100033, "Bianca", "Rua da Bianca, 77", "123.456.789-00", 180000.00, 3);
		lista[3] = new PessoaJuridica(200011, "BiancaCorp", "Silycon Ave 123", "14.320.777/0001-49", 200000.0);
		lista[4] = new PessoaJuridica(200022, "BiancaFlix", "Silycon Ave 777", "14.320.777/0001-77", 600000.0);

		for (Contribuinte c : lista) {
			System.out.println(c);
			System.out.println("Imposto Devido: R$ " + String.format("%.2f", c.calcularImpostoDevido()));
		}


	}

}
