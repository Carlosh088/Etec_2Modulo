/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeexcecoes;

/**
 *
 * @author CARLOS
 */
public class MinhaExcecaoA extends Exception{
     public MinhaExcecaoA(String mensagem) {
        super(mensagem);
    }
    public void gerarExcecaoA() throws MinhaExcecaoA {
        throw new MinhaExcecaoA("Exceção do tipo A foi gerada.");
    }
}

