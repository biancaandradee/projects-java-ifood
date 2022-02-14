package br.com.biancacorp.vendingmachine.core;


public class Maquina {
	
	private double creditos;
	private Refrigerantes lista[];
	
	
	public Maquina() {
		this.creditos = 0.0;
		this.lista = new Refrigerantes[5];
		this.lista[0] = new Refrigerantes(1, "Coca-Cola", 7.0, 10);
		this.lista[1] = new Refrigerantes(2, "Guaraná Antartica", 6.0, 8);
		this.lista[2] = new Refrigerantes(3, "Fanta Laranja", 6.0, 5);
		this.lista[3] = new Refrigerantes(4, "Fanta Uva", 6.5, 3);
		this.lista[4] = new Refrigerantes(5, "Sprite", 7.0, 3);
	}

	public void adicionarCredito(double valor) {
		this.creditos += valor;
	}
	
	public double solicitarTroco() {
		double troco = this.creditos;
		this.creditos = 0.0;
		return troco;
	}

	//0 - deu certo/ 1- falta crédito/ 2- falta estoque
	public int comprar(int num) {
		//Tem crédito?
		if (this.creditos >= this.lista[num].getPreco()) {
			if (this.lista[num].getQtdeEstoque() > 0 ) {
				this.creditos -= this.lista[num].getPreco();  //Diminuí meu crédito
				int qtd = this.lista[num].getQtdeEstoque() - 1;
				this.lista[num].setQtdeEstoque(qtd);
				return 0;    //Deu certo
			} else {
				return -2;  //Faltou estoque
			}
		} else {
			return -1;    //Faltou crédito
		}
	}
	
	public String exibirDisplay() {
		String msg = "";
		for (Refrigerantes r: lista) {
			msg = msg + r.getNome() + " R$ "+r.getPreco()+"\n";
		}
		return msg;
	}
	
	public double getCredito() {
		return this.creditos;
	}
	
	
	


}
