package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> printLnInt = System.out::println;
        Consumer<String> printLnString = System.out::println;

        // TODO 01: Take earch number from nums and convert all them to a  binary string...  ex: 6 -> "110"
        System.out.println("\n01: Convert Int to String");
        List<String> streamNums = nums.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.toList());
        // .toList();    <--- in Java 17 can be replaced with 'toList()'

        streamNums.stream().forEach(printLnString);

        // TODO 02: Invert this string... "110" -> "011"
        System.out.println("\n02: Inverted strings");
        List<String> invertStrings = invertStrings(streamNums);
        invertStrings.forEach(printLnString);

        // TODO 03: Convert this String to Integer again: "011" -> 3
        List<Integer> streamNumsStringToInteger = invertStrings.stream()
                .map(binaryString -> Integer.parseInt(binaryString, 2))
                .toList();

        streamNumsStringToInteger.forEach(printLnInt);
    }

    private static List<String> invertStrings(List<String> nums) {
        return nums
                .stream().map(s -> new StringBuilder(s).reverse().toString())
                .toList();
    }
}
