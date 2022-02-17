
public class BDPostgres implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Connecting Postgres Database");		
		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting Postgres Database");		
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("pgsql> " + comando);		
		
	}

}
