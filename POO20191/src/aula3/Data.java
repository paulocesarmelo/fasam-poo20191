/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author paulocesarmelo
 */
public class Data {
    
    private int dia, mes, ano;
    
    //construtor padrão
    public Data(){
        dia = 0;
        mes = 0;
        ano = 0;
    }
    //construtor personalizado
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void imprimirData(){
        System.out.println(getDia()+"/"+mes+"/"+ano);
    }
    
}
