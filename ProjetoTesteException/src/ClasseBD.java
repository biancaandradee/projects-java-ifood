public class ClasseBD {

	public void conectar() {
		System.out.println("Conectado ao banco...");
	}

	public void inserir(String cpf) {
		if (cpf.equals("111.222.333-44")) {
			throw new RuntimeException("E-mail já cadastrado.");
		}
		System.out.println("Cadastro realizado!");
	}

	public void desconectar() {
		System.out.println("Desconectando do banco...");
	}
}
