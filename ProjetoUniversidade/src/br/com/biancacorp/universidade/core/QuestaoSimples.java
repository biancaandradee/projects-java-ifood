package br.com.biancacorp.universidade.core;

public class QuestaoSimples {

	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	/**
	 * Método que retorna o enunciado e exibe-o ao usuário (pode ser terminal ou interface gráfica)
	 * @return
	 */
	public String aplicarQuestao() {
		return "Q: " + this.enunciado;
	}
	
	/**
	 * Método que recebe a resposta e compara-a com o atributo, retornando verdadeiro ou falso
	 * @return
	 */
	public boolean corrigir(String resposta) {
		return this.resposta.equalsIgnoreCase(resposta);
	}
}
