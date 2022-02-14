import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World!");

		int value = sc.nextInt();
		System.out.println("Você digitou: " + value);

		sc.close();
	}

}
