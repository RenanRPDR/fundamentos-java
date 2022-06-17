package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    // Criar dois construtores
    // const padrao: por padrao dia 1 mes 1 ano 1970
    // const secundario: recebe dia mes e ano

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaAtual, int mesAtual, int anoAtual){
        dia = diaAtual;
        mes = mesAtual;
        ano = anoAtual;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
