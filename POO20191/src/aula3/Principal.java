package aula3;


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
public class Principal {
    public static void main(String[] args) {
        
        //1º criar um objeto
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        Scanner entrada = new Scanner(System.in);
        
        pessoa1.andar(entrada.nextInt());
        pessoa2.andar(1000);
    }
}
