package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57;
		
		// Inferencia, voce consegue declarar uma variavel
		// Para que o Java descubra o tipo
		// Mas nao pode atribuir um valor a ela diferente do tipo em que ela foi declarada
		// No exemplo abaixo, tentei atribuir um FLOAT a uma variavel que foi inicializada como INT
		var b = 10;
//		b = 1.1;
		
		System.out.println(b);
	}
}
