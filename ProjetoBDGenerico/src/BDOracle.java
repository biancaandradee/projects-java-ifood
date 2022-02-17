
public class BDOracle implements InterfaceBD {

	@Override
	public void conectar() {
System.out.println("Connecting on ORABD Service");		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting ORABD Service");		
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("oracle> " + comando);		
		
	}

}
