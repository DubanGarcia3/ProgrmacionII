package persistance;

import java.util.Properties;

public class PropertiesTitle extends Properties{
	/**
	 *@author Duban 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Obtiene un lenguaje por defecto
	 * @param language
	 */
	public PropertiesTitle(String language){
		switch (language) {
		case "Spanish":
			getProperties("spanish.properties");
			break;
		case "English":
			getProperties("english.properties");
		default:
			getProperties("Espanol");
			break;
		}
	}
	
	/**
	 * carga el lenguaje dado
	 * @param language es el lenguaje que entra 
	 */
	private void getProperties(String language){
		try {
			this.load(getClass().getResourceAsStream(language));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}