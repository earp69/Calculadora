package dam.ejer.model;

public class Suma {
	/*
	 * Clase 1: Suma. Esta clase implementar� todos los m�todos que est�n
	 * relacionados con la sumas de la calculadora. Esta clase tendr� los siguientes
	 * m�todos: 1. Suma de dos n�meros reales, tendr� 2 par�metros de entrada y uno
	 * de salida que ser� la soluci�n. 2. Suma de dos n�meros enteros, tendr� 2
	 * par�metros de entrada y uno de salida que ser� la soluci�n. 3. Suma de tres
	 * n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la
	 * soluci�n. 4. Suma con valor acumulado, tendr� un par�metro de entrada y la
	 * clase deber� de guardar el valor acumulado.
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
