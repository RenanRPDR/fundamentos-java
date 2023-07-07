package lambdas;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);
    // Metodo default: legal, acesso direto somente pela instancia.
    default String legal(){
        return "legal";
    }
    // Metodo static: muito legal, acesso direto somente pela classe.
    static String muitoLegal(){
        return "muito legal";
    }
}
