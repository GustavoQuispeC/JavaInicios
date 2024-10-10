package com.gustavodev.audioproject.modelos;

public class MisFavoritos {
    public void adicione(Audio audio) {
        if(audio.getClasificacion()>=8){
            System.out.println("Favoritos del mmmento");
        }
        else{
            System.out.println("No es favorito");
        }
    }
}
