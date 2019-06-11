/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        //Empregado e1 = new Empregado("João"); ERRADO
        
        Scanner input = new Scanner(System.in);
        
        Horista empregadoHorista = new Horista("João da Silva");
        
        empregadoHorista.setCpf("231414");
        empregadoHorista.setValorHora(90);
        empregadoHorista.setHoras(80);
        
        System.out.println(empregadoHorista.vencimento());
        
        
        
        
        
        
        
        
        
        /*
        
        Assalariado a1 = new Assalariado("Paulo");

        a1.setCpf("2312413");
        a1.setSobrenome("Melo");
        
        Empregado e1 = new Assalariado("Fulano");
        
        e1.setCpf("1234");
        e1.setSobrenome("De Tal");
        
        //e1.setSalario(1000);
        
        System.out.println("a1");
        System.out.println(a1.toString());
        
        System.out.println("e1");
        System.out.println(e1.toString());
        System.out.println(e1.vencimento()); 
        
        int op = input.nextInt();
        
        switch(op){
            case 1: 
                
                e1 = new Comissionado("P");
                
                break;
                
            case 2:
                e1 = new Assalariado("X");
                break;
            
            default:
                System.out.println("opcao invalida");
        }
        
        if(e1 instanceof Assalariado){
            System.out.println("e1 é assalariado");
        }else if(e1 instanceof Comissionado){
            System.out.println("e1 é comissionado");
        }
        
        Empregado[] empregados = new Empregado[5];
        
        empregados[0] = new Assalariado("Beltrano");
        empregados[1] = new Comissionado("YYY");
        */
    }
}
