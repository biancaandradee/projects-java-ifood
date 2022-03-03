package ui;

import java.util.ArrayList;

import exceptions.DadosInvalidosException;
import exceptions.EstruturaDeFuncionarioInvalida;
import exceptions.TipoFuncionarioInvalido;
import model.Funcionario;
import repo.FuncionarioRepo;
import repo.RepositorioEmArquivo;
import repo.RepositorioEmMemoria;

public class FolhaPagamento {

	public static void main(String[] args) {

		ArrayList<Funcionario> lista;

		try {
			FuncionarioRepo repo = new RepositorioEmArquivo();
			FuncionarioRepo repo2 = new RepositorioEmMemoria();

			lista = repo.lerTudo();
			lista.addAll(repo2.lerTudo());
			repo.salvarTudo(lista);
			//repo2.salvarTudo(lista);

		} catch (DadosInvalidosException ex) {
			System.err.println("Dados do cadastro de funcionário inválido!");

		} catch (TipoFuncionarioInvalido ex) {
			System.err.println("Não tem regra para este tipo de funcionário.");

		} catch (EstruturaDeFuncionarioInvalida ex) {
			System.err.println("Funcionário com estrutura de informação inválida!");
		} catch (Exception ex) {
			System.err.println("Erro desconhecido");
		}
		
		
		
	}

}
