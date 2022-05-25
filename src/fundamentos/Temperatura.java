package fundamentos;

public class Temperatura {

		public static void main(String[] args) {
			// ( F - 32) x 5/9 = C
			// Insira em f o valor a ser convertido
			final double ajuste = 32;
			final double multiplicador = 5/9.0;

			double f = 86; 
			double celcius = (f - ajuste) * multiplicador;
			System.out.println( f +" Fahrenheit é igual a " + celcius + " graus celsius.");
			
			f = 100; 
			celcius = ajuste * multiplicador;
			System.out.println( f +" Fahrenheit é igual a " + celcius + " graus celsius.");
		}
}
