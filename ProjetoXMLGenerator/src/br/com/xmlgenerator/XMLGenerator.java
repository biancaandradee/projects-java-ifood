package br.com.xmlgenerator;

import java.lang.reflect.Field;

public class XMLGenerator {
	
	public static final int WITH_HEADER = 1;
	public static final int WITHOUT_HEADER = 0;
	

	public static String generateXML(Object obj, int mode) {
		StringBuilder str = new StringBuilder();

		if (mode == WITH_HEADER) {
			str.append("<xml>");			
		}

		try {
			// Vamos tratar apenas com a visão dos atributos
			for (Field f : obj.getClass().getDeclaredFields()) {
				if (f.getType().getName().equals("int")
					|| f.getType().getName().equals("float")
					|| f.getType().getName().equals("double")
					|| f.getType().getName().equals("java.lang.String")) {
					
					f.setAccessible(true);
					str.append("<" + f.getName() + "> " + f.get(obj) + " </" + f.getName() + ">");
					f.setAccessible(false);
					
				} else {
					f.setAccessible(true);
					str.append("<" + f.getName() + "> " + 
								generateXML(f.get(obj), WITHOUT_HEADER) + 
								" </" + f.getName() + ">");
					f.setAccessible(false);
				}
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		if (mode == WITH_HEADER) {
			str.append("</xml>");			
		}


		return str.toString();
	}
}
