package model;

public abstract class Funcionario {

	protected int num;
	protected String nome;

	public Funcionario(int num, String nome) {
		super();
		this.num = num;
		this.nome = nome;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calcularSalario() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Funcionario [num=" + num + ", nome=" + nome + "]";
	}

}
