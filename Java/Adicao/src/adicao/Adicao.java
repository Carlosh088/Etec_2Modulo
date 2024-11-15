/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adicao;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Adicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Entrada de dados
        String n1;
        String n2;
        
        int num1;
        int num2;
        int soma;
        
        //Leitura com JOptionPane
        n1 = JOptionPane.showInputDialog("Digite o primairo número: ");
        n2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        
        //Conversão de String para int
        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);
        
        //Soma os números
        soma = num1 + num2;
        
        //Resposta
        JOptionPane.showMessageDialog(null, "A soma é " +soma, "Resultado:", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
        
    }
    
}
