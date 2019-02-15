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
    double saldo, limite;
    int num, agencia;
    String proprietario, tipo;
    
    
    //métodos
    // tipoDeRetorno nomeDoMetodo (parametros) 
    // parametros = variaveis
    double consultarSaldo(){
        return saldo;
    }
    
    void transferir(double valor, int numConta, int agencia){
        //implementacao na proxima aula
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }
    
    
}
