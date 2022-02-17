package br.com.biancacorp.folhapagamento.userinterface;

import br.com.biancacorp.folhapagamento.core.Chefe;
import br.com.biancacorp.folhapagamento.core.Comissionado;
import br.com.biancacorp.folhapagamento.core.Empreiteiro;
import br.com.biancacorp.folhapagamento.core.Horista;
import br.com.biancacorp.folhapagamento.root.Funcionario;

public class FolhaPagamento {

	public static void main(String[] args) {

		Funcionario funcionarios[] = new Funcionario[7];
		
		funcionarios[0] = new Chefe("Bianca Andrade Handan", 11777, 10000.0, 1000.0, 500.0);
		funcionarios[1] = new Chefe("Beatriz Andrade", 07177, 20000.0, 1000.0, 1000.0);
		funcionarios[2] = new Horista("Danilo", 12754, 40.0, 100);
		funcionarios[3] = new Empreiteiro("Benedicto ", 00177, 7000.0);
		funcionarios[4] = new Comissionado("Bianca", 11777, 5000.0, 30);
		funcionarios[5] = new Horista("Jô", 00345, 99.45, 150);
		funcionarios[6] = new Empreiteiro("Neide", 59327, 3500.0);
		
		for (Funcionario f : funcionarios) {
//			System.out.println(f);
//			System.out.printf("Salário: R$ %.2f\n", f.calcularSalario());
			System.out.println("| o |-----------------------------------------------------| o |");
			System.out.printf ("|   | Nome: %-30s R$ %10.2f  |   |\n", f.getNome(), f.calcularSalario());
		}

	}

}
