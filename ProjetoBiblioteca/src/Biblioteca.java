
public class Biblioteca {

	public static void main(String[] args) {
		
		Livro l1, l2, l3, l4;
		
		l1 = new Livro("Java for Beginners","Professor Isidro", "Terror", 2021, 1, 2);
		l2 = new Livro("Oi", "Tudo bem", "Ok", 2017, 3, 7);
		l3 = new Livro("Desenvolvimento", "Prof", "Autoajuda", 2010, 5, 5);
		l4 = new Livro("Blá Blá", "Teacher", "Ficção", 2020, 3, 4);
		
//		l1.setTitulo("Java for Beginners");
//		l1.setAutor("Professor Isidro");
//		l1.setAnoPubli(2021);
//		l1.setCategoria("Terror");
//		l1.setPosEstante(1);
//		l1.setPosPrateleira(2);
//		l1.emprestar();
//		
		System.out.println(l1.exibirInfo());
		System.out.println(l2.exibirInfo());
		System.out.println(l3.exibirInfo());
		System.out.println(l4.exibirInfo());
		
		l1.emprestar();
	}

}
