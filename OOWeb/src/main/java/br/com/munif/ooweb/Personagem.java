package br.com.munif.ooweb;

public abstract class Personagem implements Descritivel {

    protected String nome;

    private Lugar lugar;

    public abstract void chora();

    public Personagem() {
    }

    public Personagem(String nome, Lugar lugar) {
        this.nome = nome;
        this.lugar = lugar;
        lugar.getPersonagens().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        if (this.lugar != null) {
            this.lugar.getPersonagens().remove(this);
        }
        this.lugar = lugar;
        this.lugar.getPersonagens().add(this);
    }

    @Override
    public String descreve() {
        return "Personagem com nome " + nome + " em " + lugar.getDescricao();
    }

    @Override
    public String toString() {
        return nome;
    }

}
