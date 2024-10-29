/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorexercicio;
import java.util.Scanner;
/**
 *
 * @author CARLOS
 */
public class VetorExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Insira 10 valores inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
           
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("\nSoma de todos os valores: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        System.out.println("\nValores inseridos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maior) {
                System.out.print(" (maior)");
            }
            if (numeros[i] == menor) {
                System.out.print(" (menor)");
            }
            System.out.println();
        }

        scanner.close();
    }
}

