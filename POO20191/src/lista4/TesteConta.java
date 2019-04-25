/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author paulocesarmelo
 */
public class TesteConta {
    
    public static void main(String[] args) {
        
        ContaEspecial ce = new ContaEspecial();
        ContaPoupanca cp = new ContaPoupanca();
        
        ce.setSaldo(1000);
        cp.setSaldo(2000);
        
        ce.setLimite(100);
        
        cp.setDiaD(5);
        
        cp.sacar(100);
        ce.sacar(1050);
        
        System.out.println("Saldo CP: "+cp.getSaldo());
        System.out.println("Saldo CE: "+(ce.getSaldo()+ce.getLimite()));
        System.out.println("Saldo sem Limite CE: "+ce.getSaldo());
        
        
        
        
        
    }
    
}
