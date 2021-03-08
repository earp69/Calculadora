package dam.ejer.model;

public class Resta {
	double valoracumulado ;
	double resultadoreal;
	int resultadoenteros;
	
	public Resta() {
		valoracumulado  = 0;
		resultadoreal = 0;
	}
	
	public void restareal(double numero1,double numero2) {
		 resultadoreal = numero1-numero2;
		 valoracumulado = resultadoreal;
		
	}
	
	public void restaenteros (int numero1, int numero2) {
		resultadoenteros = numero1-numero2;
		valoracumulado = resultadoenteros;
	}
	
	public void restareal(double numero1,double numero2, double numero3) {
		 resultadoreal = numero1-numero2-numero3;
		 valoracumulado =  resultadoreal;
		  
		 
	}
	
	public void resta(double valor) {
		
		valoracumulado-= valor;
	}
}
