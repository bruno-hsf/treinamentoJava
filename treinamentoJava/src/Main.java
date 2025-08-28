import br.com.bruno.veiculo.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setPreco(50000);
        carro.calcularPreco(1);
        System.out.println(carro.getPreco());
    }
}
