package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
        // System.out.println(esposa.segredo);             // private: Somente a classe acessa.
        System.out.println(esposa.facoDentroDeCasa);    // default ou pacote: Somente quem esta no pacote.
        System.out.println(esposa.formaDeFalar);        // protected: Somente quem herdou o pacote.
        System.out.println(esposa.todosSabem);          // public: Todos veem.
    }
}
