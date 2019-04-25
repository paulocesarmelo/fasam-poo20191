/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author paulocesarmelo
 */
public class Agenda {
    
    //Atributos
    private String[] nomes;
    
    //Construtor(es)
    //Padrão
    public Agenda(){
        nomes = new String[10];
    }
    
    
    //Construtor personalizado
    public Agenda(int tam){
        nomes = new String[tam];
    }
    
    public Agenda(String[] nomes){
        this.nomes = nomes;
    }
    
    //Modificadores e seletores
    
    public void setNomes(String[] nomes){
        this.nomes = nomes;
    }
    
    public String[] getNomes(){
        return this.nomes;
    }
    
    //Demais métodos
    public void armazenarNome(String nome, int pos){
        this.nomes[pos] = nome;
    }
    
    public void removerNome(int pos){
        this.nomes[pos] = "";
    }
    
    /*
    * Desafio: Corrigir método remover
    * comparação com elemento nulo
    */
    
    public void removerNome(String nome){
        
        boolean encontrou = false;
        
        for(int i=0; i<10; i++){
            
            if( !(this.nomes[i].equals(null) )){
                if(this.nomes[i].equals(nome)){
                    this.nomes[i] = "";
                    encontrou = true;
                } 
            }
            
        }
        
        if(encontrou == false){
            System.out.println("Nome não encontrado!");
        }
    }
    
    public void buscarNome(String nome){
        
        for(int i=0; i<10; i++){
            
            if(this.nomes[i].equals(nome)){
                System.out.println(nomes[i]+" encontrado na posicao: "+i);
            } 
            
        }
        
    }
    
    public void imprimirNomes(){
        for(int i=0; i<10; i++){
            System.out.println(nomes[i]);
        }
    }
    
}
