/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_exe6;

/**
 *
 * @author paulocesarmelo
 */
public class Cidade {
    
    //Atributos
    private int cod = 0;
    private int nAcidentes;
    private long nVeiculos;
    private String nome, estado;
    
    //Construtor
    public Cidade(){
        
    }
    
    public Cidade(int cod){
        this.cod = cod;
    }
    
    //Seletores (get) e Modificadores (set)
    public int getCod() {
        return cod;
    }

    public  void setCod(int cod) {
        this.cod = cod;
    }

    public int getnAcidentes() {
        return nAcidentes;
    }

    public void setnAcidentes(int nAcidentes) {
        this.nAcidentes = nAcidentes;
    }

    public long getnVeiculos() {
        return nVeiculos;
    }

    public void setnVeiculos(long nVeiculos) {
        this.nVeiculos = nVeiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Impressão
    public void imprimir(){
        System.out.println(this.cod);
        System.out.println(this.nome);
        System.out.println(this.estado);
        System.out.println(this.nAcidentes);
        System.out.println(this.nVeiculos);
    }
    
}
