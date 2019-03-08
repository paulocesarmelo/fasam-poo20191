/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import aula3.Pessoa;
import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class ManipulacaoVetor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
               
        //Declarando um vetor de inteiros de 5 posições
        int[] numeros = new int[5];
        
        //Declarando um vetor de números decimais
        double[] decimais;
        int tamanho;
        
        //Obtendo o tamanho do vetor
        System.out.println("Informe o tamanho do vetor de decimais: ");
        tamanho = input.nextInt();
        
        //Definindo o tamanho do meu vetor de decimais
        decimais = new double[tamanho];
        
        
        //Preenchendo o vetor de inteiros
        for(int i=0; i<5; i++){
            System.out.println("Digite o numero da posição "+i);
            numeros[i] = input.nextInt();
        }
        
        
        /*
        * Descobrir o maior número do vetor de inteiros
        */
        
        int maior = numeros[0];
        int posicao = 0;
        
        for(int i=1; i<5; i++){
            
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }
        
        System.out.println("O maior elemento é: "+maior);
        System.out.println("Posição: "+posicao);
        
        
        /*
        * Combinando vetor e Objeto
        */
        Pessoa[] pessoas = new Pessoa[5];
        
        String nome;
        
        for(int i=0; i<5; i++){
            pessoas[i] = new Pessoa();
            System.out.println("Digite o nome da pessoa da posição "+i);
            nome = input.nextLine();
            pessoas[i].setNome(nome);
        }
        
        
        
    }
    
}
