package br.com.biancacorp.folhapagamento.root;

/**
 * Classe Funcionario é a raiz de todas as classes.
 * É uma classe abstrata que nos permite criar toda a hierarquia polimórfica de Funcionarios.
 * 
 * @version 1.0
 * @author bianca.andrade
 *
 */

public abstract class Funcionario {

	protected String nome;
	protected int numeroRegistro;
	
	/**
	 * Construtor padrão da Classe
	 * @param nome
	 * @param numeroRegistro   é o número funcional
	 */
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	/**
	 * Classe da regra de negócio que precisa ser implementada nas subclasses
	 * @return o valor do salário
	 */
	public abstract double calcularSalario();
}
