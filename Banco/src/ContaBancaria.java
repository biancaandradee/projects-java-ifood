
public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private String cpfTitular;
	private int tipoConta;
	private double saldo;
	
	//Vou precisar de um método para modificar o atributo
	public void setNomeTitular(String novoNome) {
		this.nomeTitular = novoNome;     //Aqui o THIS é obrigatório
	}
	
	//Vou precisar de um método para consultar o valor do atributo
	public String getNomeTitular() {
		return this.nomeTitular;        //Já aqui o THIS é opcional
	}
	
	public void setCpfTitular(String novoCpf) {
		this.cpfTitular = novoCpf;
	}
	
	public String getCpfTitular() {
		return this.cpfTitular;
	}
	
	public void setTipoConta(int novoTipoConta) {
		this.tipoConta = novoTipoConta;
	}
	
	public int getTipoConta() {
		return this.tipoConta;
	}
	
	public void setNumeroConta(int novoNumeroConta) {
		this.numeroConta = novoNumeroConta;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public double getSaldo() {
		return this.saldo;
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
	
	
	void dadosConta() {
		System.out.println("Conta Bancária: " + numeroConta + 
				((tipoConta == 0) ? " - Conta Corrente" : ((tipoConta == 1) ? " - Poupança" : " - Investimentos")));
		System.out.println("Titular: " + nomeTitular + "(CPF: " + cpfTitular + ")\n");
		System.out.printf("R$ %.2f\n", saldo);
	}
	

	
	
}
