import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
//
//        try (leitor) {
//            for (int i = 0; i <= 2; i++) {
//
//                System.out.println("Digite o " + (i + 1) + "° numero inteiro");
//                int numero = leitor.nextInt();
//
//                // leitor.nextLine();
//
//                list.add(numero);
//            }
//        }
//        Collections.sort(list);
//        System.out.println(list);

        List<Titulo> listaTitulo = new ArrayList<>();

        try (leitor) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Digite o nome de um filme ");
                String nome = leitor.nextLine();

                Titulo titulo = new Titulo(nome);
                listaTitulo.add(titulo);
            }
        }

        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);
        //obs: Collections ordena String começando por letra maiúscula por padrão, e depois ordem alfabética.
        //Exemplo: ao adicionar Rei Leão e avatar, ao imprimir a lista irá aparecer: [Rei Leão, avatar]

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
