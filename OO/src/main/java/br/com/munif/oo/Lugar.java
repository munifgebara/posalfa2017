package br.com.munif.oo;

public class Lugar {

    private String descricao;

    private Lugar norte;
    private Lugar sul;
    private Lugar leste;
    private Lugar oeste;

    public Lugar(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Lugar getNorte() {
        return norte;
    }

    public void setNorte(Lugar norte) {
        this.norte = norte;
    }

    public Lugar getSul() {
        return sul;
    }

    public void setSul(Lugar sul) {
        this.sul = sul;
    }

    public Lugar getLeste() {
        return leste;
    }

    public void setLeste(Lugar leste) {
        this.leste = leste;
    }

    public Lugar getOeste() {
        return oeste;
    }

    public void setOeste(Lugar oeste) {
        this.oeste = oeste;
    }

}
