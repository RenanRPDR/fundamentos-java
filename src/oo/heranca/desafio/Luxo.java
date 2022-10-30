package oo.heranca.desafio;

public interface Luxo {

    public void ligarAr();
    abstract void desligarAr();

    // default: Define como padrao um metodo que nao sera obrigatorio ser implementado.
    default int velocidadeDoAr() {
        return 1;
    }
}