package aula1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Retangulo {
    
    //atributos
    double base, altura, area, perimetro;
    
    //métodos
    double calcularArea(double base, double altura){
        area = base * altura;
        return area;
    }
    
    double calcularPerimetro(){
        perimetro = 2*base + 2*altura;
        return perimetro;
    }
}
