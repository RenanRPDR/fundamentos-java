package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoFinal = media >= 7.0 ?
				"Aprovado" : "Reprovado";
		System.out.println("O aluno esta " + resultadoFinal);
		
	}
	
}
