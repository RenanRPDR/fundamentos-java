package oo.abstrato;

public abstract class Mamifero extends oo.abstrato.Animal {

    public abstract String mamar();

    @Override
    public String mover() {
        return "Saindo do lugar";
    }
}