package com.gustavodev.audioproject.principal;

import com.gustavodev.audioproject.modelos.Cancion;
import com.gustavodev.audioproject.modelos.MisFavoritos;
import com.gustavodev.audioproject.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        cancion.setTitulo("Mariposa Traicionera");
        cancion.setArtista("Mana");
        cancion.setGenero("Rock");

        Podcast podcast = new Podcast();
        podcast.setPresentador("Gustavo");
        podcast.setTema("Nuevo tema");

        // Reproducir 1500 veces la cancion
        for(int i = 0; i < 15000; i++){
            cancion.meGusta();

        }
        for(int i = 0; i < 3000; i++){
            cancion.reproducir();
        }

        // Reproducir 100 veces el podcast
        for(int i = 0; i < 100; i++){
            podcast.meGusta();
        }
        for(int i = 0; i < 50; i++){
            podcast.reproducir();
        }

        System.out.println("Titulo : "+ cancion.getTitulo());
        System.out.println("Artista : "+ cancion.getArtista());
        System.out.println("Genero : "+ cancion.getGenero());

        System.out.println("Total de reproducciones : "+ cancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta :" + cancion.getTotalMeGusta());


MisFavoritos favoritos = new MisFavoritos();
favoritos.adicione(cancion);

MisFavoritos favoritos2 = new MisFavoritos();
favoritos2.adicione(podcast);








    }
}
