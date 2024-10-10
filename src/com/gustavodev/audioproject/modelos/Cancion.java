package com.gustavodev.audioproject.modelos;

public class Cancion extends Audio {
    private String artista;
    private String genero;

    @Override
    public int getClasificacion() {
        if(getTotalMeGusta() > 5000){
            return 8;
        }
        else {
            return 4;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
