/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import aula3.Data;
import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class TesteData {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Data nascimento = new Data();
        
        System.out.println("Dia:");
        nascimento.setDia(input.nextInt());
        
        System.out.println("Mes:");
        int mes = input.nextInt();
        System.out.println("Ano:");
        int ano = input.nextInt();
        
        
        
        
        
        
        
        nascimento.imprimirData();
        
        
        
    }
    
    
}
