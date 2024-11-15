/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing_par_impar;
import javax.swing.JOptionPane;
/**
 *
 * @author CARLOS
 */
public class JavaSwing_Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        String input = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(input);
                
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar.");
        }
    }
    
}
