package br.com.biancacorp.vendingmachine.userinterface;

import java.util.Scanner;

import br.com.biancacorp.vendingmachine.core.Maquina;

public class Cliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Maquina m = new Maquina();

		int opcao;
		double valor;

		do {
			System.out.println("==============================");
			System.out.println("M Á Q U I N A  D E  R E F R I");
			System.out.println("==============================");
			System.out.println(" 100 - Inserir Credito");
			System.out.println(" 101 - Solicitar Troco");
			System.out.println("  -1 - Sair");
			System.out.println(" Escolha seu Refri ");
			System.out.println(m.exibirDisplay());
			System.out.println(" CREDITO = R$ " + m.getCredito());
			opcao = sc.nextInt();
			switch (opcao) {
			case 100:
				System.out.println("Digite o crédito a inserir: ");
				valor = sc.nextDouble();
				m.adicionarCredito(valor);
				break;
			case 101:
				System.out.println("Seu troco = R$ " + m.solicitarTroco());
				break;
			case -1:
				System.out.println("Obrigada! Volte sempre!");
				break;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				int resultado = m.comprar(opcao);
				if (resultado == 0) {
					System.out.println("Aproveite seu Refri!");
				} else if (resultado == -1) {
					System.out.println("Crédito insuficiente");
				} else {
					System.out.println("Desculpe, sem estoque.");
				}
				break;
			default:
				System.out.println("Opção Inválida");
			}
		} while (opcao != -1);

		sc.close();

	}

}
