package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        // Não recebe nenhum parâmetro e retorna
        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "bia", "lia", "Gui");
        System.out.println(umaLista.get());
    }
}
