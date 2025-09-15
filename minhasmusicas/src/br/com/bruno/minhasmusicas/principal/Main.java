package br.com.bruno.minhasmusicas.principal;

import br.com.bruno.minhasmusicas.modelos.MinhasPreferidas;
import br.com.bruno.minhasmusicas.modelos.Musica;
import br.com.bruno.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        //gerar curtidas e reproduções aleatórias para Musicas e Podcast, pois ele terão métodos diferentes para
        //classificacao()
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
