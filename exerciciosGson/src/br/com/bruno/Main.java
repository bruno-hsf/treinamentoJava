package br.com.bruno;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Editora(String nome, String cidade) {
}

record Livro(String titulo, String autor, Editora editora) {
}

public class Main {
    public static void main(String[] args) {
        String json = """
                {
                "nome" : "Bruno",
                "idade" : 41,
                "cidade" : "Blumenau"
                }
                """;

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        //json com pequenos erros
        String json1 = """
                {
                nome : "Bruno",
                                
                "cidade" : Blumenau
                }
                """;
        Gson gson1 = new GsonBuilder().setLenient().create();

        Pessoa pessoa1 = gson1.fromJson(json1, Pessoa.class);
        System.out.println(pessoa1);

        pessoa = gson.fromJson(json1, Pessoa.class);
        System.out.println(pessoa);

        //json aninhado Livro + editora
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\"," +
                "\"editora\":" +
                "{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}" +
                "}";
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
