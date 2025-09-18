import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int lerInteiro(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                String invalido = sc.nextLine();
                System.out.println(invalido + " não é uma idade valida");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        //Usando o Construtor da Classe Pessoa
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa");
            String nome = leitor.nextLine();

            System.out.println("Digite a idade da " + (i + 1) + "º pessoa");
            int idade = lerInteiro(leitor);

            /*Acima o Scanner somente lê o número que o usuário digitou, mas não lê o Enter
             * Esse enter fica guardado no buffer de entrada e se logo em seguida eu chamar
             * String nome = leitor.nextLine() para cadastrar nova pessoa
             * o Java não vai esperar eu digitar nada, ele irá
             * consumir o Enter que estava sobrando no Buffer e o resultado será uma String vazia ""
             * Por isso a solução é usar o comando abaixo*/
            leitor.nextLine();

            Pessoa p = new Pessoa(nome, idade);
            listaDePessoas.add(p);
        }
        System.out.println("\nLista de pessoas cadastradas:");
        //para cada objeto do tipo Pessoa contido em listaDePessoas, guarde temporariamente na variável *p*
        for (Pessoa p : listaDePessoas) {
            System.out.println(p);
        }

        //Sem usar o Construtor - Usando Getter e Setter
        for (int i = 2; i < 4; i++) {
            Pessoa p = new Pessoa();

            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa");
            p.setNome(leitor.nextLine());
            ;

            System.out.println("Digite a idade da " + (i + 1) + "º pessoa");
            p.setIdade(lerInteiro(leitor));

            leitor.nextLine();

            listaDePessoas.add(p);
        }
        System.out.println("\nLista de pessoas cadastradas:");
        //para cada objeto do tipo Pessoa contido em listaDePessoas, guarde temporariamente na variável *p*
        for (Pessoa p : listaDePessoas) {
            System.out.println(p);
        }
    }
}
