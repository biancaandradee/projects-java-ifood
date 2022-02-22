import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Produtos> lista = new ArrayList<Produtos>();
		
		lista.add(new Produtos(1, "Cadeira Gamer", 1350.50, 4));
		lista.add(new Produtos(2, "Teclado", 200.99, 5));
		lista.add(new Produtos(3, "Mouse", 89.90, 10));
		lista.add(new Produtos(4, "Mesa", 470.00, 4));
		lista.add(new Produtos(5, "Notebook 15'", 5970.00, 3));
		lista.add(new Produtos(6, "Apoio para pés", 75.00, 5));
		lista.add(new Produtos(7, "Monitor", 1470.00, 7));
		
		Produtos maisCaro, maisBarato;
		double valorEstoqueTotal = 0;
		int qtdItens = 0;
		
		//Apenas para ter um elemento de referência
		maisCaro = maisBarato = lista.get(0);
		
		for (Produtos p : lista) {
			if (p.getPreco() > maisCaro.getPreco()) {
				maisCaro = p;
			}
			if (p.getPreco() < maisBarato.getPreco()) {
				maisBarato = p;
			}
			
			valorEstoqueTotal += p.getQtdEstoque() * p.getPreco();
			qtdItens += p.getQtdEstoque();
			System.out.print(p);			
;			System.out.printf(" - Valor total do estoque: R$ %.2f\n", valorEstoqueTotal);			
		}
		
		System.out.println("Produto mais caro: " + maisCaro);			
		System.out.println("Produto mais barato: " + maisBarato);			
		System.out.println("Estoque avaliado em: R$  " + valorEstoqueTotal);			
		System.out.println("Total de Itens em estoque:  "+ qtdItens);
		
		
	}

}
