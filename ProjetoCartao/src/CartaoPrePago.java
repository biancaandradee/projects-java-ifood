
public class CartaoPrePago {

		private String numeroCartao;
		private String nomeTitular;
		private int anoValidade;
		private int mesValidade;
		private double saldo;

		public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
			super();
			this.numeroCartao = numeroCartao;
			this.nomeTitular = nomeTitular;
			this.anoValidade = anoValidade;
			this.mesValidade = mesValidade;
			this.saldo = 0.00;
		}
		
		
		public String getNumeroCartao() {
			return numeroCartao;
		}
		public void setNumeroCartao(String numeroCartao) {
			this.numeroCartao = numeroCartao;
		}
		public String getNomeTitular() {
			return nomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}
		public int getAnoValidade() {
			return anoValidade;
		}
		public void setAnoValidade(int anoValidade) {
			this.anoValidade = anoValidade;
		}
		public int getMesValidade() {
			return mesValidade;
		}
		public void setMesValidade(int mesValidade) {
			this.mesValidade = mesValidade;
		}
		public double getSaldo() {
			return saldo;
		}
		
		
		
		public void adicionarCredito(double valor) {
			this.saldo += valor;
		}
		
		public boolean comprar(double valor) {
			if (valor <= this.saldo) {
				this.saldo -= valor;
				return true;
			}
			return false;
		}
		
		public String dadosCartao() {
			String msg = "Número cartão: " + numeroCartao + "\nTitular: " + nomeTitular + 
					"\nValidade: " + anoValidade + "/" + mesValidade + "\n";
			msg = msg + String.format("Saldo: R$ %.2f", saldo);
			return msg;
		}
		
		
	
}
