
public class Main {

	public static void main(String[] args) {
		ClasseABC abc = new ClasseABC();

		abc.metodoA1();
		abc.metodoA2();
		abc.metodoB1();
		abc.metodoB2();
		abc.metodoC1();
		abc.metodoC2();

		InterfaceA ia;
		InterfaceB ib;
		InterfaceC ic;

		ia = abc;
		ib = abc;
		ic = abc;

		ia.metodoA1();
		ia.metodoA2();
		ib.metodoB1();
		ib.metodoB2();
		ic.metodoC1();
		ic.metodoC2();

	}

}
