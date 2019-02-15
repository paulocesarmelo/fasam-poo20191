package lista1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Elevador {
    
    //DEFINIÇÃO 
    
    //atributos => variaveis
    int andarAtual, totalAndares, capacidade, pessoasP;
    
    //metodos
    void inicializa(int capac, int andar){
        andarAtual = 0;
        totalAndares = andar;
        capacidade = capac;
        pessoasP = 0;
    }
    
    void entrar(){
        if(pessoasP < capacidade){
            pessoasP = pessoasP + 1;
            
        }else{
            System.out.println("Não tem espaço!");
        }
    }
    
    void sair(){
        if(pessoasP > 0){
            pessoasP = pessoasP - 1; 
        }else{
            System.out.println("Elevador vazio!");
        }   
    }
    
    void subir(){
        if(andarAtual < totalAndares){
            andarAtual = andarAtual + 1;
        }else{
            System.out.println("Está no último andar!");
        }
    }
    
    void descer(){
        if(andarAtual > 0){
            andarAtual = andarAtual - 1;
        }else{
            System.out.println("Está no térreo!");
        }
    }
    
    void imprimir(){
        System.out.println("Qtd: "+pessoasP);
        System.out.println("Andar: "+andarAtual);
    }
    
}
