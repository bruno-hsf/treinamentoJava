package br.com.bruno.exercicio5.calcular_preco_final.modelo;

import br.com.bruno.exercicio5.calcular_preco_final.calculo.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
    @Override
    public double calcularPrecoFinal(){
        return isaVista() ? getPreco() * 0.95 : getPreco();
    }
}
