
public class Produto {

	private int id;
	private String descricao;
	private double preco;
	
	
	public Produto(int id, String descricao, double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
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
	
	public String exibirInfo() {
		return id+"-"+descricao+" R$ "+preco;
	}
	
	public boolean equals(Object o) {
				
		if (o instanceof Produto) {   // se o objeto que recebi por parâmetro for uma instancia de Produto
			Produto p = (Produto)o;  // converti o que eu recebo como Object para produto
			return this.id == p.getId() && 
				   this.descricao.equals(p.getDescricao()) &&
				   this.preco == p.getPreco();
		}
		return false;
	} 
}
