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
public class Principal {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        
        c1.setNome("Paulo");
        c1.setTel("6258974985");
        c1.setEnd("Rua X n Y");
        
        Paciente paciente1 = new Paciente();
        
        paciente1.setNome("Marley");
        paciente1.setRaca("vira-lata");
        
        Paciente paciente2 = new Paciente();
        
        paciente2.setNome("Bob");
        paciente2.setRaca("chow-chow");
        
        c1.addPaciente(paciente1, 0);
        c1.addPaciente(paciente2, 1);
        
        c1.setTamaVetor(2);
        
        c1.imprimir();
        
    }
    
}
