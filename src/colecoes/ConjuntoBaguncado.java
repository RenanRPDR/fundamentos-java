package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Ele converte o tipo para a classe
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho e: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add("x");
        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho e: " + conjunto.size());

        // Como o x foi removido na linha 24, ele dara false
        System.out.println(conjunto.contains('x'));

        // Como o 1 foi adicionado na linha 13, ele dara true
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

//        Uniao entre 2 conjuntos
//        conjunto.addAll(nums);

//        Intersecção
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
