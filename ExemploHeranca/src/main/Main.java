package main;

import core.Estudante;
import core.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Isidro", "isidro@isidro.com", "987654321");

//		p.setNome("Isidro");
//		p.setEmail("isidro@isidro.com");
//		p.setTelefone("987654321");

		p.mostrar();

		Estudante e = new Estudante("Joaozinho", "joao@zinho.com", "912345678", 1234);
//		e.setNome("Joaozinho");
//		e.setEmail("joao@zinho.com");
//		e.setTelefone("912345678");
//		e.setNumeroMatricula(1234);

		e.mostrar();

	}

}
