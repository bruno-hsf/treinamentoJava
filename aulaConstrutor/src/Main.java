import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int verificaInteiro(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                String invalido = sc.nextLine();
                System.out.println(invalido + " não é inteiro. Tente novamente");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o produto?");
            String nome = leitor.nextLine();

            System.out.println("Qual o preco do produto?");
            double preco = leitor.nextDouble();

            System.out.println("Qual a quantidade?");
            int quantidade = verificaInteiro(leitor);

            leitor.nextLine();

            Produto p = new Produto(nome, preco, quantidade);
            listaDeProdutos.add(p);
        }

        for(Produto p: listaDeProdutos){
            System.out.println(p);
        }

        Produto produto = new ProdutoPerecivel("Maionese", 3.45,2,"10/10/2025");

        System.out.println(produto);
    }


}
