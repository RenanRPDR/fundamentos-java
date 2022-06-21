package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + ": " + p1.precoComDesconto());
        System.out.println(p2.nome + ": " + p2.precoComDesconto());

        double valorFinal1 = p1.precoComDesconto();
        double valorFinal2 = p2.precoComDesconto(0.3);

        // Implementacao do professor
        double mediaCarrinho = (valorFinal1 + valorFinal2) / 2;
        System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);

        //Minha implementacao
        // System.out.printf( "O valor medio do carrinho é: R$" + (p1.preco + p2.preco) / 2 + ".");
    }
}
