package userinterface;

import java.util.Scanner;

import core.exception.ProdutoException;
import core.model.Produto;

public class Cadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto;
		Produto p = new Produto();
		int opcao = 0;

		do {
			try {
				System.out.println("Digite o código do produto: ");
				texto = sc.nextLine();
				p.setId(Integer.parseInt(texto));

				System.out.println("Digite a descrição do produto: ");
				texto = sc.nextLine();
				p.setDescricao(texto);

				System.out.println("Digite o preço do produto: ");
				texto = sc.nextLine();
				p.setPreco(Double.parseDouble(texto));

				System.out.println("Produto cadastrado!");
				System.out.println(p);

				System.out.println("Cadastrar novo produto? 1 - Sim / 0 - Não");
				opcao = Integer.parseInt(sc.nextLine());
			} catch (ProdutoException e) {
				System.err.println("Erro de regra de negócio: " + e.getMessage());
			} catch (NumberFormatException | ArithmeticException e) {
				System.err.println("Erro em dados inválidos " + e.getMessage());
			} catch (Exception e) {
				System.err.println("Erro geral " + e);
				break;
			}
		} while (opcao != 0);

		sc.close();

	}
}
