package aula3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Pessoa {
    
    //atributos
    double altura, peso;
    int idade;
    String nome, genero, raca, cpf;
    
    //métodos
    void andar(int qtdPassos){
        System.out.println("Andando "+qtdPassos+ " passos");
    }
    
    void fazerRegistro(String nomeEscolhido){ 
        this.nome = nomeEscolhido;
        this.imprimirPessoa();
    }
    
    void imprimirPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
    }
}
