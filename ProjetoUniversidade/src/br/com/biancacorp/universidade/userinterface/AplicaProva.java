package br.com.biancacorp.universidade.userinterface;

import java.util.Scanner;

import br.com.biancacorp.universidade.core.QuestaoComDica;
import br.com.biancacorp.universidade.core.QuestaoMultiplaEscolha;
import br.com.biancacorp.universidade.core.QuestaoSimples;

public class AplicaProva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		QuestaoSimples questoes[] = new QuestaoSimples[5];
		
		questoes[0] = new QuestaoSimples("Java é uma linguagem compilada ou interpretada?", "Compilada");
		questoes[1] = new QuestaoSimples("Java é uma linguagem compilada ou interpretada?", "Compilada");
		questoes[2] = new QuestaoMultiplaEscolha("Quanto é 10 % 3?", "1", "2", "1", "0", "3,33");
		questoes[3] = new QuestaoComDica("Qual o nome anterior de Java?", "Oak", "É uma árvore em Inglês");
		questoes[4] = new QuestaoMultiplaEscolha("Qual a fórmula da água?", "H2O", "NaCl", "H2SO4", "H2O2" ,"H2O");
		
		int pontos = 0;
		String respAluno;
		
		for (QuestaoSimples q : questoes) {
			System.out.println(q.aplicarQuestao());
			System.out.print("R: ");
			respAluno = sc.nextLine();
			if (q.corrigir(respAluno)) {
				System.out.println("Boa!!");
				pontos++;
			} else {
				System.out.println("Errrrroooooooooouuu (imagine Silva, F. dizendo)");
				System.out.println("A resposta certa é " + q.getResposta());
			}
			System.out.println("Você acertou um total de " + pontos + "/" + questoes.length);
		}
		
		sc.close();
		
	}

}
