package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro numero: ");
		double primeiraEntrada = entrada.nextDouble();

		System.out.println("Informe o segundo numero: ");
		double segundaEntrada = entrada.nextDouble();

		System.out.println("Informe a operação: ");
		String operacao = entrada.next();

		// Logica
		double resultado = "+".equals(operacao) ? primeiraEntrada + segundaEntrada : 0;
		resultado = "-".equals(operacao) ? primeiraEntrada - segundaEntrada : resultado;
		resultado = "*".equals(operacao) ? primeiraEntrada * segundaEntrada : resultado;
		resultado = "/".equals(operacao) ? primeiraEntrada / segundaEntrada : resultado;
		resultado = "%".equals(operacao) ? primeiraEntrada % segundaEntrada : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", primeiraEntrada, operacao, segundaEntrada, resultado);
	}
}
