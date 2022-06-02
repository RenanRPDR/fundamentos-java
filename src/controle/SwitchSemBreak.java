package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

    /* Nesse exemplo os cases sem o break faz sentido porque quem é
    mais graduado no Karate, ele deve saber os katares das faixas menores */

        String faixa = "amarela";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Nao sei nada.");
        }
        System.out.println("Fim!");

        /* O switch sem break, ele executa todos
         o cases abaixo daquele que ele entrou */

        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Saber falar");
            case 1:
                System.out.println("Saber andar");
            case 0:
                System.out.println("Saber respirar");
        }
    }
}
