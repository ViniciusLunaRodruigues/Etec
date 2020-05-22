/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author eunic
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo, nome, valor 
        //int- números inteiros, String- palavras, double- números quebrados
        
        //crie uma variável chamada número, do tipo inteira do valor 10
        int numero= 10;
        // crie uma variavel chamada nome, que armazene o seu nome
        String nome = "Vinicius";
        
        System.out.println("Olá, meu nome é: "+nome+" e o valor da variavel é: "+numero);
        
        
        //--------Operações Matemáticas----------\\
        
       //SOMA, DIVISÃO,SUBTRAÇÃO, MULTIPLICAÇÃO
       
       int resultado; 
       int a = 10;
       int b = 5;
       
       
       //soma
       resultado = a+b;
        System.out.println("A soma de a e b é: "+resultado); 
        
        
        //divisão
                
        resultado = a/b;
        System.out.println("A divisão é A e B é: "+resultado);
        
        //subtração-
        resultado = a-b; 
        System.out.println("A subtração de a e b é "+resultado);
        
        //multiplicação -
        resultado = a*b; 
        System.out.println("A multiplicação de a e b é:"+resultado);
        
    }
    
    
    
}
