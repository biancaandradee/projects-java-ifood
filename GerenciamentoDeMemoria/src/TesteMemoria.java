
public class TesteMemoria {

	public static void main(String[] args) {

Produto p1, p2;
		
		p1 = new Produto(1, "Computador", 1500);
		p2 = new Produto(1, "Computador", 1500);
	
		//p2 = p1;   // aqui não há cópia, há apenas 2 apontamentos diferentes
				   // para o mesmo bloco de memória
		System.out.println("Antes da mudança...");
		System.out.println("P1 = "+p1.exibirInfo());
		System.out.println("P2 = "+p2.exibirInfo());
		
		
		// aqui, como estamos mudando um conteúdo através de p2 (e p2 aponta para o 
		// mesmo bloco de memória de P1), a alteração feita por p2 afeta p1
		System.out.println();
		System.out.println("P1 = "+p1.exibirInfo());
		System.out.println("P2 = "+p2.exibirInfo());
		
		System.out.println(p1.equals(p2));
		
//		String s1, s2;
//		s1 = new String("Oi, quer tc?");  // boxing
//		s2 = new String("Oi, quer tc?");
		
//		s1 = "Oi, quer tc?";
//		s2 = "Oi, quer tc?";
//		
//		if (s1 == s2) {
//			System.out.println("S1 e S2 apontam para o mesmo endereço");
//		}
//		else {
//			System.out.println("S1 e S2 apontam para endereços distinos");
//		}
//		
//		// e se eu quiser comparar conteúdo??????
//		if (s1.equals(s2)) { // o método EQUALS agora compara conteúdos
//			System.out.println("S1 e S2 tem o mesmo conteudo");
//		}
//		else {
//			System.out.println("S1 e S2 tem conteúdos distintos");
//		}
//		
//		
//		s1 = "Não quero tc!!!";
//		System.out.println(s1);
//		System.out.println(s2);
		
		

	}

}
