package br.com.biancacorp.cartao.userinterface;
import br.com.biancacorp.cartao.core.CartaoCashBack;
import br.com.biancacorp.cartao.core.CartaoPrePago;

public class Cartao {
	public static void main(String[] args) {


		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[4];
		cartoes[0]= new CartaoPrePago("0123 4567 8901 2345", "Bianca Andrade", 2027, 01, 1000.0);
		cartoes[1]= new CartaoCashBack("0123 4567 8901 2345", "Bianca Andrade", 2027, 01, 1000.0, 0);
		cartoes[2]= new CartaoCashBack("0123 4567 8901 2345", "Bianca Andrade", 2027, 01, 1000.0, 1);
		cartoes[3]= new CartaoCashBack("0123 4567 8901 2345", "Bianca Andrade", 2027, 01, 1000.0, 2);

		for (CartaoPrePago cartao : cartoes) {
			System.out.println(cartao);
			cartao.comprar(100);
		}

		System.out.println("\n---> Compra de R$ 100,00 em cada cartão\n");
		
		for (CartaoPrePago cartao : cartoes) {
			System.out.println(cartao);
		}

	
	}

}
