
public class Main2 {

	public static void main(String[] args) {

		try {
			ClasseCadastro c;
			c = new ClasseCadastro();
			// c.cadastrar("123.456.789-00;
			c.cadastrar("111.222.333-44");

			System.out.println("SUCESSO!!");
		} catch (Exception e) {
			System.out.println("ERRO!");
		}
		

		System.out.println("Fim do programa.");
	}

}
