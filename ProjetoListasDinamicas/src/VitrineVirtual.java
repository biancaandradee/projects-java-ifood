import java.util.ArrayList;

public class VitrineVirtual {

	public static void main(String[] args) {

		ArrayList<Produto> lista;
		//lista = new ArrayList<Produto>(100);
		lista = new ArrayList<Produto>();    //Defino a capacidade inicial
		
		//Como faço para adicionar novos produtos
		lista.add(new Produto(1, "Produto 01", 100));
		lista.add(new Produto(2, "Produto 02", 200));
		lista.add(new Produto(3, "Produto 03", 300));
		lista.add(new Produto(4, "Produto 04", 400));
		
//		for (int i = 1; i < 100; i++) {
//			lista.add(new Produto(i, "Produto " + i, i*10));
//		}
		
		for (Produto p : lista) {
			System.out.println(p);
		}
		
		System.out.println(lista.get(2));       //Equivale a lista[2]
		System.out.println(lista.toArray()[2]);
		
		System.out.println("Lista antes da remoção");
		System.out.println(lista);
		lista.remove(2);
		System.out.println("Lista depois da remoção");
		System.out.println(lista);
		lista.add(0, new Produto(0, "Produto Novo", 0));
		System.out.println(lista);

	}

}
