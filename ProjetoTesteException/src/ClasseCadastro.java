
public class ClasseCadastro {

	private ClasseBD classebd;
	
	public ClasseCadastro() {
		this.classebd = new ClasseBD();
	}
	
	public void cadastrar(String cpf) {
		
		try {
			classebd.conectar();
			classebd.inserir(cpf);
		} catch(Exception e) {
			System.out.println("DEBUG -> Erro no cadastro " + e.getMessage());
			throw new RuntimeException("Erro ao cadastrar CPF");
		} finally {
			classebd.desconectar();
		}
	}
}
