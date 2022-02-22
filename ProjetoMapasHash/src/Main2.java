import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {

	public static void main(String[] args) {

//		MeuMapaHash mapa = new MeuMapaHash();
//
//		mapa.put(1, new Produto(1, "Produto01", 1));
//		mapa.put(15, new Produto(15, "Produto15", 15));
//		mapa.put(27, new Produto(27, "Produto27", 27));
//		mapa.put(58, new Produto(58, "Produto58", 58));

		// --------------------------------------------------------------------------//
		// Ideia do benchmark
		// Realizar várias buscas em uma lista que eu vou incrementando o tamanho
		// (pra ver se é mesmo proporcional)

		ArrayList<Produto> lista = new ArrayList<Produto>();

		int chaveDeBusca1 = -1;

		for (int i = 1; i < 1000; i++) {
			lista.add(new Produto(i, "Produto" + i, i));
		}

		// Agora, vou fazer várias buscas
		long ini1, fim1;
		ini1 = System.currentTimeMillis();

		for (int cont = 1; cont <= 1000; cont++) {
			// Como é o algoritmo de 1 busca
			for (Produto p1 : lista) {
				if (p1.getId() == chaveDeBusca1) {
					System.out.println(p1);
					break;
				}
			}
		}
		
		fim1 = System.currentTimeMillis();
		
		System.out.println("Tempo de busca = " + (fim1 - ini1) + "ms");


		// -------------------- AGORA COM HASHMAP --------------------- //

		HashMap<Integer, Produto> mapa2 = new HashMap<Integer, Produto>();

		for (int i = 1; i < 1000; i++) {
			mapa2.put(i, new Produto(i, "Produto" + i, i));
		}

		long ini2, fim2;
		int chaveDeBusca2 = -1;

		// As mesmas 1000 buscas em cima do conjunto
		ini2 = System.currentTimeMillis();
		for (int cont2 = 1; cont2 < 1000; cont2++) {
			Produto p2 = mapa2.get(chaveDeBusca2);
			if (p2 != null) {
				 System.out.println(p2);
			}
		}
		
		fim2 = System.currentTimeMillis();
		
		System.out.println("Tempo de busca = " + (fim2 - ini2) + "ms");
	}

}
