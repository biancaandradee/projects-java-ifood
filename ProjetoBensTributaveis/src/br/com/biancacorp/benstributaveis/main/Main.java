package br.com.biancacorp.benstributaveis.main;

import br.com.biancacorp.benstributaveis.core.imoveis.Comercial;
import br.com.biancacorp.benstributaveis.core.imoveis.Imovel;
import br.com.biancacorp.benstributaveis.core.imoveis.Residencial;
import br.com.biancacorp.benstributaveis.core.imoveis.Rural;
import br.com.biancacorp.benstributaveis.core.veiculos.Carro;
import br.com.biancacorp.benstributaveis.core.veiculos.Moto;
import br.com.biancacorp.benstributaveis.core.veiculos.Veiculo;
import br.com.biancacorp.benstributaveis.taxes.BemTributavel;

public class Main {

	public static void main(String[] args) {

		Veiculo veiculos[] = new Veiculo[3];

		veiculos[0] = new Carro("Hyundai", "Creta", 2020, 97000.0, 4, 1.6);
		veiculos[1] = new Carro("Fiat", "Uno", 1997, 9700.0, 4, 1.0);
		veiculos[2] = new Moto("Kawasaki", "Ninja 300", 2021, 37000.0, 297, "Esportiva");

		Imovel imoveis[] = new Imovel[3];

		imoveis[0] = new Residencial("Rua Amadeu Sangiovani, 436 - Bauru/SP", 350000.0, 300);
		imoveis[1] = new Comercial("Av. Getúlio Vargas, 777 - Bauru/SP", 700000.0, "Indústria");
		imoveis[2] = new Rural("Estrada das Bananas, s/n - Bauru/SP", 1000000.0, "Fazenda");
		
		

//		for (int i = 0; i < veiculos.length; i++) {
//			if (veiculos[i] instanceof BemTributavel) {
//				System.out.println(veiculos[i] + " - esse veículo é um bem tributável.");
//			} else {
//				System.out.println(veiculos[i] + " - esse veículo não é um bem tributável.");
//			}
//		}
//
//		for (int i = 0; i < imoveis.length; i++) {
//			if (imoveis[i] instanceof BemTributavel) {
//				System.out.println(imoveis[i] + " - esse imóvel é um bem tributável.");
//			} else {
//				System.out.println(imoveis[i] + " - esse imóvel não é um bem tributável.");
//			}
//		}
		
		//------------------------------------------------------------------------------------//

//		for (Veiculo v : veiculos) {
//			if (v instanceof BemTributavel) {
//				System.out.println("O veículo "+ v.getMarca() + " é um bem tributável.");
//				
//			} else {
//				System.out.println("O veículo "+ v.getMarca() + " não é um bem tributável.");
//			}
//		}
//		
//		for (Imovel i : imoveis) {
//			if (i instanceof BemTributavel) {
//				System.out.println("O imóvel localizado em "+ i.getEndereco() + " é um bem tributável.");
//			} else {
//				System.out.println("O imóvel localizado em "+ i.getEndereco() + " não é um bem tributável.");
//			}
//		}
		BemTributavel bens[] = new BemTributavel[5];
		bens[0] = (BemTributavel)veiculos[0];
		bens[1] = (BemTributavel)veiculos[1];
		bens[2] = (BemTributavel)veiculos[2];
		bens[3] = (Residencial)imoveis[0];
		bens[4] = (Comercial)imoveis[1];
		
		for (BemTributavel bem : bens) {
			System.out.println(bem + " Valor imposto: R$ " + bem.calcularImposto());
		}
		
	}
}
