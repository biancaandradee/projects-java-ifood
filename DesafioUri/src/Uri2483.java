import java.util.Scanner;

public class Uri2483 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		String letraA = "a";
		
		for (int j = 1; j < i; j++) {
			letraA += "a";
		}
		
		
		System.out.println("Feliz nat" + letraA + "l!");
		
		sc.close();
	}

}
