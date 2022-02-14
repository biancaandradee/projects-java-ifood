
public class TesteGC {

	public static void main(String[] args) {

		Produto p = null;
		
		for (int cont = 1; cont <= 100; cont++) {
			p = new Produto(cont, "Produto " + cont, cont*100);
			
		}
		
		System.gc();  //Forcei a chamada do Garbage Collector
		
		System.out.println("O último produto cadastrado foi...");
		System.out.println(p.getId() + "|" + p.getDescricao() + "|" + p.getPreco());
	}

}
