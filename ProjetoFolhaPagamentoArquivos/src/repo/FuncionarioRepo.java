package repo;

import java.util.ArrayList;

import model.Funcionario;

public interface FuncionarioRepo {

	public ArrayList<Funcionario> lerTudo();
	public void salvarTudo(ArrayList<Funcionario> lista );
}
