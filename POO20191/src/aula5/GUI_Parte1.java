/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class GUI_Parte1 {
    public static void main(String[] args) {     
          
        String texto = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, texto);
        
        String idadeString = JOptionPane.showInputDialog("Digite sua idade:");
        
        int idade = Integer.parseInt(idadeString);
        
        //Conversões
        /*
        * int -- Integer.parseInt(String)
        * double -- Double.parseDouble(String)
        * float -- Float.parseFloat(String)
        */
        
    }
}
