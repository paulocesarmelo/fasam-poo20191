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
public class TesteRetangulo {
    
    public static void main(String[] args) {
        
        //Criar objeto do tipo Retangulo
        Retangulo r1 = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a altura:");
        r1.altura = entrada.nextDouble();
        
        System.out.println("Digite a base:");
        r1.base = entrada.nextDouble();
        
        //area = base * altura;
        r1.calcularArea(r1.base, r1.altura);
        //perimetro = 2*base + 2*altura;
        r1.calcularPerimetro();
        
        System.out.printf("Area: %4.2f\n", r1.area);
        System.out.printf("Perimetro: %4.2f", r1.perimetro);
        
    }
    
}
