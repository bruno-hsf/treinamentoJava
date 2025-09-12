package br.com.bruno.exercicio4.conversor_temperatura.modelo;

import br.com.bruno.exercicio4.conversor_temperatura.calculo.ConversorTemperatura;

public class Fahrenheit extends Temperatura implements ConversorTemperatura {
    @Override
    public void converterTemperatura(double valor) {
        double celsius = (valor - 32) / 1.8;
        System.out.println(valor + "ºF equivale a " + celsius + "ºC");
    }

}
