
public class MeuMapaHash {

	private Produto[] elementos;

	public MeuMapaHash() {
		elementos = new Produto[100];
	}

	public void put(int chave, Produto p) {
		int pos = calculaHash(chave);
		System.out.println("----> Inserindo o produto na posição " + pos);
		elementos[pos] = p;
	}

	public Produto get(int chave) {
		int pos = calculaHash(chave);
		return elementos[pos];
	}

	private int calculaHash(int chave) {
		int pos = (chave + 10) % 100;
		return pos;
	}

	public String toString() {
		String res = "[";
		for (Produto p : elementos) {
			res += p + ",";
		}
		res += "]";
		return res;

	}
}
