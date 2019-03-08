/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class TesteFormaGeometrica {
    
    public static void main(String[] args) {
        
        FormaGeometrica forma = new FormaGeometrica();
             
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a opção para calcular a área:");
        System.out.println("(1) Quadrado");
        System.out.println("(2) Triângulo");
        int op = input.nextInt();
        
        if(op == 1){
            System.out.println("Lado:");
            double l = input.nextDouble();
            
            //Chama (invoca) o método calcular a área do quadrado
            forma.calcularArea(l);
        
        }else if(op == 2){
            System.out.println("Base:");
            double b = input.nextDouble();
            System.out.println("Altura: ");
            double h = input.nextDouble();
            
            //Chama (invoca) o método calcular a área do triangulo
            forma.calcularArea(b,h);
            
        }else{
            System.out.println("Opção inválida!");
        }
        
        //Imprimir a área
        System.out.println("Área: "+forma.getArea());
        
    }
    
}
