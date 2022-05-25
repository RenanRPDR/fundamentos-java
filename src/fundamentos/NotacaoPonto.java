package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		
		s = s.toUpperCase();
		//System.out.println(s);
		
		s = s.replaceAll("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Renan".toUpperCase();
		System.out.println(x);
		
//		String y = "Bom dia X".replace("X","Renan").toUpperCase();
		String y = "Bom dia X"
				.replace("X","Renan")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
//		Tipos primitivos nao tem o operador		
		int a = 3;
		System.out.println(a);
	}
}
