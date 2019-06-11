package aula2;









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
        
        Scanner input = new Scanner(System.in);
        
        //Instanciar um objeto do tipo (da classe) Conta
        //Nome da classe (Conta)
        //identificador do objeto (c1)
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
               
       /* c1.saldo = 1000;
        c2.saldo = 10000;
        c3.saldo = -10;*/
        double salario=0;
        if(c2.sacar(3000)){
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não realizado!");
        }
        
        System.out.println(c2.consultarSaldo());
        
        
    }
    
}
