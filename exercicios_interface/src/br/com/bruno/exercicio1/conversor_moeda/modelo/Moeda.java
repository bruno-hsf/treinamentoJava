package br.com.bruno.exercicio1.conversor_moeda.modelo;

import br.com.bruno.exercicio1.conversor_moeda.calculo.ConversaoFinanceira;

public class Moeda implements ConversaoFinanceira {
    private double cotacaoDolar = 2;

    public void setCotacaoDolar(double valor){
        this.cotacaoDolar = valor;
    }

    public double getCotacaoDolar(){
        return cotacaoDolar;
    }

    @Override
    public void conversaoFinanceira(double valor) {

    }
}
