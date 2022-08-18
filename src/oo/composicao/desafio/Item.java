package oo.composicao.desafio;

// Um item pode ter uma compra
// Um item tem um produto
// quantidade do item   inteiro

public class Item {
    Produto produto;
    int quantidade;

    Item (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
