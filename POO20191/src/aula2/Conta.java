package aula2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Conta {
    
    //atributos
    private double saldo;
    private int num, agencia;
    private String proprietario, tipo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    //métodos
    // tipoDeRetorno nomeDoMetodo (parametros) 
    // parametros = variaveis
    public double consultarSaldo(){
        return saldo;
    }
    
    public void transferir(double valor, int numConta, int agencia){
        //implementacao na proxima aula
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }
    
    
}
