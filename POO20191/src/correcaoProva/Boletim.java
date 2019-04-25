/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoProva;

import aula8.Aluno;

/**
 *
 * @author paulocesarmelo
 */
public class Boletim {
    
    private double nota1,nota2,nota3,media;
    private Aluno aluno;
    
    public Boletim(){
        
    }
    
    public Boletim(Aluno aluno){
        this.aluno = aluno;
    }
    
    public Boletim(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public void calcularMedia(){
        media = (nota1+nota2+nota3)/3;
    }
    
    public void mostrarResultado(){
        
        if(media >= 6){
            System.out.println("Aprovado!");
        }else if(media >= 5){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
        
    }
    
    public void imprimirBoletim(){
        System.out.println("Nota1: "+this.nota1);
        System.out.println("Nota2: "+this.nota2);
        System.out.println("Nota3: "+this.nota3);
        System.out.println("Media: "+this.media);
        
        this.mostrarResultado();
    }
    
}
