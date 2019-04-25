/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author paulocesarmelo
 */
public class Professor extends Pessoa{
    
    private int mat;
    private String titulacao;
    
    public Professor(){
        
    }
    
    public Professor(int mat){
        this.mat = mat;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    public void imprimir(){
        System.out.println("Mat: "+this.mat);
        System.out.println("Titulação: "+this.titulacao);
        
        super.imprimir();
    }
    
}
