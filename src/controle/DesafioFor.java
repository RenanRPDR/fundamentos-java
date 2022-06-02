package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for(int i = 0; i < 5; i ++) {
            System.out.println(valor);
            valor += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
