package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		// Aqui ele incrementa primeiro no A porque o operador unario esta antes da variavel 
		// Depois ele compara com A com B, o que vai resultar em true.
		// Apos a comparacao ele decrementa de B porque o operador unario esta após a variavel
		// Em resumo, o operador de igualdade tem precedencia em relacao ao decremento. Por isso acontece isso.
		
		System.out.println(++a == b--);
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
