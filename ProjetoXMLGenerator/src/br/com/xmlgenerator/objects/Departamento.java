package br.com.xmlgenerator.objects;

public class Departamento {

	private int idDepto;
	private String nome;
	private Localizacao localizacao;

	public Departamento(int idDepto, String nome, Localizacao localizacao) {
		super();
		this.idDepto = idDepto;
		this.nome = nome;
		this.localizacao = localizacao;
	}

	public int getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", nome=" + nome + ", localizacao=" + localizacao + "]";
	}
	
	
}
