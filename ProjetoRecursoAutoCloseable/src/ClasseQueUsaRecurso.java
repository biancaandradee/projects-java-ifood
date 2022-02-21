import java.util.Scanner;

public class ClasseQueUsaRecurso {

	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);

		int valor;
		
		try (MeuRecurso recurso = new MeuRecurso(); Scanner sc = new Scanner(System.in)){
			do {
				System.out.println("Digite um valor numérico: ");
				valor = sc.nextInt();
				System.out.println("Valor a ser usado no recurso = " + valor);
				recurso.setValor(valor);
			} while (valor != -1);

		} catch (Exception ex) {
			System.out.println("Erro de atribuição = " + ex.getMessage());
		}

		//sc.close();
	}

}
