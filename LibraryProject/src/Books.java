
public class Books {

	private int id; 
	private String titulo;
	private String autor;
	private int anoPubli;
	private String categoria;
	private int numEstante;
	private int numPrateleira;
	private boolean emprestado;
	
	
	public Books(int id, String titulo, String autor, int anoPubli, String categoria, int numEstante,
			int numPrateleira) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.categoria = categoria;
		this.numEstante = numEstante;
		this.numPrateleira = numPrateleira;
		this.emprestado = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAnoPubli() {
		return anoPubli;
	}
	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	public int getNumPrateleira() {
		return numPrateleira;
	}
	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public boolean emprestar(int idLivro) {
		if (emprestado == false) {
			emprestado = true;
			return false;
		} 
			return true;		
	}
	
	public boolean devolver(int idLivro) {
		return emprestado = false;
	}
	
	public String infos(int idLivro) {
		String info = "Livro: " + titulo + "\nAutor: " + autor + " (" + anoPubli + ")"+ "\nCategoria: " + categoria;
		info = info + "\nPosição: Estante - " + numEstante + "/Prateleira - " + numPrateleira;
		info = info + "\nEmprestado: " + ((emprestado) ? "Sim" : "Não");		
		return info;
	}
}
