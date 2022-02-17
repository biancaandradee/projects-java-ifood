
public class Moto extends Veiculo {
	private String tipo;
	private int cilindrada;
	
	
	public Moto(String marca, String modelo, int ano, String tipo, int cilindrada) {
		super(marca, modelo, ano);
		this.tipo = tipo;
		this.cilindrada = cilindrada;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Moto " + super.modelo + "Acelera na mão RAN DAN DAN DAN DAN PAH PAH!");
	}
	
	@Override
	public void frear() {
		System.out.println("Moto "+ super.modelo + " Freia no pé IIIJipdf0q348rt3olr");

	}

	

}
