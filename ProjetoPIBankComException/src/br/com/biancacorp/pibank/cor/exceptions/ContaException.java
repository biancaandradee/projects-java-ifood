package br.com.biancacorp.pibank.cor.exceptions;

//public class ContaException extends RuntimeException {
	public class ContaException extends Exception {
	
	private double valorInvalido;
	
	public ContaException(String mensagem, double valorInvalido) {
		super(mensagem);
		this.valorInvalido = valorInvalido;
	}

	public double getValorInvalido() {
		return valorInvalido;
	}

	public void setValorInvalido(double valorInvalido) {
		this.valorInvalido = valorInvalido;
	}

}
