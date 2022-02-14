//Esta classe vai ter funões para fazer continhas

public class Utilitarios {
	
	public static final double PI = 3.14;
	
	public static double soma(double a, double b) {  //STATIC - desvinculo sua instanciação de uma classe
		return a + b;
	}
	
	public static double subt(double a, double b) {  
		return a - b;
	}
	
	public static double pot(double b, double e) { 
		double potencia = 1;
		for (int cont = 0; cont < e; cont++) {
			potencia = potencia * b;
		}
		return potencia;
	}

}
