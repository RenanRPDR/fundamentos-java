package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double valorFinal1 = p1.precoComDesconto();
        double valorFinal2 = p2.precoComDesconto(0.3);

        //Minha implementacao
        System.out.printf( "O valor medio do carrinho é: R$" + (p1.preco + p2.preco) / 2 + ".");

        System.out.println();
        // Implementacao do professor
        double mediaCarrinho = (valorFinal1 + valorFinal2) / 2;
        System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
    }
}
