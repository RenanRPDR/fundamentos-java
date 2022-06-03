package classe;

public class DataTeste {
    public static void main(String[] args) {

        // Meu codico
        Data data1 = new Data();
        Data data2 = new Data();

        data1.dia = "28";
        data1.mes = "12";
        data1.ano = "2022";

        String data1Concat = data1.dia + "/" + data1.mes + "/" + data1.ano;
        System.out.println(data1Concat);

        data2.dia = "20";
        data2.mes = "04";
        data2.ano = "2021";

        String data2Concat = data2.dia + "/" + data2.mes + "/" + data2.ano;
        System.out.println(data2Concat);

        /* -------------------------------- */
        // Implementacao do professor

//        Data d1 = new Data();
//        d1.dia2 = 7;
//        d1.mes2 = 11;
//        d1.ano2 = 2021;
//
//        System.out.printf("%d/%d/%d\n", d1.dia2, d1.mes2, d1.ano2);
//
//        var d2 = new Data();
//        d2.dia2 = 31;
//        d2.mes2 = 12;
//        d2.ano2 = 2020;
//
//        System.out.printf("%d/%d/%d", d2.dia2, d2.mes2, d2.ano2);
    }
}
