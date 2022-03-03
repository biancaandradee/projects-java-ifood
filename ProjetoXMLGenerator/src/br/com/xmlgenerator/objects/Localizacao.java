package br.com.xmlgenerator.objects;

public class Localizacao {

	private String unidade;
	private int andar;
	private int corredor;
	private int gondola;
	
	public Localizacao(String unidade, int andar, int corredor, int gondola) {
		super();
		this.unidade = unidade;
		this.andar = andar;
		this.corredor = corredor;
		this.gondola = gondola;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getCorredor() {
		return corredor;
	}

	public void setCorredor(int corredor) {
		this.corredor = corredor;
	}

	public int getGondola() {
		return gondola;
	}

	public void setGondola(int gondola) {
		this.gondola = gondola;
	}

	@Override
	public String toString() {
		return "Localizacao [unidade=" + unidade + ", andar=" + andar + ", corredor=" + corredor + ", gondola="
				+ gondola + "]";
	}
	
	
}
