package dam.ejer.model;

public class Producto {
	private double num1;
	private double num2;
	private double num3;

	public Producto(double num1, double num2, double num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public double productoReales () {
		double resultado = num1 * num2;
		return resultado;
	}
	
	public int productoEnteros () {
		int resultado = (int)(num1 * num2);
		return resultado;
	}
	
	public int producto3Enteros () {
		int resultado = (int)(num1 * num2 * num3);
		return resultado;
	}
	
	public int potencia () {
		int resultado = (int) Math.pow(num1, num2);
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Producto de dos números reales: " + productoReales() + 
				"\nProducto de dos números enteros: " + productoEnteros() + 
				"\nProducto de tres números enteros: " + producto3Enteros() + 
				"\nPotencia : Base = " + num1 + " ^ Exponente = " + num2 + " = " + potencia();
	}

}
