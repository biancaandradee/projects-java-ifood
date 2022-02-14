package br.com.biancacorp.lojavirtual.userinterface;

import br.com.biancacorp.javavirtual.core.Cliente;
import br.com.biancacorp.javavirtual.core.Pedido;
import br.com.biancacorp.javavirtual.core.Produto;

public class Loja {

	public static void main(String[] args) {

		Produto lista[];  //Aqui eu só tenho a declaração
		
		lista = new Produto[6];  //Só tenho as referências (as variáveis do tipo produto)
		
		//Preciso istanciar individualmente cada objeto
		lista[0] = new Produto(1, "Computador", 1000.0);
		lista[1] = new Produto(2, "Mouse", 50.0);
		lista[2] = new Produto(3, "Teclado", 100.0);
		lista[3] = new Produto(4, "Gabinete", 300.0);
		lista[4] = new Produto(5, "Estabilizador", 150.0);
		lista[5] = new Produto(6, "Cadeira Gamer", 900.0);
		
//		//teste número 1
//		for (int cont = 0; cont < lista.length; cont++) {
//			Produto tmp = lista[cont];
//			System.out.println(tmp.exibir());
//		}
//		
//		//Estratégia do "foreach" -> percorrer a lista INTEIRA
//		//Para cada tmp (do tipo Produto) contido na lista, faça..
//		for (Produto tmp : lista) {
//			System.out.println(tmp.exibir());
//		}
//		
//		System.out.println("----------------- Bota fora da loja --------------");
//
//		//o gerente ficou loucoo
//		for (Produto tmp : lista) {
//			tmp.setPreco(tmp.getPreco() * 0.5);
//			System.out.println(tmp.exibir());
//		}
		
		Cliente clientes[] = new Cliente[5];
		clientes[0] = new Cliente(123, "Isidro", "isidro@isidro.com");
		clientes[1] = new Cliente(234, "Delazir", "dela@dela.com");
		clientes[2] = new Cliente(345, "Liderce", "nega@nega.com");
		clientes[3] = new Cliente(456, "Ivaneria", "neria@neria.com");
		clientes[4] = new Cliente(789, "Lindolfo", "dorfo@dorfo.com");
		
		Pedido p1 = new Pedido();
		p1.setData("11/02/2022");
		p1.setCliente(clientes[0]);
		p1.setProduto(lista[0]);
		System.out.println(p1.exibir());
		
	}

}
