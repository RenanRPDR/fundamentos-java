package oo.composicao.desafio;

// Uma compra vai ter 1 cliente
// Uma compra pode ter uma lista de items

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
    }
    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double resultadoTotalDaCompra() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
