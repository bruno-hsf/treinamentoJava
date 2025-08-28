package br.com.bruno.matematica;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    //System.out.println(numero + " não é primo"); Coloquei na classe VerificadorPrimo
                    return false;
                }
            }
            //System.out.println(numero + " é primo");Coloquei na classe VerificadorPrimo
            return true;
        }
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
