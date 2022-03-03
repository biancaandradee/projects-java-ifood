package exceptions;

public class TipoFuncionarioInvalido extends RuntimeException {

	public TipoFuncionarioInvalido(String mensagem) {
		super(mensagem);
	}
}
