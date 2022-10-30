package oo.polimorfismo;

public class Pessoa {

    private double peso;
    public Pessoa(double peso){
        setPeso(peso);
    }
    public void comer(Alimento alimento){
        this.peso += alimento.getPeso();
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
