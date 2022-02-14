import java.util.Scanner;

public class Uri1174 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] vetA =  new double[100];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] <= 10) {
				System.out.println("A[" + i + "] = " + vetA[i]);
			}
		}
		
		
		
		sc.close();
	}

}
