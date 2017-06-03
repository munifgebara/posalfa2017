package br.com.munif.ooweb;

public class Mapa {
    
    private Lugar lugarInicialJogador;
    private Lugar lugarInicialNPC;
    
    public Mapa() {
        criaLugares();
    }

    private void criaLugares() {
        Lugar sala = new Lugar("sala");
        Lugar copa = new Lugar("copa");
        Lugar corredor = new Lugar("corredor");
        Lugar cozinha = new Lugar("cozina");
        Lugar quarto = new Lugar("quarto");
        Lugar banheiro = new Lugar("banheiro");
        sala.setSul(copa);
        copa.setNorte(sala);
        copa.setSul(cozinha);
        cozinha.setNorte(copa);
        sala.setOeste(corredor);
        copa.setOeste(corredor);
        cozinha.setOeste(corredor);
        corredor.setLeste(copa);
        corredor.setNorte(quarto);
        quarto.setSul(corredor);
        corredor.setSul(banheiro);
        banheiro.setNorte(corredor);
        lugarInicialJogador = sala;
        lugarInicialNPC = cozinha;
    }

    public Lugar getLugarInicialJogador() {
        return lugarInicialJogador;
    }

    public Lugar getLugarInicialNPC() {
        return lugarInicialNPC;
    }
    

}
