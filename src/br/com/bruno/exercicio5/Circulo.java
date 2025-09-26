package br.com.bruno.exercicio5;

public class Circulo implements Forma{
    private double raio;

    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }
}
