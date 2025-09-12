package br.com.bruno.exercicio4.conversor_temperatura.modelo;

import br.com.bruno.exercicio4.conversor_temperatura.calculo.ConversorTemperatura;

public class Celsius extends Temperatura implements ConversorTemperatura {
    @Override
    public void converterTemperatura(double valor) {
        double fahrenheit = (valor * 1.8) + 32;
        System.out.println(valor + "ºC equivale a " + fahrenheit + "ºF");
    }
}
