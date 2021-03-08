package dam.ejer.model;

public class Suma {
	/*
	 * Clase 1: Suma. Esta clase implementará todos los métodos que están
	 * relacionados con la sumas de la calculadora. Esta clase tendrá los siguientes
	 * métodos: 1. Suma de dos números reales, tendrá 2 parámetros de entrada y uno
	 * de salida que será la solución. 2. Suma de dos números enteros, tendrá 2
	 * parámetros de entrada y uno de salida que será la solución. 3. Suma de tres
	 * números reales, tendrá 3 parámetros de entrada y uno de salida que será la
	 * solución. 4. Suma con valor acumulado, tendrá un parámetro de entrada y la
	 * clase deberá de guardar el valor acumulado.
	 */

	private double acumulado;
		/// contructor por defecto	
	public Suma() {
		super();
	}
	
	public double getAcumulado() {
		return acumulado;
	}

	public double suma2NumerosReales(double num1, double num2) {
		double suma;
		suma = num1 + num2;
		return suma;
	}

	public int suma2NumerosEnteros(int num1, int num2) {
		int suma;
		suma = num1 + num2;
		return suma;
	}

	public double suma3NumerosReales(double num1, double num2, double num3) {
		double suma;
		suma = num1 + num2 + num3;
		return suma;
	}

	public void sumaValorAcumulado(int num) {
		for (int i = 1; i <= num; i++) {
			acumulado = acumulado + i;
		}
	}
}
