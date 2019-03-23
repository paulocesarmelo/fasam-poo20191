/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author paulocesarmelo
 */
public class Cliente {
    
    private String nome, tel, end;
    private Paciente[] pacientes = new Paciente[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
    
    public void addPaciente(Paciente pct, int pos){
        pacientes[pos] = new Paciente();
        pacientes[pos] = pct;
    }
    
    public void setTamaVetor(int tam){
        pacientes = new Paciente[tam];
    }
    
    public void imprimir(){
        System.out.println(nome);
        System.out.println(tel);
        System.out.println(end);
        
        this.imprimirPacientes();
        
    }
    
    public void imprimirPacientes(){
        System.out.println(pacientes.length);
        
        for(int i=0; i < pacientes.length; i++){
            pacientes[i].imprimir();
        }
        
    }
    
}
