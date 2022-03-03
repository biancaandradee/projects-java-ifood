
public class Main {

	public static void main(String[] args) {
		MinhaThread t1, t2, t3;

		t1 = new MinhaThread(1, 1000);
		t2 = new MinhaThread(2, 1300);
		t3 = new MinhaThread(3, 1800);

		//O momento em que a thread é disparada
		t1.start();
		t2.start();
		t3.start();
		
		//Aqui aguardamos a conclusão de todas as Threads para então, ir para a última mensagem
				try {			
					t1.join();
					t2.join();
					t3.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		System.out.println("Classe Principal finalizou.");
	}

}
