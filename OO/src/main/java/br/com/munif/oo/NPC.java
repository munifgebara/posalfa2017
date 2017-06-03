package br.com.munif.oo;

import java.util.Random;

public class NPC extends Personagem{
    
    static private Random r=new Random();
    
    static private String[] possiveisNomes={"A","B","C","D","E"};

    public NPC(Lugar lugar) {
        super(possiveisNomes[r.nextInt(possiveisNomes.length)], 
                lugar);
    }
    
    
    
}
