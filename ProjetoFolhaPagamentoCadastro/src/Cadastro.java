import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int tipo, numFunc;
		double valor1, valor2, valor3;
		int valor4;

		String linhaDoArquivo;

		int opcao;

		try {
			File arquivo = new File("/Users/bianca.andrade/Desktop/Java/workspace-ifood/projects-java-ifood/ProjetoFolhaPagamentoArquivos/funcionarios");
			FileWriter escritor = new FileWriter(arquivo, true);

			do {
				System.out.println("Digite: 1 - Chefe / 2 - Comissionado / 3 - Horista / 4 - Empreiteiro");
				tipo = Integer.parseInt(sc.nextLine());

				System.out.println("Digite o Número Funcional: ");
				numFunc = Integer.parseInt(sc.nextLine());

				System.out.println("Digite o Nome:");
				nome = sc.nextLine();

				if (tipo == 1) {
					System.out.println("Digite o Salário Base: ");
					valor1 = Double.parseDouble(sc.nextLine());
					System.out.println("Digite o Adicional Função: ");
					valor2 = Double.parseDouble(sc.nextLine());
					System.out.println("Digite o Benefício Terno: ");
					valor3 = Double.parseDouble(sc.nextLine());

					linhaDoArquivo = tipo + " ; " + numFunc + " ; " + nome + " ; " + valor1 + " ; " + valor2 + " ; " + valor3 + "\n";
					escritor.write(linhaDoArquivo);
					
				} else if (tipo == 2) {
					System.out.println("Digite o Salário Base: ");
					valor1 = Double.parseDouble(sc.nextLine());
					System.out.println("Digite a Comissão: ");
					valor2 = Double.parseDouble(sc.nextLine());

					linhaDoArquivo = tipo + " ; " + numFunc + " ; " + nome + " ; " + valor1 + " ; " + valor2 + "\n";
					escritor.write(linhaDoArquivo);

				} else if (tipo == 3) {
					System.out.println("Digite o Número de Horas: ");
					valor4 = Integer.parseInt(sc.nextLine());
					System.out.println("Digite o Valor da Hora: ");
					valor2 = Double.parseDouble(sc.nextLine());
					

					linhaDoArquivo = tipo + " ; " + numFunc + " ; " + nome + " ; " + valor4 + " ; " + valor2 + "\n";
					escritor.write(linhaDoArquivo);

				} else if (tipo == 4) {
					System.out.println("Digite o Salário Base: ");
					valor1 = Double.parseDouble(sc.nextLine());

					linhaDoArquivo = tipo + " ; " + numFunc + " ; " + nome + " ; " + valor1 + "\n";
					escritor.write(linhaDoArquivo);

				} else {
					System.err.println("Tipo desconhecido.");
				}
				System.out.println("Deseja continuar? 1 - Sim / 0 - Não");
				opcao = Integer.parseInt(sc.nextLine());

			} while (opcao != 0);

			escritor.close();
			sc.close();

		} catch (Exception e) {
			System.err.println("Erro ao manipular o arquivo");
			e.printStackTrace();
		}
	}

}
