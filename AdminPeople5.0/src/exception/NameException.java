package exception;

public class NameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String PERSON_NO_FOUND = "Nombre no encontrado";
	
	public NameException(){
		super(PERSON_NO_FOUND);
	}
}