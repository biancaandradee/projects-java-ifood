import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Library {

	public static void main(String[] args) {

		int opcao;
		int idLivro;
		String texto;

		Books livro1, livro2, livro3, livro4, livro5;

		livro1 = new Books(1, "O Hobbit","J. R. R. Tolkien", 1937, "Ficção Fantástica Inglesa", 10, 7);
		livro2 = new Books(2, "Hello", "Baby", 1937, "Ficção Fantástica Inglesa", 10, 7);

		do {
			texto = JOptionPane.showInputDialog(
					"Bem Vindo(a) a CodeLibrary!\n1 - Empréstimo\n2 - Devolução\n3 - Informações Livro\n0 - Encerra\n");
			opcao = Integer.parseInt(texto);

			switch (opcao) {
			case 1:
				texto = JOptionPane.showInputDialog("Digite o ID do livro: ");
				idLivro = Integer.parseInt(texto);
				JOptionPane.showMessageDialog(null,
						livro1.emprestar(idLivro) ? "Livro indisponível!" : "Empréstimo realizado com sucesso!",
						livro1.emprestar(idLivro) ? "Erro!" : "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				texto = JOptionPane.showInputDialog("Digite o ID do livro: ");
				idLivro = Integer.parseInt(texto);
				livro1.devolver(idLivro);
				JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!");
				break;
			case 3:
				texto = JOptionPane.showInputDialog("Digite o ID do livro: ");
				idLivro = Integer.parseInt(texto);
				JOptionPane.showMessageDialog(null, livro1.infos(idLivro));
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigada pela preferência!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);

	}

}
