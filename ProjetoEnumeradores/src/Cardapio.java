
public enum Cardapio {

	CocaCola("Coca-cola", 3.50),
	Fanta("Fanta", 2.50),
	Hamburguer("Hamburguer", 5.0),
	XTudo("X-tudo",8.0);
	
	private String nomePrato;
	private double preco;
	
	
	Cardapio(String nomePrato, double preco){
		this.nomePrato = nomePrato;
		this.preco = preco;
	}
	
	public String getNomePrato() {
		return this.nomePrato;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String toString() {
		return String.format("%-10s R$ %.2f", this.nomePrato, this.preco);
	}
}
