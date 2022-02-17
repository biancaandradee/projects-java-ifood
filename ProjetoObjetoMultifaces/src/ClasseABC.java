
public class ClasseABC implements InterfaceA,InterfaceB, InterfaceC {

	@Override
	public void metodoC1() {
		System.out.println("Método C1");
	}

	@Override
	public void metodoC2() {
		System.out.println("Método C2");		
	}

	@Override
	public void metodoB1() {
		System.out.println("Método B1");
	}

	@Override
	public void metodoB2() {
		System.out.println("Método B2");	
	}

	@Override
	public void metodoA1() {
		System.out.println("Método A1");	
	}

	@Override
	public void metodoA2() {
		System.out.println("Método A2");	
	}

}
