package dam.ejer.model;

public class Cociente {
	
		//Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
		public double dividirReales (double num1, double num2) {
			double resultado = 0;

			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				resultado = num1 / num2;
			}
			
			return resultado;
		}
		
		//Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
		public int dividirEnteros (int num1, int num2) {
			int resultado = 0;

			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				resultado = num1 / num2;
			}
			
			return resultado;
		}
		
		//Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
		public double calcularInverso (double num) {
			double inverso = 0;
			
			if (num == 0) {
				System.out.println("El inverso de 0 no existe.");
			} else {
				inverso = 1 / num;
			}
			
			return inverso;
		}
		
		//Ra�z de un n�mero, tendr� un par�metro de entra y uno de salida que ser� la soluci�n
		public double calcularRaizCuadrada (double num) {
			double raizCuadrada = 0;
			
			if (num < 0) {
				System.out.println("La ra�z de un n�mero negativo no existe.");
			} else {
				raizCuadrada = Math.sqrt(num);
			}
			
			return raizCuadrada;
		}
}
