package br.com.bruno.exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void maiorSaldo(ArrayList<ContaBancaria> list){
        for(int i = 0; i <= list.size(); i++);
    }

    public static void main(String[] args) {

        ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();

        //usando try-with-resources: objeto precisa ser instanciado dentro do parenteses, pois quando termina o bloco
        // o Java chama leitor.close automaticamente.
        try(Scanner leitor = new Scanner(System.in)){
            for(int i = 0; i < 2; i++){
                System.out.println("Digite o numero da conta");
                String cc = leitor.nextLine();

                System.out.println("Digite o saldo da conta");
                double saldo = leitor.nextDouble();

                //consumir o "enter"
                leitor.nextLine();

                ContaBancaria contaBancaria = new ContaBancaria(cc, saldo);

                listaContaBancaria.add(contaBancaria);
            }

            for(ContaBancaria conta : listaContaBancaria){
                System.out.println(conta);
            }

            maiorSaldo(listaContaBancaria);
        }
    }
}
