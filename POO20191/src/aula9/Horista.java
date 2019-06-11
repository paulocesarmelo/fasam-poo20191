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
public class Horista extends Empregado{

    private double horas, valorHora;
    
    public Horista(String nome) {
        super(nome);
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    
    
    @Override
    public double vencimento() {
        return valorHora * horas;
    }
    
    
    
}
