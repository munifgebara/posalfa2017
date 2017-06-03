package br.com.munif.ooweb;

public class Jogador extends Personagem {

    public Jogador() {
    }

    public Jogador(String nome, Lugar lugar) {
        super(nome, lugar);
    }

    @Override
    public void chora() {
        System.out.println("Buabuaba");
    }

    public String getNome() {
        return nome;
    }

}
