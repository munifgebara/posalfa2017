package br.com.munif.oo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {
    
    
    public static void main(String []args){
        try {
            System.out.println("Ola Mundo!!!");
            
            Liquidificador liq1=new Liquidificador ();
            
            liq1.setVelocidade(2);
            System.out.println(liq1.getVelocidade());
            System.out.println(liq1.praQue());
            liq1.setVelocidade(-3);
            System.out.println(liq1.getVelocidade());
            System.out.println(liq1.praQue());
        } catch (LiqException ex) {
            System.out.println("Problemas "+ex.getMessage());
        }
        catch(NumberFormatException ex){
            System.out.println ("Erro na entrada de dados");
        }
        
        
        
    }
    
}
