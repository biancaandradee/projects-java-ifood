import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int cont;
		int soma;
		
		x = sc.nextInt();
		while (x != 0) {
			soma = 0;
			cont = 0;
			while (cont < 5) {
				if (x % 2 == 0) {
					soma += x;
					cont++;
				}
				x++;
			}
			System.out.println(soma);
			x = sc.nextInt();
		}
				
		
		
		sc.close();	
		
		
	}
}
