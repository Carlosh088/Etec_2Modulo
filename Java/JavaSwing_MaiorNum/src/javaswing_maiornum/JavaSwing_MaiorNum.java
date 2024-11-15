/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing_maiornum;
import javax.swing.JOptionPane;
/**
 *
 * @author CARLOS
 */
public class JavaSwing_MaiorNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
        }
    }
    
}
