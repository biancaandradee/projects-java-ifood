package br.com.biancacorp.cartao.core;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getTipoTexto() {
		return (tipo == 0) ? "GOLD" : (tipo == 1) ? "SILVER" : "BRONZE";
	}
	@Override
	public boolean comprar(double valor) {
		if (valor <= super.saldo) {				super.saldo -= valor;
				super.saldo += (tipo == 0) ? valor * 0.08 : (tipo == 1) ? valor * 0.05 : valor * 0.02;
				return true;
			}

		return false;
	}


	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade 
				+ ", saldo=" + String.format("%.2f", saldo) + ", tipo=" + tipo + getTipoTexto() + "]";
	}

	
}
