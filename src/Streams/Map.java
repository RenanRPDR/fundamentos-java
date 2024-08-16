package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
//        marcas.stream().map(String::toUpperCase).forEach(print);
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

//        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//        UnaryOperator<String> maiusculaMethodReference = String::toUpperCase;
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//        UnaryOperator<String> grito = n -> n + "!!! ";

        System.out.println("\n\n Usando composição");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
