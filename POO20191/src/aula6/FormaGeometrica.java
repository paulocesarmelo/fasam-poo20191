/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author paulocesarmelo
 */
public class FormaGeometrica {
    
    private double area;
    
    public void setArea(double area){
        if(area > 0){
            this.area = area;
        }else{
            System.out.println("Area informada é negativa!");
        }       
    }
    
    public double getArea(){
        return area;
    }
    
    /*
    * Exemplo de sobrecarga de método
    * Sobrecarga de método é caracterizada por:
    * métodos com mesmo tipo de retorno, mesmo nome e parâmetros diferentes
    * os parâmetros podem variar em tipo e/ou quantidade
    */
    public void calcularArea(double lado){
        area = lado*lado;
    }
    
    public void calcularArea(double base, double altura){
        area = (base*altura)/2;
    }
    
}
