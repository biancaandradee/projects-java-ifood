
public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private String cpfTitular;
	private int tipoConta;
	private double saldo;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public String dadosConta() {
		String mensagem = "Conta Bancária: " + numeroConta + 
				((tipoConta == 0) ? " - Conta Corrente" : ((tipoConta == 1) ? " - Poupança" : " - Investimentos"));
		mensagem = mensagem + "\nTitular: " + nomeTitular + "(CPF: " + cpfTitular + ")\n";
		mensagem = mensagem + String.format("Saldo: R$ %.2f", saldo);
		return mensagem;
	}
	
	void deposito(double valor) {
		saldo += valor;
	}
	
	boolean saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	

	
	
}
