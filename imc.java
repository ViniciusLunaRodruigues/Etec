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
public class imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double peso;
        double altura;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Informe o seu peso:");
        
        peso = leia.nextDouble();
        
        System.out.println("informe sua altura");
        
        altura = leia.nextDouble();
        
        double imc;
        imc = peso / (altura*altura);
        
        System.out.println("Seu imc é: "+ imc);
                
        
        
        
        
        
        
        
        
        
    }
    
}
