
public class Concessionaria {

	public static void main(String[] args) {

		Veiculo v1;
		v1 = new Carro("Gurgel", "Abc9", 1991, 4 , false);
		
		v1.acelerar();
		v1.frear();
		
		Veiculo v2;
		v2 = new Moto("Honda", "CG", 1987, "Superbike" , 125);
		
		v2.acelerar();
		v2.frear();
	}

}
