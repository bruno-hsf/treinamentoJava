import br.com.bruno.animais.Animal;
import br.com.bruno.animais.Cachorro;
import br.com.bruno.animais.Gato;
import br.com.bruno.veiculo.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setPreco(50000);
        carro.calcularPreco(1);
        System.out.println(carro.getPreco());

        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom();
        cachorro.emitirSom();

        //Poderia fazer de uma outra maneira
        System.out.println("\nOutra maneira");
        Gato gato1 = new Gato();
        Cachorro cachorro1 = new Cachorro();
        gato1.emitirSom();
        cachorro1.emitirSom();
    }
}
