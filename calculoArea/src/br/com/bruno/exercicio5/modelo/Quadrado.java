package br.com.bruno.exercicio5.modelo;

public class Quadrado extends FiguraPlana {


    @Override
    public double calcularArea(double lado) {
        return Math.pow(lado,2);
    }
}
