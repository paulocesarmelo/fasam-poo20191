/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulocesarmelo
 */
public class BarraProgresso extends Thread {
    
    public void progresso(){
        for(int i=0; i<=100; i++){
            System.out.println(i+"%");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeraPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
    @Override
    public void run(){
       progresso(); 
    }
    
}
