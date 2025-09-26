package br.com.bruno.exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.println("qual o produto ?");
            String nomeProduto = leitor.nextLine();

            System.out.println("Qual o preco do produto?");
            double precoProduto = leitor.nextDouble();

            leitor.nextLine();

            Produto p = new Produto(nomeProduto, precoProduto);
            listaProduto.add(p);
        }
        Calculadora calculadora = new Calculadora();
        double media = calculadora.precoMedio(listaProduto);
        System.out.println("Preco medio dos produtos cadastrados é R$ " + media);

    }
}
