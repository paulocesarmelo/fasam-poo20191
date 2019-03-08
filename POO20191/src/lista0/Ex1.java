/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista0;

/**
 *
 * @author paulocesarmelo
 */
public class Ex1 {
    
    public static int maior(int n1, int n2){
        
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(maior(2, 3));
        
    }
    
}
