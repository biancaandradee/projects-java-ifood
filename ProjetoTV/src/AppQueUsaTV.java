
public class AppQueUsaTV {

	public static void main(String[] args) {
		
		Televisao t1, t2;
		
		//Como estamos tratando de classes, é necessário declarar e instanciar (new)
		t1 = new Televisao();  //Solitando à MV Java a quantidade de memória necessária para acomodar esta estrutura
		t2 = new Televisao();
		
		t1.marca = "Telefunken";
		t1.tamanho = 20;
		t1.ligado = false;
		t1.canal = 5;
		t1.volume = 0;
		
		t2.marca = "Filipis   ";
		t2.tamanho = 55;
		t2.ligado = true;
		t2.canal = 10;
		t2.volume = 3;
		
//		System.out.println("        \\/      ");
//		System.out.println("+================+");
//		System.out.println("|   "+t1.marca+"   |");
//		System.out.println("|      "+t1.tamanho+"pol"+"     |");
//		System.out.println("+================+");
//		System.out.println("      |     |      ");
		
		t1.ligar();
		t1.aumentarVolume();
		t1.exibirTV();  //Invocamos o método na classe principal
		t1.sintonizarCanal(32);
		t2.exibirTV();
		t1.desligar();
		t1.aumentarVolume();
		
		System.out.println("A TV foi desligada no canal " + t1.obterCanalSintonizado());

	}

}
