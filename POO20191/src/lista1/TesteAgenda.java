/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class TesteAgenda {
    public static void main(String[] args) {
        
        Agenda agenda1 = new Agenda();
        
        agenda1.armazenarNome("Fulano", 0);
        agenda1.armazenarNome("Beltrano", 1);
        agenda1.armazenarNome("Ciclano", 3);
        
        agenda1.imprimirNomes();
        
        agenda1.removerNome(1);
        
        agenda1.imprimirNomes();
        
        JOptionPane.showMessageDialog(null, "Programa Finalizado");
        System.out.println("");
        
        String texto = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
