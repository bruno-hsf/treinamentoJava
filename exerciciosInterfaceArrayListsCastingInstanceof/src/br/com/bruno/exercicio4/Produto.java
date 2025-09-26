package br.com.bruno.exercicio4;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

}
