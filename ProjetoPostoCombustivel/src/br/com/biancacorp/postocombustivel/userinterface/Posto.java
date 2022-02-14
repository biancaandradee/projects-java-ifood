package br.com.biancacorp.postocombustivel.userinterface;

import java.util.Scanner;

import br.com.biancacorp.postocombustivel.core.BombaCombustivel;

public class Posto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao, tipo;
		double litros;
		double valor;

		BombaCombustivel bombas[] = new BombaCombustivel[4];
		bombas[0] = new BombaCombustivel("Etanol", 4.89);
		bombas[1] = new BombaCombustivel("Gasolina", 6.78);
		bombas[2] = new BombaCombustivel("Gasolina Aditivada", 7.01);
		bombas[3] = new BombaCombustivel("Diesel", 3.77);

		do {
			System.out.println("Qual combustível?");
			System.out.println("1 - Etanol\n2 - Gasolina\n3 - Gasolina Aditivada\n4 - Diesel");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Deseja abastecer por:\n1 - Litros\n2 - Valor");
				tipo = sc.nextInt();
				if (tipo == 1) {
					System.out.println("Por favor, digite a quantidade de litros: ");
					litros = sc.nextDouble();
					bombas[opcao].abastecerLitros(litros);
					System.out.println(bombas[opcao].exibirRecibo());
				} else if (tipo == 2) {
					System.out.println("Por favor, digite o valor: ");
					valor = sc.nextDouble();
					bombas[opcao].abastecerValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				} else {
					System.out.println("Tipo de abastecimento desconhecido.");
				}
				break;
			case 0:
				System.out.println("Obrigada! Volte sempre!");
				break;
			default:
				System.out.println("Código inválido!");
				break;
			}

		} while (opcao != 0);

		sc.close();
	}

}
