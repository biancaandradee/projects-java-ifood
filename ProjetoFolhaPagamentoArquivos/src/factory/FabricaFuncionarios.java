package factory;

import exceptions.TipoFuncionarioInvalido;
import exceptions.DadosInvalidosException;
import exceptions.EstruturaDeFuncionarioInvalida;
import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FabricaFuncionarios {

	public static Funcionario createFromCSV(String linha) {
		try {
			String[] dados = linha.split(";");

			switch (dados[0].trim()) {
			case "1":
				return new Chefe(Integer.parseInt(dados[1].trim()), dados[2].trim(),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()),
						Double.parseDouble(dados[5].trim()));
			case "2":
				return new Comissionado(Integer.parseInt(dados[1].trim()), dados[2].trim(),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			case "3":
				return new Horista(Integer.parseInt(dados[1].trim()), dados[2].trim(),
						Integer.parseInt(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			case "4":
				return new Empreiteiro(Integer.parseInt(dados[1].trim()), dados[2].trim(),
						Double.parseDouble(dados[3].trim()));
			default:
				throw new TipoFuncionarioInvalido("Tipo inválido.");
			}

		} catch (NumberFormatException ex) {
			throw new DadosInvalidosException("Erro ao converter informações do funcionário.");

		} catch (ArrayIndexOutOfBoundsException ex) {
			
			throw new EstruturaDeFuncionarioInvalida("Dados incompletos do funcionário.");
		} catch (Exception ex) {
			throw new RuntimeException("Erro desconhecido.");
		}
	}
}