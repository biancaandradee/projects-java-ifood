
public class Data {
	
	private int dia;
	private Meses mes;
	private int ano;

	public Data(int dia, Meses mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public boolean ehOMesAtual(Meses mes) {
		return this.mes.equals(mes);
	}
	
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;		
	}
}
