package fundamentos;

import java.util.Scanner;

/*Desafios*/
// Criar um scanner
// pegar 3 strings (salarios)
// calcular a media desses 3 salarios
// Pode usar virgula ou ponto no momento de inserir o salario

public class DesafioConversao {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite aqui o primeiro sal�rio do  funcion�rio.");
		String primeiroInput = input.nextLine().replace(",", ".");
		
		
		System.out.println("Digite aqui o segundo sal�rio do  funcion�rio.");
		String segundoInput = input.nextLine().replace(",", ".");
		
		
		System.out.println("Digite aqui o  terceiro sal�rio do funcion�rio.");
		String terceiroInput = input.nextLine().replace(",", ".");
		
		double primeiroSalario = Double.parseDouble(primeiroInput);
		double segundoSalario = Double.parseDouble(segundoInput);
		double terceiroSalario = Double.parseDouble(terceiroInput);
		
		Double mediaSalario = (primeiroSalario + segundoSalario + terceiroSalario) / 3;
							
		System.out.printf("\nA m�dia de sal�rio �: %.2f%n " , mediaSalario);
		
		input.close();
	}
}
