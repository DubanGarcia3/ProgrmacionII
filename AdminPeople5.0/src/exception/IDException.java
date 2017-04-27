package exception;

public class IDException extends Exception{
	
public static final String PERSON_NO_FOUND = "Id de persona no valido o no encontrado.";
	
	public IDException() {
		super(PERSON_NO_FOUND);
	}

}
