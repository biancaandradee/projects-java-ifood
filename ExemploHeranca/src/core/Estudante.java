package core;

//A definição da classe Estudante AMPLIA a definição da classe Pessoa
//A estrutura ESTUDANTE é uma AMPLIAÇÃO da estrutura PESSOA
//Ou seja, só pelo cabeçalho, ESTUDANTE tem tudo o que tem em pessoa, além da sua peculiaridade

public class Estudante extends Pessoa{

	int numeroMatricula;

	public Estudante(String nome, String email, String telefone, int numMatricula) {
		super(nome, email, telefone);
		this.numeroMatricula = numMatricula;
	}

	public void mostrar() {
		System.out.println(
				"Estudante: " + super.nome + "/" + super.email + "/" + super.telefone + "/" + this.numeroMatricula);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}
