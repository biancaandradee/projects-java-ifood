package br.com.biancacorp.importacao.core;

import com.oracle.enterprise.middleware.IService;
import com.sap.erp.integration.InterfaceSAP;

public class Importador implements InterfaceSAP, IService {
	
	public void realizarImportacao(String conteudo) {
		// Lógica mirabolante
		System.out.println("--> BIANCACORP: Importação Realizada com Sucesso!");
	}

	@Override
	public void proceedInvoice(String content) {
		//Código específico para poder extrair corretamente as infos que a SAP precisa
		realizarImportacao(content);
	}

	@Override
	public void importInvoice(String invoice) {
		//Outro código para extrair as infos relevates ao sistema da Oracle
		realizarImportacao(invoice);
	}
}
