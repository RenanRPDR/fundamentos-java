package classe;

public class DataTesteRenan {
    public static void main(String[] args) {

        // Meu codico
        DataRenan data1 = new DataRenan();
        DataRenan data2 = new DataRenan();

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
    }
}
