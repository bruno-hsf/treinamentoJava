package br.com.bruno.exercicio1.conversor_moeda.modelo;

import br.com.bruno.exercicio1.conversor_moeda.calculo.ConversaoFinanceira;

public class Dolar extends Moeda implements ConversaoFinanceira {
    @Override
    public void conversaoFinanceira(double valor) {
        double valorReal = valor * super.getCotacaoDolar();
        System.out.println("U$" + valor + " equivale a R$" + valorReal);
    }
}
