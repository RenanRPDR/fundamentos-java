package oo.composicao.desafio;

// Vai ter um nome
// Cliente vai ter uma lista de compras
// Criar uma metodo dentro de cliente que vair retornar quanto de dinheiro esse cliente gastou nessa loja

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;

    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double valorTotalDaCompra() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.resultadoTotalDaCompra();
        }

        return total;
    }
}
