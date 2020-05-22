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
public class calculoquadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int l1,l2;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o lado um do quadrado:");
        
        l1 = teclado.nextInt();
        
        System.out.println("Informe o lado dois do quadrado: ");
        
        l2 = teclado.nextInt();
        
        System.out.println("A area do quadrado é:"+ (l1*l2));
        
        
        
        
        
        
        
        
        
        
    }
    
}
