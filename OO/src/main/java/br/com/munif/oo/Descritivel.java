package br.com.munif.oo;

public interface Descritivel {
    
    final String NOME_JOGO="JOGO2017";
    
    default String descreve()  {
        return "alguma coisa";
    }
    
}
