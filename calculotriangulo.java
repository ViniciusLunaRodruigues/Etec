/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author eunic
 */
public class calculotriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int b,h,area;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor de b:");
        
        b = teclado.nextInt();
       
        System.out.println("Informe o valor h:");
        
        h = teclado.nextInt();
        
        System.out.println("O valor da area do triângulo é:" +(b+h)/2);
        
        
        
                
        
        
        
        
        
    }
    
}
