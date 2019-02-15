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
public class PrincipalElevador {
    public static void main(String[] args) {
        
        Elevador el = new Elevador();
        
        el.inicializa(10, 10);
        
        el.entrar();
        el.entrar();
        el.entrar();
        
        el.subir();
        el.entrar();
        el.subir();
        el.sair();
        el.subir();
        
        el.imprimir();
        
              
        
        
        
        
        
        
    }
}
