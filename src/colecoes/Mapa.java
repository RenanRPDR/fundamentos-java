package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        // Ele substitui o valor existente pelo valor colocado(put) naquele registro.
        usuarios.put(1, "Roberta");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println("keySet: " + usuarios.keySet()); // Somente o indice
        System.out.println("values: " + usuarios.values()); // Somente valores
        System.out.println("entrySet: " + usuarios.entrySet()); // Chave e valores

        System.out.println("" + usuarios.containsKey(2)); // retorna boolean se existir ou nao a chave
        System.out.println(usuarios.containsValue("Rafaela")); // retorna boolean se existir ou nao o valor

        System.out.println(usuarios.get(4));
        usuarios.remove(1); // Removendo o usuario Roberta da linha 12.?

        // Removendo o usuario 4, porem da false pq o valor esta diferente.
        System.out.println(usuarios.remove(4, "Gui"));

        // Percorrendo o array pela chave
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        // Percorrendo o array pela chave
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        System.out.print("\n");

        for (Entry<Integer, String> registros : usuarios.entrySet()) {
            System.out.print(registros.getKey() + ": ");
            System.out.println(registros.getValue());
        }
    }
}
