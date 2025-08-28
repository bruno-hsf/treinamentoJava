import br.com.bruno.animais.Animal;
import br.com.bruno.animais.Cachorro;
import br.com.bruno.animais.Gato;
import br.com.bruno.matematica.GeradorPrimo;
import br.com.bruno.matematica.NumerosPrimos;
import br.com.bruno.matematica.VerificadorPrimo;
import br.com.bruno.veiculo.Carro;

public class Main {
    public static void main(String[] args) {
//        Carro carro = new Carro();
//        carro.setPreco(50000);
//        carro.calcularPreco(1);
//        System.out.println(carro.getPreco());
//
//        Animal gato = new Gato();
//        Animal cachorro = new Cachorro();
//
//        gato.emitirSom();
//        cachorro.emitirSom();
//
//        //Poderia fazer de uma outra maneira
//        System.out.println("\nOutra maneira");
//        Gato gato1 = new Gato();
//        Cachorro cachorro1 = new Cachorro();
//        gato1.emitirSom();
//        cachorro1.emitirSom();

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(10);

        VerificadorPrimo numerosPrimos1 = new VerificadorPrimo();
        numerosPrimos1.verificaSeEhPrimo(25);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        geradorPrimo.gerarProximoPrimo(26);
    }
}
