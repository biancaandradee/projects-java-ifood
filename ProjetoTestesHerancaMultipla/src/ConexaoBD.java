
public class ConexaoBD implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectado");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectado");
	}

}
