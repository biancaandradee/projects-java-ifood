package br.com.xmlgenerator.objects;

public class Produto {

	private int id;
	private String descricao;
	private double preco;
	private String linkFoto;
	private Departamento departamento;
	

	public Produto(int id, String descricao, double preco, String linkFoto, Departamento departamento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.linkFoto = linkFoto;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", linkFoto=" + linkFoto
				+ ", departamento=" + departamento + "]";
	}

	
	
	
}
