import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		try {
			a = sc.nextInt();
			b = sc.nextInt();

			c = a / b; // A interrupção do código acontece aqui
			System.out.println("Valor de c = " + c);

		} catch (ArithmeticException e) {
			System.out.println("Não sou capaz de fazer uma Divisão por ZERO!");
			System.out.println(e.getCause());

			for (StackTraceElement elem : e.getStackTrace()) {
				System.out.println("DEBUG: " + elem);
			}
		} catch (InputMismatchException e) {
			System.out.println("Ei usuário, por favor, digite números inteiros.");
		} catch (Exception e) {
			e.printStackTrace(); // Mostra todo o encademamento das exceções

			// Vou pegar o nome da instância que foi lançada na exceção E
			System.out.println("Exceção lançada: " + e.getClass().getName());
			System.out.println("Deu ruim!");
			System.out.println("Mensagem da exceão: " + e.getMessage());
		} finally { // Bloco opcional, que nos permite colocar uma tratativa, que mesmo se deu certo
					// ou errado, ele vai ser rodado
			System.out.println("------> Fecho o teclado.");
			sc.close();
		}

	}

}
