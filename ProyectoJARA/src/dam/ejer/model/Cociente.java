package dam.ejer.model;

public class Cociente {
	
		//División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
		public double dividirReales (double num1, double num2) {
			double resultado = 0;

			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				resultado = num1 / num2;
			}
			
			return resultado;
		}
		
		//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
		public int dividirEnteros (int num1, int num2) {
			int resultado = 0;

			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				resultado = num1 / num2;
			}
			
			return resultado;
		}
		
		//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
		public double calcularInverso (double num) {
			double inverso = 0;
			
			if (num == 0) {
				System.out.println("El inverso de 0 no existe.");
			} else {
				inverso = 1 / num;
			}
			
			return inverso;
		}
		
		//Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución
		public double calcularRaizCuadrada (double num) {
			double raizCuadrada = 0;
			
			if (num < 0) {
				System.out.println("La raíz de un número negativo no existe.");
			} else {
				raizCuadrada = Math.sqrt(num);
			}
			
			return raizCuadrada;
		}
}
