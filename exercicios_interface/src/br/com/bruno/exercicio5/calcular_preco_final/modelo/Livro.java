package br.com.bruno.exercicio5.calcular_preco_final.modelo;

import br.com.bruno.exercicio5.calcular_preco_final.calculo.Calculavel;

public class Livro extends Produto implements Calculavel {
//    private double preco;
//    private boolean aVista = true;
//
//    public boolean isaVista() {
//        return aVista;
//    }
//
//    public void setaVista(boolean aVista) {
//        this.aVista = aVista;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public double getPreco() {
//        return preco;
//    }

    @Override
    public double calcularPrecoFinal() {
//        if (isaVista()){
//            //desconto de 10%
//            return getPreco() * 0.9;
//        }
//        return getPreco();

        /*operador ternário: é um if/else em linha que retorna um valor
        condicao? exprSeVerdadeiro : exprSeFalso*/
        return isaVista() ? getPreco() * 0.9 : getPreco();
    }
}
