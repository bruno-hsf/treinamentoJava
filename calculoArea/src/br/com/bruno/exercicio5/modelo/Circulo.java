package br.com.bruno.exercicio5.modelo;

public class Circulo extends FiguraPlana{
     double raio;

    @Override
    public double calcularArea(double raio) {
        return Math.PI * Math.pow(raio,2);
    }
}
