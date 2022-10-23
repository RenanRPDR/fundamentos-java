package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();
//        System.out.println(sogra.segredo);             // private: Somente a classe acessa.
//        System.out.println(sogra.facoDentroDeCasa);    // default ou pacote: Somente quem esta no pacote.
//        System.out.println(sogra.formaDeFalar);        // protected: Somente quem herdou o pacote.
        System.out.println(sogra.todosSabem);          // public: Todos veem.
    }
}
