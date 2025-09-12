package br.com.bruno.exercicio2.area_perimetro.modelo;

import br.com.bruno.exercicio2.area_perimetro.calculo.CalculoGeometrico;

public class Quadrado extends Poligono implements CalculoGeometrico {
    @Override
    public void calculaArea(double valor) {
        double area = Math.pow(valor, 2);
        System.out.println("A área do quadrado de lado " + valor + " é " + area);
    }

    @Override
    public void calculaPerimetro(double valor) {
        double perimetro = 4 * valor;
        System.out.println("O perímetro do quadrado de lado " + valor + " é de " + perimetro);
    }
}
