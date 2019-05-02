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
public class Comissionado extends Empregado{

    private int totalVendas;
    private double taxaComissao;
    
    public Comissionado(String nome) {
        super(nome);
    }

    @Override
    public double vencimento() {
        return totalVendas * taxaComissao;
    }
    
}
