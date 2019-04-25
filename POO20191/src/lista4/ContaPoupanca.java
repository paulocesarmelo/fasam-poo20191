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
public class ContaPoupanca  extends Conta{
    
    private int diaD;

    public ContaPoupanca(){
        super.setTipo("Poupança");
    }
    
    public int getDiaD() {
        return diaD;
    }

    public void setDiaD(int diaD) {
        this.diaD = diaD;
    }
    
    
    
}
