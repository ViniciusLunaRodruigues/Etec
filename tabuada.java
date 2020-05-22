/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eunic
 */
public class tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada:");
        valor=teclado.nextInt();
       
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor+ " x "+i+" = "+ (valor*i));
                    
        }
       
        
        
        
        
        
        
        
        
        
    }
    
}
