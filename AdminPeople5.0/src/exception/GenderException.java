package exception;

public class GenderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String GENDER_NO_FOUND = "Genero no valido o no encontrado";
	
	public GenderException(){
		super(GENDER_NO_FOUND);
	}

}
