package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
        void testeAcessos() {
                // System.out.println(segredo);          // private:
                // System.out.println(facoDentroDeCasa); // default ou pacote:
                System.out.println(formaDeFalar);        // protected: Acessa por heranca e nao por instancia.
                System.out.println(todosSabem);          // public: Acessa por heranca e nao por instancia.
                System.out.println(new Ana().todosSabem);
        }
}
