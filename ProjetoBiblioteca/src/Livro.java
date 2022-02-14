
public class Livro {
	private String titulo;
	private String autor;
	private String categoria;
	private int anoPubli;
	private int posEstante;
	private int posPrateleira;
	private boolean disponivel;
	
	//Aqui temos o método CONSTRUTOR da classe -> só é executado 1x no ciclo de vida do projeto -> quando é instaciado com NEW
	public Livro(String titulo,String autor, String categoria, int anoPubli, int posEstante, int posPrateleira) {
		this.titulo = titulo;    //esse THIS é opcional
		this.autor = autor;
		this.categoria = categoria;
		this.anoPubli = anoPubli;
		this.posEstante = posEstante;
		this.posPrateleira = posPrateleira;
		this.disponivel = true;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAnoPubli() {
		return anoPubli;
	}
	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
	public int getPosEstante() {
		return posEstante;
	}
	public void setPosEstante(int posEstante) {
		this.posEstante = posEstante;
	}
	public int getPosPrateleira() {
		return posPrateleira;
	}
	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void emprestar() {
		disponivel = false;
	}
	
	public void devolver() {
		disponivel = true;
	}
	
	public String exibirInfo() {
		String mensagem;
		mensagem = "Livro: " + titulo + "/ " + autor + " (" + anoPubli + ")"+ "\nCategoria: " + categoria + "\nPos: " + posEstante + "-" + posPrateleira + "\n" + ((disponivel) ? "DISPONÍVEL" : "EMPRESTADO");		
		return mensagem;
	}
	
	

}
