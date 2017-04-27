package exception;

public class DateFormatException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String DATE_EXCEPTION = "Datos de fecha invalidos o incorrectos";

	public DateFormatException() {
		super(DATE_EXCEPTION);
	}
}
