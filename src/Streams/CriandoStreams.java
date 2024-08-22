package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // 1° forma de criar uma stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");

        langs.forEach(print);

        // Stream com array
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        // 2° forma de criar uma stream
        Stream.of(maisLangs).forEach(print);

        // 3° forma de criar uma stream
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        // Listas através das Collections
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");

        // A partir do Java 17 o stream() ficou explicito conforme linha 34
        // outrasLangs.stream().forEach(print);
        outrasLangs.forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Generate, nao tem uma ordem, passa um suplier como parametro na lambda.
        // Repeticao infinta
//        Stream.generate(() -> "a").forEach(print);

        // Gera de forma iterativa a partir de um seed
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
