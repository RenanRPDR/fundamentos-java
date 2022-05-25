package fundamentos.operadores;

public class DesafioAritmeticos {
  
	public static void main(String[] args) {
		// --- Operação 1 = Op1
		double entrada1Op1 = 6;
		double entrada2Op1 = 3;
		double entrada3Op1 = 2;
		double entrada4Op1 = 3;
		double entrada5Op1 = 2;
		
		double dividendoOp1 = Math.pow(entrada1Op1 * (entrada2Op1 + entrada3Op1),2);
		double divisorOp1 = entrada4Op1 * entrada5Op1;
		double resultadoOp1 = dividendoOp1 / divisorOp1;
		//System.out.println(resultadoOp1);
		
		// --- Operação 2 = Op2
		double entrada1Op2 = 1;
		double entrada2Op2 = 5;
		double entrada3Op2 = 2;
		double entrada4Op2 = 7;
		double entrada5Op2 = 2;
		
		double dividendoOp2 = (entrada1Op2 - entrada2Op2) * (entrada3Op2 - entrada4Op2);
		double divisorOp2 = entrada5Op2;
		double resultadoOp2 = Math.pow((dividendoOp2 / divisorOp2), 2);
		//System.out.println(resultadoOp2); 
				
		double dividendoFinalOp1E2 = Math.pow((resultadoOp1 - resultadoOp2), 3);
		//System.out.println("dividendo final: " + dividendoFinal);
		
		// --- Operação 3 = Op3
		double entrada1Op3 = 10;
		
		double resultadoOp3 = Math.pow(entrada1Op3, 3);
		//System.out.println(resultadoOp3);
		
		double resultadoFinal = dividendoFinalOp1E2 / resultadoOp3;
		System.out.println("Resultado final: " + (int)resultadoFinal + ".");
	}
}