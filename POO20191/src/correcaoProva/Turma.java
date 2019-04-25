/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoProva;

import aula8.Professor;
import aula8.Aluno;

/**
 *
 * @author paulocesarmelo
 */
public class Turma {
    
    private int id, sala;
    private String descricao, horario;
    private Professor professor;
    private Aluno[] alunos = new Aluno[3];
    
    
    public Turma(){
        
    }
   
    public Turma(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public void adicionarAluno(Aluno aluno, int posicao){
        this.alunos[posicao] = aluno;
    }
    
    
    
    public void imprimirTurma(){
        System.out.println("ID: "+this.id);
        System.out.println("Descricao: "+this.descricao);
        System.out.println("Sala: "+this.sala);
        System.out.println("Horario: "+this.horario);
        
        this.professor.imprimir();
        
        //imprimir os alunos
        for(int i=0; i<alunos.length; i++){
            this.alunos[i].imprimir();
        }
    }
    
}
