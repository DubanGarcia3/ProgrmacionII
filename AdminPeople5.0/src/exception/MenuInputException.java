package exception;

import java.util.InputMismatchException;

public class MenuInputException extends InputMismatchException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String NAME_EXCEPTION = "Opcion erronea, digite el numero de la opcion del menu que desea";
	
	public MenuInputException(){
		super(NAME_EXCEPTION);
	}
}
