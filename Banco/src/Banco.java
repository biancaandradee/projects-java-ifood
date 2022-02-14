import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		double valor;
		
		ContaBancaria conta;
		conta = new ContaBancaria();
		
		conta.setNomeTitular("Bianca Andrade");
		conta.setCpfTitular("123.456.789-00");
		conta.setTipoConta(2);
		conta.setNumeroConta(1234567);
		conta.setSaldo(1000.00);
		
		do {
			System.out.println("\nIsiBank - Seu banco na Internedica!");
			System.out.println("1 - Depósito\n2 - Saque\n3 - Infos\n0 - Encerra\n");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor do depósito: ");
				valor = sc.nextDouble();
				conta.deposito(valor);
				break;
			case 2:
				System.out.println("Digite o valor do saque: ");
				valor = sc.nextDouble();
				if (conta.saque(valor)) {
					System.out.println("Saque efetuado com sucesso!");
				} else {
					System.out.println("Saldo insuficiente");
				}
				break;
			case 3:
				conta.dadosConta();
				break;
			case 0:
				System.out.println("Obrigado pela preferência!");
				break;
			default:
					System.out.println("Opção inválida!");
					break;
			}
		} while (opcao != 0);
		
		
		

	
		
		sc.close();

	}

}
