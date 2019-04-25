/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import correcaoProva.Turma;

/**
 *
 * @author paulocesarmelo
 */
public class Aluno extends Pessoa{
    
    private int mat;    
    private Turma turma;
    
    public Aluno(){
        mat = 0;
    }
    
    public Aluno(int mat){
        this.mat = mat;
    }
    
    public Aluno(String nome){
        super(nome);
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void imprimir(){
        System.out.println("Mat: "+this.mat);
        
        super.imprimir();
        
        //this.turma.imprimirTurma();
    }
    
    
}
