/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

/**
 *
 * @author paulocesarmelo
 */
public class Assalariado extends Empregado{

    private double salario;
    
    public Assalariado(String nome) {
        super(nome);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    @Override
    public double vencimento() {
        return salario;
    }

    @Override
    public String toString() {
        return "Assalariado{" + "salario=" + salario + '}';
    }
    
    
    
}
