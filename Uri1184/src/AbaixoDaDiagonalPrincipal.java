import java.util.Scanner;

public class AbaixoDaDiagonalPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[][] matriz = new double[12][12];
		double res = 0;
		char operacao;
		int cont = 0;
		
		
		operacao = sc.nextLine().charAt(0);
				
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 1; i < 12; i++) {
			for (int j = 0; j < 1; j++) {
				res = res + matriz[i][j];
				cont++;
			}
		}
		
		if (operacao == 'S') {
			System.out.printf("%.1f\n", res);
		} else {
			System.out.printf("%.1f\n", res/cont);
		}
		
		
		sc.close();
		
	}

}
