package br.com.munif.ooweb;

public class Liquidificador implements Descritivel{

    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int v) throws LiqException {
        if (v >= 0 && v <= 3) {
            this.velocidade = v;
        }
        else{
            throw new LiqException("Velocidade Inválida");
        }
   
    
    }

    void desliga() {
        velocidade = 0;
    }

    void botao1() {
        velocidade = 1;
    }

    void botao2() {
        velocidade = 2;
    }

    void botao3() {
        velocidade = 3;
    }

    String praQue() {
        String retornos[] = {
            "nada", "ovos", "leite", "gelo"};

        return retornos[velocidade];

    }

    @Override
    public String descreve() {
        return "Liquidicador com velocidade "+velocidade;
        
    }

}
