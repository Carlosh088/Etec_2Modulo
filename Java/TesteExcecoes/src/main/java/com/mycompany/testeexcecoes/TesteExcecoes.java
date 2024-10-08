/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeexcecoes;

/**
 *
 * @author CARLOS
 */
public class TesteExcecoes {

    public static void main(String[] args) {
         MinhaExcecaoA excecaoA = new MinhaExcecaoA("Exceção A");
        MinhaExcecaoB excecaoB = new MinhaExcecaoB("Exceção B");
        try {
            excecaoA.gerarExcecaoA();
        } catch (MinhaExcecaoA e) {
            System.out.println("Tratando: " + e.getMessage());
        }
        try {
            excecaoB.gerarExcecaoB();
        } catch (MinhaExcecaoB e) {
            System.out.println("Tratando: " + e.getMessage());
        }
    }
}
    