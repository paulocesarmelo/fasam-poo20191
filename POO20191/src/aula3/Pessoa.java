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
    private double altura, peso;
    private int idade;
    private String nome, genero, raca, cpf;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
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
