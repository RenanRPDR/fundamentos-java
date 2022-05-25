package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		// Soma um caracter em branco com um inteiro para transformar em string
		// Por isso e possivel usar o length no final do output abaixo.
		System.out.println((""+num2).length());
	}
}
