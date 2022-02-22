import java.util.HashMap;

public class Contador {

	public static void main(String[] args) {

		String original = "Bianca é muito legal, mas ela é também muito bonita. Essa é a Bianca";
		original = original.replaceAll("\\,", "").replaceAll("\\?", "").replaceAll("\\!", "").replaceAll("\\.", "");

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		String[] palavras = original.split(" ");

		for (String palavra : palavras) {
			if (mapa.get(palavra) != null) { // Ele já existe no mapa
				mapa.replace(palavra, mapa.get(palavra) + 1);
			} else {
				mapa.put(palavra, 1);
			}

		}
		
		for(HashMap.Entry<String, Integer> valor : mapa.entrySet()) {
			System.out.println(valor.getKey() + " - " + valor.getValue());
		}

		System.out.println(mapa);
		
		
	}

}