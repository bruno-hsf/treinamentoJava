package br.com.bruno.exercicio4;

import java.util.ArrayList;

public class Calculadora {
    public double precoMedio(ArrayList<Produto> list) {
        if (list.isEmpty()) {
            return 0.0;
        } else {
            double soma = 0.0;

            for (int i = 0; i < list.size(); i++) {
                soma += list.get(i).getPreco();
            }

            return soma / list.size();
        }
    }
}
