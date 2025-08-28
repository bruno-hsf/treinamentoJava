package br.com.bruno.veiculo;

public class Carro {
    private String modelo;
    private double preco;
    private int ano;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public double calcularPreco(int ano) {
        for (int i = 0; i < ano; i++) {
            this.preco *= 0.9;
        }
        return this.preco;
    }
}
