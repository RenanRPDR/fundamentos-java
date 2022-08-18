package oo.composicao.desafio;

// Um produto pode e estar presente em varios items
// Dentro do produto nao precisa ter uma lista de items (nao e necessario um relacionamento bidirecional)
// nome e preco dentro do produto

import java.util.Objects;

public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
