//A ideia é a classe Televisão seja apenas para armazenar as informações relativas à uma TV.

public class Televisao {
	//Aqui defino as informações/ atributos (variáveis) que compõem sua definição
	//BOA PRÁTICA -> atribuição SEMPRE uma por linha!!
	
	String marca;
	int tamanho;
	boolean ligado;
	int canal;
	int volume;
	
	//Aqui criamos um método chamdado exibirTV()
	void exibirTV( /* aqui vão as entradas */ ) {
		System.out.println("        \\/      ");
		System.out.println("+================+");
		System.out.println("|   "+marca+"   |");
		System.out.println("|      "+tamanho+"pol"+"     |");
		System.out.println("+================+");
		System.out.println("      |     |      ");
	}
	
	void ligar() {
		ligado = true;
		System.out.println("A TV " + marca + " agora está ligada.");
	}
	
	void desligar() {
		ligado = false;
		System.out.println("A TV " + marca + " foi desligada.");
	}
	
	void aumentarVolume() {
		if (!ligado) {
			System.out.println("Por favor, antes ligue a TV " + marca);
		} else {
			volume++;
			System.out.println("Agora a TV " + marca + " está no volume " + volume);
		}
	}
	
	void avancarCanal(){
		if (!ligado) {
			System.out.println("Para mudar de canal, ligue a TV");
		} else {
			canal++;
			System.out.println("Agora a TV " + marca + " está no canal " + canal);
		}
	}
	
	void sintonizarCanal(int novoCanal) {
		if (!ligado) {
			System.out.println("Para sintonizar, ligue a TV");
		} else {
			if (novoCanal <= 0 || novoCanal > 999) {
				System.out.println("Erro - canal inválido");
			} else {
				canal = novoCanal;
				System.out.println("Agora a TV " + marca + " está no canal " + canal);				
			}
		}
	}
	
	int obterCanalSintonizado() {
		return canal;
	}

}
