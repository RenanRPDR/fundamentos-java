package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		// byte
		Byte b = 1;
		Short s = 1000;
		Integer i = 10000; 
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println("toString: " + s.toString());
		System.out.println(i * 3);
		System.out.println(i / 3);
		System.out.println(l);
		
		Float f = 123.45F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c);
	}
}
