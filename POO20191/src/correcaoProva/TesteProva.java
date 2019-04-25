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
public class TesteProva {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        
        Professor p1 = new Professor();
              
        Boletim b1 = new Boletim(10, 7, 6);
        Boletim b2 = new Boletim(8, 5, 5);
        Boletim b3 = new Boletim(1, 2, 3);
        
        b1.setAluno(a1);
        b2.setAluno(a2);
        b3.setAluno(a3);
        
        Turma turma = new Turma(1, "POO");
        
        turma.setProfessor(p1);
        
        turma.adicionarAluno(a1, 0);
        turma.adicionarAluno(a2, 1);
        turma.adicionarAluno(a3, 2);
        
        turma.imprimirTurma();
   
        b1.calcularMedia();
        b2.calcularMedia();
        b3.calcularMedia();
        
        b1.imprimirBoletim();
        b2.imprimirBoletim();
        b3.imprimirBoletim();
        
    }
    
}
