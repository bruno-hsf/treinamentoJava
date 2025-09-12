package br.com.bruno.exercicio3.tabuada.modelo;

import br.com.bruno.exercicio3.tabuada.calculo.CalculoTabuada;

public class TabuadaMultiplicacao implements CalculoTabuada {
    @Override
    public void mostrarTabuada(int valor) {
        System.out.println("\n*********** Tabuada do " + valor + " ***********" );
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
    }
}
