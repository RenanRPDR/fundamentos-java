package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Alimento ingrediente1 = new Alimento("Arroz", 0.2);
        Alimento ingrediente2 = new Alimento("Feijao", 0.1);
        Alimento sobremesa = new Alimento("Sorvete",0.4);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        convidado.comer(sobremesa);
        System.out.println("Sobremesa: " + sobremesa.getNome() + ".\n" + "Peso depois da refeicao: " + convidado.getPeso());    }
}
