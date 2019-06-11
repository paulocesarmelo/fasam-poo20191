/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.util.Random;

/**
 *
 * @author paulocesarmelo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        int i=0;
        
        while(i<5){
            System.out.println(1+r.nextInt(7));
            i++;
        }
        
        /*
        GeraPDF gp = new GeraPDF();
        BarraProgresso bp = new BarraProgresso();
        
        gp.setPriority(1);
        bp.setPriority(5);
        
        gp.start();
        bp.start();
        
        for(int i=0; i<5; i++)
            System.out.println("Executando o main...");           
        */
    }
    
}
