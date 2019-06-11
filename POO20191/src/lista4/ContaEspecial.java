/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import aula2.Conta;

/**
 *
 * @author paulocesarmelo
 */
public class ContaEspecial extends Conta{
    
    private double limite;
    
    public ContaEspecial(){
        super.setTipo("Conta Especial");
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    @Override
    public boolean sacar(double valor){
        
        double saldoAtual = super.getSaldo() + this.limite;
        double temp;
        
        
        if(saldoAtual > valor){
            
            temp = super.getSaldo() - valor;
            
            if(temp < 0){
                this.limite = temp + this.limite;
                super.setSaldo(0);
            }else{
                super.setSaldo(temp);
            }
         return true;  
        }
        return false;
        
    }
    
    
}
