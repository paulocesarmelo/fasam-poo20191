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
public abstract class Empregado {
    
    private String nome, sobrenome, cpf;
    
    public Empregado(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double vencimento();
    
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + '}';
    }
    
    
    
}
