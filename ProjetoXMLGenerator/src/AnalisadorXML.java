import br.com.xmlgenerator.XMLFileGenerator;
import br.com.xmlgenerator.XMLGenerator;
import br.com.xmlgenerator.objects.Cliente;
import br.com.xmlgenerator.objects.Departamento;
import br.com.xmlgenerator.objects.Localizacao;
import br.com.xmlgenerator.objects.Produto;

public class AnalisadorXML {
	public static void main(String[] args) {

		Produto p = new Produto(123, "Computador i5 - 16GB - 1TB", 4900.00, "computador.jpg", new Departamento(1, "Informática", new Localizacao("Centro", 1, 23, 10)));
		Cliente c = new Cliente(10012, "Bianca Andrade", "bianca@bianca.com", "(14) 99624-4934", "30/01/1994");

	String xmlP = XMLGenerator.generateXML(p, XMLGenerator.WITH_HEADER);
	String xmlC = XMLGenerator.generateXML(c, XMLGenerator.WITH_HEADER);
//	
//	System.out.println(xmlP);
//	System.out.println(xmlC);

		XMLFileGenerator.generateXMLFile(p);
		XMLFileGenerator.generateXMLFile(c);
	}
}
