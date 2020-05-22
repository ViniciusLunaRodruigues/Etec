/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import javax.swing.JOptionPane;

/**
 *
 * @author eunic
 */
public class tarefatp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome;
        float n1,n2,n3,n4,media = 0;
       
        
        
        nome=JOptionPane.showInputDialog(null,"Digite o nome do aluno");
        n1=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        n2=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        n3=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
        n4=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quarta nota"));
       
        media=(n1+n2+n3+n4)/4;
        
        JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " é " + media);
        
        
        
        
       
               
    }
    
}
