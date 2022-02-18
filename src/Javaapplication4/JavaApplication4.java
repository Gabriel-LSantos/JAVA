
package Javaapplication4;

import javax.swing.JOptionPane;


public class JavaApplication4 {

 
    public static void main(String[] args) {
     String nome, endereco, telefone;

       nome = JOptionPane.showInputDialog ("Qual seu nome?");
       endereco = JOptionPane.showInputDialog ("Qual seu endereço");
       telefone = JOptionPane.showInputDialog ("Qual seu contato telefônico");

       System.out.println(nome);
       System.out.println(endereco);
       System.out.println(telefone);

  
    }
    
}
