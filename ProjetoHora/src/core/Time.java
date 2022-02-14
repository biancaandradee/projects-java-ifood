package core;

public class Time {

	private int hora;
	private int minuto;
	private int segundo;

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	
	public Time(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Time(int hora, int minuto) {
		this(hora, minuto, 0);
	}
	
	public Time(int hora) {
		this(hora, 0, 0);
	}
	
	public Time() {
		this(0, 0, 0);
	}

	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	//Sobrecarga (escopo mesma classe) -> posso fazer um método chamar outro, com assinaturas diferentes
	//A quantidade de parâmetros e o tipo deles é que vão identificar o método esperado
	public void setTime(int h, int m) {
		this.hora = h;  //Pode ser substituído por setTime(hora, minuto, 0)
		this.minuto = m;
		this.segundo = 0;
	}
	
	public void setTime(int h) {
		this.setTime(h, 0, 0);
	}

	public String exibirHoraUniversal() {  //Não é necessário o THIS
		return formatNumero(this.hora) + ":" + formatNumero(this.minuto) + ":" + formatNumero(this.segundo);
	}

	public String exibirHoraPadrao() {
		String horaPadrao;
		String ind;
		if (hora == 0) {
			horaPadrao = "12:";
			ind = " AM";
		} else if (hora == 12){
			horaPadrao = "12:";
			ind = " PM";
		} else if (hora > 0 && hora < 12) {
			horaPadrao = hora + ":";
			ind = " AM";
		} else {
			horaPadrao = (hora - 12) + ":";
			ind = " PM";
		}
		horaPadrao = horaPadrao + formatNumero(this.minuto) + ":" + formatNumero(this.segundo) + ind;
		return horaPadrao;
	}
	
	//Aqui o método é declarado como PRIVATE, pois não faz sentido outras classes o utilizarem
	//Ele só serve para formatar o número da hora/min/seg colocando o 0 na frente
	private String formatNumero(int numero) {
		return (numero < 10) ? "0" + numero : String.valueOf(numero);
	}

}
