/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        
        boolean flag;
        int i;
        do{
            flag = false;
            try{
                 i = input.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Digite somente numerais!");
                flag = true;
                input.nextLine();
            }
        
        }while(flag);
        
        System.out.println("Parabéns ... vc digitou um numeral!");
        
        /*System.out.println("Inicio do main");
        
        metodo1();
        
        System.out.println("Fim do main");*/
        
    }
    
    public static void metodo1(){
        System.out.println("Inicio do metodo1");
        
        //double n = 2/0;
        
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    public static void metodo2(){
        
        System.out.println("Inicio do metodo2");
        
        int vetor[] = new int[10];
   
        
            for(int i=0; i<=10; i++){
                vetor[i] = i;

                System.out.println(vetor[i]);
            }
            
        
        
        System.out.println("Fim do metodo2");
        
    }
    
}
