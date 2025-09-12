import br.com.bruno.exercicio2.area_perimetro.modelo.Poligono;
import br.com.bruno.exercicio2.area_perimetro.modelo.Quadrado;
import br.com.bruno.exercicio1.conversor_moeda.modelo.Dolar;
import br.com.bruno.exercicio1.conversor_moeda.modelo.Moeda;
import br.com.bruno.exercicio1.conversor_moeda.modelo.Real;
import br.com.bruno.exercicio3.tabuada.modelo.TabuadaMultiplicacao;
import br.com.bruno.exercicio4.conversor_temperatura.modelo.Celsius;
import br.com.bruno.exercicio4.conversor_temperatura.modelo.Fahrenheit;
import br.com.bruno.exercicio4.conversor_temperatura.modelo.Temperatura;
import br.com.bruno.exercicio5.calcular_preco_final.modelo.Livro;
import br.com.bruno.exercicio5.calcular_preco_final.modelo.Produto;
import br.com.bruno.exercicio5.calcular_preco_final.modelo.ProdutoFisico;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moeda conversorDolar = new Dolar();
        conversorDolar.conversaoFinanceira(60);

        Moeda conversorReal = new Real();
        conversorReal.conversaoFinanceira(54);

        Poligono poligono = new Quadrado();
        poligono.calculaArea(10);
        poligono.calculaPerimetro(10);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(2);

        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.converterTemperatura(32);

        Celsius celsius = new Celsius();
        celsius.converterTemperatura(0);

        Produto produto = new Produto();
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        try (Scanner leitor = new Scanner(System.in)) {

            System.out.println("Qual o valor do livro?");
            livro.setPreco(leitor.nextDouble());

            System.out.println("Qual o valor do Produto físico?");
            produtoFisico.setPreco(leitor.nextDouble());

            while (true) {
                System.out.println("Selecione a forma de pagamento" +
                        "\nA - para pgto à vista" +
                        "\nP - para pgto à prazo");
                char pgto = leitor.next().charAt(0);

                switch (pgto) {
                    case 'A':
                    case 'a':
                        //setar na classe mae produto, pois as subclasses herdam esse status
                        produto.isaVista();
                        break; //sai do switch
                    case 'p':
                    case 'P':
                        produto.setaVista(false);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continue; //volta para o inicio do while
                }
                break; //sai do while somente se a opcao for valida
            }

//            if (pgto == 'A' || pgto == 'a') {
//                livro.isaVista();
//            } else {
//                livro.setaVista(false);
//            }
            System.out.println("O preço final do livro é R$ " + livro.calcularPrecoFinal());
            System.out.println("O preço final do produto físico é R$ " + produtoFisico.calcularPrecoFinal());
        }
    }
}
