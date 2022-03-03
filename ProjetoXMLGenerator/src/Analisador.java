import java.lang.reflect.Field;

import br.com.xmlgenerator.objects.Produto;

public class Analisador {

	public static void main(String[] args) {
		
		Object obj;
//		Produto p = new Produto(1234, "Mouse", 50.00, "mouse.jpg");
//		p.setId(1234);
//		p.setDescricao("Mouse");
//		p.setPreco(50.00);
//		p.setLinkFoto("mouse.jpg");
		
		//Vou trabalhar somente com a referência O e não mais P
		obj = p;
		
		//Consigo saber para qual tipo de objeto a minha referência aponta?
		System.out.println("A referência O aponta para um objeto do tipo: " + obj.getClass().getSimpleName());
		System.out.println("Antes do reflection..");
		System.out.println(p);
		
		
		try {
			//Recuperei todos os atributos do objeto apontado pela referência obj
			Field[] atributos = obj.getClass().getDeclaredFields();
			
			for (Field f : atributos) {
				f.setAccessible(true);
				
				//System.out.println("Atributo: " + f.getName() + " - Valor: " + f.get(obj));
				System.out.println("<" + f.getName() + ">" + f.get(obj) + "</" + f.getName() + ">");
			}
			
			Field f = obj.getClass().getDeclaredField("descricao");
			System.out.println("Vou pegar o que está armazenado neste atribuo no objeto OBJ");
			
			f.setAccessible(true);
			System.out.println(f.get(obj));
			
			f.set(obj, "Mouse gamer");
			f.setAccessible(false);
			System.out.println(p);
			
		} catch (Exception ex) {
			System.err.println("Algo errado " + ex);
			ex.printStackTrace();
		}
	}
}
