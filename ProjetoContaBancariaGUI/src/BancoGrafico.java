import javax.swing.JOptionPane;

public class BancoGrafico {

	public static void main(String[] args) {
		int opcao;
		double valor;
		String texto;
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNomeTitular("Bianca Andrade");
		conta.setCpfTitular("123.456.789-00");
		conta.setTipoConta(2);
		conta.setNumeroConta(1234567);
		conta.setSaldo(1000.00);
		
		do {
			texto = JOptionPane.showInputDialog("IsiBank - Seu banco na NET!\n1 - Depósito\n2 - Saque\n3 - Infos\n0 - Encerra\n");
			opcao = Integer.parseInt(texto);
			switch(opcao) {
			case 1:
				texto = JOptionPane.showInputDialog("Digite o valor do depósito: ");
				valor = Double.parseDouble(texto);
				conta.deposito(valor);
				break;
			case 2:
				texto = JOptionPane.showInputDialog("Digite o valor do saque: ");
				valor = Double.parseDouble(texto);
				if (conta.saque(valor)) {
					JOptionPane.showMessageDialog(null, "Saque efetuado - novo saldo R$ " + conta.getSaldo(), "Sucesso!", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Débito não autorizado.", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, conta.dadosConta());
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);
	}

}
