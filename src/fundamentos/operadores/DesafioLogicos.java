package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
	
		// Trabalho na terca (V ou F)
		// Trabalho na quinta ( V ou F )
		
		
		/*
		-50 se os 2 der certo
		-32 se 1 der certo
		-se comprar uma das TV a familia toma sorvete junto    OU
		-nem, ter, nem quint. Fica em casa, nao toma sorv e nao comp TV
		*/
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		
		boolean compraTv50 = trabalhoTerca && trabalhoQuinta;
		System.out.println("Compra Tv 50 se for true: " + compraTv50);
		
		boolean compraTv32 = trabalhoTerca || trabalhoQuinta;
		System.out.println("Compra Tv 32 se for true: " + compraTv32);
		
		boolean tomarSorvete = compraTv32 || compraTv50;
		System.out.println("Toma sorvete se for true: " + tomarSorvete); 
		
		boolean ficaEmCasa = trabalhoTerca && trabalhoQuinta;
		System.err.println("Fica em casa se for false: " + ficaEmCasa);
	}
}
