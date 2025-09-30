import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> usandoHashMap = new HashMap<>();

        //adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        //acessando um valor atraves de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("O valor da chave Cachorros é " + valor);

        //removendo um par chave-valor
        usandoHashMap.remove("Gatos");

        //Iterando sobre as chaves
        for(String chave : usandoHashMap.keySet()){
            System.out.println("Chave " + chave);
            System.out.println("Valor " + usandoHashMap.get(chave));
        }
    }
}
