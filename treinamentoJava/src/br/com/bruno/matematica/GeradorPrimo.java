package br.com.bruno.matematica;

public class GeradorPrimo extends NumerosPrimos{
    public void gerarProximoPrimo (int numero){
        int proximoNumero = numero + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero ++;
        }
        System.out.println("O número primo depois de " + numero +
                " é: " + proximoNumero);
    }
}
