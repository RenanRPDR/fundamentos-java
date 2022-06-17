package classe;

public class Produto {
    // Comentario exemplo
    String nome;
    double preco;
    double desconto;

    double precoComDesconto () {
        return preco * (1 - desconto);
    }

    double precoComDesconto (double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
