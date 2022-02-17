
public class TesteEnum {
	

	public static void main(String[] args) {
		
		
		for (Meses mes : Meses.values()) {
			System.out.println(mes);
		}

		Data d = new Data(17, Meses.Fevereiro, 2022);
		System.out.println(d);
		
		if(Meses.values()[1] == Meses.Fevereiro) {
			System.out.println("Aaaah, o mês de Fevereiro está na posição 1");
		} else {
			System.out.println("Fevereiro está em outra posição.");
		}
		
		for (int i = 0; i < Meses.values().length; i++) {
			System.out.println("Posição = " + i + " - Valor = " + Meses.values()[i]);
		}
		
		for (Meses m : Meses.values()) {
			m.setMesNumerico(m.getMesNumerico()*10);
			System.out.println(m.getMesNumerico() + " - " + m);
		}
		
		for (Cardapio c : Cardapio.values()) {
			System.out.println(c);
		}
		
		
	}

}
