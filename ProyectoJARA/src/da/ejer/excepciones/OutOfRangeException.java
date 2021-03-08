package da.ejer.excepciones;

public class OutOfRangeException extends Exception {
	
	public OutOfRangeException() {
		super("\n	--- La opción introducida no es valida\n"
				+ "	Esta fuera del rango de opciones ---");
	}
}
