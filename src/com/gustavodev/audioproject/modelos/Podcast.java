package com.gustavodev.audioproject.modelos;

public class Podcast extends Audio {
    private String presentador;
    private  String tema;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones()>2000){
            return 9;
        }
        else {
            return 2;
        }
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPresentador() {
        return presentador;
    }

    public String getTema() {
        return tema;
    }
}
