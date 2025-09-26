package br.com.bruno.exercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.calcularArea();

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.calcularArea();

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(quadrado);
        listaFormas.add(circulo);

        for(Forma f : listaFormas){
            System.out.println("Area " + f.calcularArea());
        }
    }

}
