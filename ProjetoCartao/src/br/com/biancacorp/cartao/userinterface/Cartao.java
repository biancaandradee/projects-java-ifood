package br.com.biancacorp.cartao.userinterface;
import java.util.Scanner;

import br.com.biancacorp.cartao.core.CartaoPrePago;

public class Cartao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		double valor;

		CartaoPrePago c = new CartaoPrePago("0123 4567 8901 2345", "Bianca Andrade", 2027, 01);

		do {
			System.out.println("Bem Vindo(a) a Loja!");
			System.out.println("1- Adicionar Crédito / 2- Comprar / 3- Info / 0- Sair");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor: ");
				valor = sc.nextDouble();
				c.adicionarCredito(valor);
				break;
			case 2:
				System.out.println("Digite o valor da compra: ");
				valor = sc.nextDouble();
				if (c.comprar(valor)) {
					System.out.println(" ---> COMPRA APROVADA!");
				} else {
					System.out.println(" ---> CRÉDITO INSUFICIENTE");
				}
				break;
			case 3:
				System.out.println("Seu cartão: " + c.getNumeroCartao() + " Val: " + c.getMesValidade() + "/"
						+ c.getAnoValidade());
				System.out.println("Titular: " + c.getNomeTitular());
				System.out.printf("Saldo: R$ %.2f\n", c.getSaldo());
				break;
			case 0:
				System.out.println("Obrigado pelo preferência!");
				break;
			default:
				System.out.println(">>>>> Opção Inválida! <<<<<");

			}
		} while (opcao != 0);

		System.out.println(c.dadosCartao());

		c.adicionarCredito(100.00);

		System.out.println(c.dadosCartao());

		c.comprar(27.99);

		System.out.println(c.dadosCartao());
		c.adicionarCredito(100);

		System.out.println(c.dadosCartao());

		

		
		
		sc.close();
	}

}
