/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeexcecoes;

/**
 *
 * @author CARLOS
 */
public class MinhaExcecaoB extends Exception{
     public MinhaExcecaoB(String mensagem) {
        super(mensagem); 
    }
    public void gerarExcecaoB() throws MinhaExcecaoB {
        throw new MinhaExcecaoB("Exceção do tipo B foi gerada.");
    }
}

