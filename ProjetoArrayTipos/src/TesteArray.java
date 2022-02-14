
public class TesteArray {

	public static void main(String[] args) {
		
		int vetor[];  //int[] vetor
		vetor = new int[10];
		
		vetor[0] = 123;
		vetor[1] = 456;
		vetor[2] = 789;
		vetor[3] = 012;
		vetor[4] = 345;
		vetor[5] = 678;
		vetor[6] = 901;
		vetor[7] = 234;
		vetor[8] = 567;
		vetor[9] = 890;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);			
		}
		

	}

}
