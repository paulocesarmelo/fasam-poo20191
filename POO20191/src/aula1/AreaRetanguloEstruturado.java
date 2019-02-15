package aula1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class AreaRetanguloEstruturado {
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //variaveis
        double base, altura, area, perimetro;
        
        System.out.println("Digite a altura:");
        altura = entrada.nextDouble();
        
        System.out.println("Digite a base:");
        base = entrada.nextDouble();
        
        area = base * altura;
        perimetro = 2*base + 2*altura;
        
        System.out.printf("Area: %4.2f\n", area);
        System.out.printf("Perimetro: %4.2f", perimetro);
        
    }
}
