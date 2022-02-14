import java.util.Scanner;

public class VerificadorPalindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		//Estratégia 1 - tratar a palavra como um vetor de char
		boolean ehPalindromo = true;
		
		char letras[] = palavra.toCharArray();
		
		
		for (int pos = 0; pos < letras.length/2; pos++) {				
				if (letras[pos] != letras[letras.length - 1 - pos]) {
					ehPalindromo = false;
					break;
				}
			}
			
			
		System.out.println((ehPalindromo ? "Palíndromo" : "Não é palíndromo"));
		
		
		//Estratégia 2 - tratar como string mesmo
		
		int tamanho = palavra.length();

		for (int pos = 0; pos < palavra.length(); pos++) {		
			//O método charAt() equivale ao operador []
			if (palavra.charAt(pos) != palavra.charAt(tamanho - 1 - pos)) {
				ehPalindromo = false;
				break;
			}
		}
		
		System.out.println((ehPalindromo ? "Palíndromo" : "Não é palíndromo"));

		
		sc.close();
	}

}
