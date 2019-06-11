
package aula11;

import aula8.Pessoa;
import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulocesarmelo
 */
public class Principal {
    
    public static void main(String[] args){
        
        
        try {
            metodo1();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void metodo1() throws Exception{
        throw new Exception("Erro genérico");
    }
    
    public static void metodo2() throws RuntimeException{
        throw new RuntimeException("Erro em tempo de execução");
    }
}