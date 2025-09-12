package br.com.bruno.exercicio1.conversor_moeda.modelo;

import br.com.bruno.exercicio1.conversor_moeda.calculo.ConversaoFinanceira;

public class Real extends Moeda implements ConversaoFinanceira {

    @Override
    public void conversaoFinanceira(double valor) {
        double valorDolar = valor / super.getCotacaoDolar();
        System.out.println("R$" + valor + " equivale a U$" + valorDolar);
    }
}
