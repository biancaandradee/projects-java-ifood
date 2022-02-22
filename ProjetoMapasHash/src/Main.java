import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Produto> mapa;
		
		mapa = new HashMap<Integer, Produto>();
		
		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
		
		mapa.put(1, new Produto(1, "Produto01", 100));
	}

}
