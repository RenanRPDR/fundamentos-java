package lambdas;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    default String legal(){
        return "Metodo default: legal, acesso direto somente pela instancia.";
    }

    static String muitoLegal(){
        return "Metodo static: muito legal, acesso direto somente pela classe.";
    }
}
