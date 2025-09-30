package br.com.bruno.exercicio5;

import br.com.bruno.exercicio5.modelo.Circulo;
import br.com.bruno.exercicio5.modelo.Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        System.out.println(quadrado.calcularArea(2));

        Circulo circulo = new Circulo();
        System.out.println(circulo.calcularArea(2));
    }
}
