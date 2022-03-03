package repo;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class RepositorioEmMemoria implements FuncionarioRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

		lista.add(new Chefe(11777, "Bianca Andrade Handan", 10000.0, 1000.0, 500.0));
		lista.add(new Chefe(07177, "Beatriz Andrade", 20000.0, 1000.0, 1000.0));
		lista.add(new Horista(12754, "Danilo", 100, 40.0));
		lista.add(new Empreiteiro(00177, "Benedicto ", 7000.0));
		lista.add(new Comissionado(11777, "Bianca", 5000.0, 30));
		lista.add(new Horista(00345, "Jô", 150, 99.45));
		lista.add(new Empreiteiro(59327, "Neide", 3500.0));

		return lista;
	}

	@Override
	public void salvarTudo(ArrayList<Funcionario> lista) {
		for (Funcionario f : lista) {
			System.out.println("|   |-----------------------------------------------------|   |");
			System.out.printf("| o | Nome: %-30s R$ %10.2f  | o |\n", f.getNome(), f.calcularSalario());
		}		
	}

}
