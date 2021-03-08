package da.ejer.excepciones;

public class NonPositiveException extends Exception {
	
	public NonPositiveException() {
		super("El valor debe ser un entero positivo");
	}

}
