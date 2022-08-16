package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessar pelo indice

        System.out.println(">>>>>>" + lista.remove(1)); // Aqui removeu o Carlos
        System.out.println(lista.remove(new Usuario("Manu"))); // Retorna true pq removeu a Manu

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println("Tem? " + lista.contains(u1));

        for ( Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
