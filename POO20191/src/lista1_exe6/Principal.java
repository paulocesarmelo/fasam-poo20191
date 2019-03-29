/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_exe6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Cidade> cidades = new ArrayList<Cidade>(5);
       
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<2; i++){
            
            Cidade cidade = new Cidade();
            
            System.out.println("Informe o código: ");
            int cod = input.nextInt();
            cidade.setCod(cod);
            
            System.out.println("Informe o nome da cidade: ");
            String nome = input.next();
            cidade.setNome(nome);
            
            System.out.println("Informe o estado: ");
            String estado = input.next();
            cidade.setEstado(estado);
            
            System.out.println("Informe a qtd acidentes: ");
            int nAcid = input.nextInt();
            cidade.setnAcidentes(nAcid);
            
            System.out.println("Informe a qtd de veiculos: ");
            long qtdVeic = input.nextLong();
            cidade.setnVeiculos(qtdVeic);
            
            //Guardando o obj cidade no arraylist
            cidades.add(cidade);
            
        }
        
        maiorNAcidentes(cidades);
        menorNAcidentes(cidades);
        mediaAcidentes(cidades);
        mediaVeiculos(cidades);
        
    }
    
    public static void maiorNAcidentes(ArrayList<Cidade> cidades){
        
        int maior = 0;
        int posMaior = 0;
        
        for(int i=0; i<cidades.size(); i++){
            
            int n = cidades.get(i).getnAcidentes();
            
            if(n > maior){
                maior = n;
                posMaior = i;
            }  
        }
        
        String nome = cidades.get(posMaior).getNome();
        int codigo = cidades.get(posMaior).getCod();
        
        System.out.println("Nome: "+nome);
        System.out.println("Cod: "+codigo);
        
        //cidades.get(posMaior).imprimir();
        
    }
    
    public static void menorNAcidentes(ArrayList<Cidade> cidades){
        
        int menor = cidades.get(0).getnAcidentes();
        int posMenor = 0;
        
        for(int i=1; i<cidades.size(); i++){
            
            int n = cidades.get(i).getnAcidentes();
            
            if(n < menor){
                menor = n;
                posMenor = i;
            }  
        }
        
        String nome = cidades.get(posMenor).getNome();
        int codigo = cidades.get(posMenor).getCod();
        
        System.out.println("Nome: "+nome);
        System.out.println("Cod: "+codigo);
        
        //cidades.get(posMaior).imprimir();
        
    }
    
    public static void mediaVeiculos(ArrayList<Cidade> cidades){
        
        long soma = 0;
        
        for(int i=0; i<cidades.size(); i++){
            
            soma += cidades.get(i).getnVeiculos();
            
        }       
             
        double media = soma/cidades.size();
        
        System.out.println("Media de veiculos: "+media);
        
    }

    public static void mediaAcidentes(ArrayList<Cidade> cidades){
        
        int soma = 0;
        
        for(int i=0; i<cidades.size(); i++){
            
            if(cidades.get(i).getEstado().equals("GO")){
                soma += cidades.get(i).getnAcidentes();
            }             
            
        }       
             
        double media = soma/cidades.size();
        
        System.out.println("Media de acidentes de GO: "+media);
        
    }
    
}
