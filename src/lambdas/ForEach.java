package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional:");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(cadaElementoDoArray -> System.out.println(cadaElementoDoArray + "!!!"));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}
