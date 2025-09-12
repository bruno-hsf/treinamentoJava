package br.com.bruno.exercicio5.calcular_preco_final.modelo;

public class Produto {
    private double preco;
    private boolean aVista = true;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isaVista() {
        return aVista;
    }

    public void setaVista(boolean aVista) {
        this.aVista = aVista;
    }
}
