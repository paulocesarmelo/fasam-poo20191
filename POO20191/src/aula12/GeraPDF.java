/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulocesarmelo
 */
public class GeraPDF extends Thread{
    
    public void gera(){
        
        for(int i=0; i<=100; i++){
            System.out.println("Gerando pdf....");
         
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeraPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }
    
    @Override
    public void run(){
        gera();
    }
    
}
