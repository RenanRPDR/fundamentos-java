package oo.polimorfismo;

public class Alimento {

    private String nome;
    private double peso;

    public Alimento(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
