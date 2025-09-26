package br.com.bruno.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i <= 2; i++){
            System.out.println("Digite um nome");
            list.add(leitor.nextLine());
        }
        System.out.println("Imprimindo os nomes digitados");
        for (String nome : list){
            System.out.println(nome);
        }
    }
}
