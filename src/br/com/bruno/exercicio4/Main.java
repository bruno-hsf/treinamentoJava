package br.com.bruno.exercicio4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o produto?");
            String nome = leitor.nextLine();

            System.out.println("Qual o preço do produto?");
            double preco = leitor.nextDouble();

            leitor.nextLine();

            Produto produto = new Produto(nome, preco);
            produtos.add(produto);
        }

        for(Produto p : produtos){
            System.out.println(p);
        }

        Calculadora calculadora = new Calculadora();
        System.out.println("O preco medio dos produtos é R$ " + calculadora.precoMedio(produtos));
    }
}
