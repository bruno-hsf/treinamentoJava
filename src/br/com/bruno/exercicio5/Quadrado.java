package br.com.bruno.exercicio5;

public class Quadrado implements Forma {
    private double lado;

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }
}
