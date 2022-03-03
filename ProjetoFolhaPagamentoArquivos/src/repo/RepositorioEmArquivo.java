package repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import factory.FabricaFuncionarios;
import model.Funcionario;

public class RepositorioEmArquivo implements FuncionarioRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {

		try {
			ArrayList<Funcionario> lista;
			lista = new ArrayList<Funcionario>();
			FileReader arquivo = new FileReader(new File("./funcionarios"));
			String linha = "";
			BufferedReader br = new BufferedReader(arquivo);

			do {
				linha = br.readLine();
				if (linha != null) {
					// System.out.println(linha);

					// Posso criar uma funcionalidade para, a partir de cada linha, me retornar um
					// objeto
					// uma vez lida a linha, adiciono na lista o objeto a partir do arquivo CSV
					lista.add(FabricaFuncionarios.createFromCSV(linha));
				}
			} while (linha != null);
			
			br.close();
			return lista;
		}

		catch (IOException ex) {
			System.err.println("Erro ao ler arquivo");
			ex.printStackTrace();
			return null;
		} catch (RuntimeException ex) {
			throw ex;
		}
	}

	@Override
	public void salvarTudo(ArrayList<Funcionario> lista) {
		try {
			File arquivo = new File("./recibos");
			FileWriter fw = new FileWriter(arquivo);

			for (Funcionario f : lista) {
				fw.write("|   |----------------------------------------------------|   |\n");
				fw.write(String.format("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario()));
			}
			fw.close();
		} catch (IOException ex) {
			System.err.println("Erro ao gravar recibos");
			ex.printStackTrace();
		}

	}

}
