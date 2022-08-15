package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.name = "Renan";
        u1.email = "renan@email.com";

        Usuario u2 = new Usuario();
        u2.name = "Renan";
        u2.email = "renan@email.com";

        System.out.println(" == : " + (u1 == u2));
        System.out.println("only equals: " + u1.equals(u2));
        System.out.println("only equals: " + u2.equals(u1));

        System.out.println("Casting error fix with instanceof: " + u2.equals(new Date()));
    }
}
