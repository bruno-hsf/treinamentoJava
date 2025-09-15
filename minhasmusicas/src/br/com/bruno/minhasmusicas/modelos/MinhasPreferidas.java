package br.com.bruno.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é muito top. Melhor deste mês");
        } else {
            System.out.println(audio.getTitulo() + " é bom, vale a pena");
        }
    }

}
