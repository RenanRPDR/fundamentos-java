package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        oo.abstrato.Mamifero a = new oo.abstrato.Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}