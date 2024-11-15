/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing_positivo_negativo_zero;
import javax.swing.JOptionPane;
/**
 *
 * @author CARLOS
 */
public class JavaSwing_Positivo_Negativo_Zero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        String input = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(input);
        
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é positivo.");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }    
}
