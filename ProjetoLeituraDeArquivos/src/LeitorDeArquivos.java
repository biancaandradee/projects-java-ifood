import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeitorDeArquivos {
	public static void main(String[] args) {

		File arquivo = null;
		BufferedReader br;
		FileReader leitor;
		
		try {
			// A classe File indica que preciso manipular o arquivo com nome
			arquivo = new File("./alunos.txt");
			
			/* Possíveis variações 
			 *  FileReader leitor = new FileReader("./alunos.txt");
			 *  
			 *  FileReader leitor = new FileReader(new File("./alunos.txt"));			 * 
			 */


			// Com a classe FileReader vou manipular esse arquivo para LEITURA
			leitor = new FileReader(arquivo);

			// Agora preciso fazer as leitura
			br = new BufferedReader(leitor);

			String dadosAluno = "";

			do {
				dadosAluno = br.readLine();

				// A partir da linha obtida no arquivo, vou criar um novo aluno
				if (dadosAluno != null) {
					try {
						Aluno a = FabricaDeAlunos.criarAlunoFromCSV(dadosAluno);
						System.out.println(a);
						System.out.println(dadosAluno);
					} catch (DadosAlunoException | CSVFormatException ex) {
						System.err.println("Erro ao criar aluno! " + ex);
					}

				}
			} while (dadosAluno != null);

			br.close();
		} catch (Exception ex) {
			System.out.println("Deu ruim!");
			ex.printStackTrace();
		}
	}
}
