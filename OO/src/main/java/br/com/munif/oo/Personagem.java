package br.com.munif.oo;

public abstract class Personagem {

    private String nome;

    private Lugar lugar;

    public Personagem(String nome, Lugar lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    public String getNome() {
        return nome;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

}
