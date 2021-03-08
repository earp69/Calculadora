package dam.ejer.main;

import java.util.Scanner;

import da.ejer.excepciones.OutOfRangeException;
import dam.ejer.model.Producto;

public class CalculatorPro {
	static Scanner sc;
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("\n\t\t*** CALCULADORA ***");
		System.out.println("\n*ESTA CALCULADORA REALIZA 4 FUNCIONES "
				+ "DISTINTAS DENTRO DE CADA OPCION*");
		System.out.println("\nIntroduzca tres números a operar");
		
		System.out.print("Número 1: ");
		num1= Double.parseDouble(sc.nextLine());
		System.out.print("Número 2: ");
		num2= Double.parseDouble(sc.nextLine());
		System.out.print("Número 3: ");
		num3= Double.parseDouble(sc.nextLine());
		
		int opcion = -1;
		boolean continuar = true;
		while (continuar) {
			opcion = solicitarOpcion();
			switch (opcion) {
			case 0:
				continuar = false;
				System.out.println("Fin del programa");
				break;
			case 1:
				//suma();
				break;
			case 2:
				//resta();
				break;
			case 3:
				producto();
				break;
			case 4:
				//cociente();
				break;
			}
		}
		
		sc.close();
	}
	
	private static void producto() {
		Producto prod = new Producto(num1, num2, num3);
		System.out.println(prod);
	}


	private static int solicitarOpcion() {
		int opcion = -1; 
		do {
			try {
				System.out.println("\n** Elija una operación **");
				System.out.println("1 - Suma\n" + 
						"2 - Resta\n" +
						"3 - Producto\n" +
						"4 - Cociente\n" +
						"0 - Salir de la aplicación\n");
				opcion = solicitarNum("Indica la acción que desea realizar: ");
				if (opcion < -1 || opcion > 5) {
					throw new OutOfRangeException();
				}
			} catch (OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
		} while (opcion < -1 || opcion > 6);
		
		return opcion;
	}
	
	private static int solicitarNum(String mensaje) {
		int opcion = -1;
		boolean datoNoOk = true;
		
		while (datoNoOk) {
			try { 
				System.out.print(mensaje);
				opcion = Integer.parseInt(sc.nextLine());
				System.out.println();
				
				if (opcion >= 0) {
					datoNoOk = false;
				} else {
					System.out.println("\n\t--- El valor debe ser mayor o igual que 0 ---\n");
				}
			} catch (NumberFormatException e) {
				System.out.println("\n\t --- El dato introducido no es correcto, debe ser numérico --- \n");
			}
		}
		return opcion;		
	}
}
		
	
