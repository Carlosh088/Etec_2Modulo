/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nomearray;
import java.util.Scanner;
/**
 *
 * @author CARLOS
 */
public class NomeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; 
        int contador = 0; 

        while (contador < nomes.length) {
            System.out.println("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break; 
            }

            nomes[contador] = nome; 
            contador++; 
        }
        
        System.out.println("\nNomes armazenados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(nomes[i]);
        }

        scanner.close(); 
    }
}
