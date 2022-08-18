package oo.composicao.desafio;

// Cria um cliente
// cria duas compras
// cada compra 2 itens
// cada item, associado a um produto diferente
// os items dentro da compra
// a compra associada ao cliente

public class Programa {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000), 1);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.print("Os itens: ");
        for (Item item : compra1.itens) {
            System.out.print(item.produto.nome + " ");
        }

        System.out.println("custaram R$" + cliente.valorTotalDaCompra() + " no total.");

    }
}
