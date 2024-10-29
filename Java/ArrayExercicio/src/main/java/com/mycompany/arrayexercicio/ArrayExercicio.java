/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayexercicio;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CARLOS
 */
public class ArrayExercicio {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");
        
        System.out.println("Lista de Frutas: " + frutas);

        frutas.remove(2); 
        System.out.println("Lista Atualizada de Frutas: " + frutas);

        String frutaParaBuscar = "Manga";
        boolean existe = buscarFruta(frutas, frutaParaBuscar);
        System.out.println("A fruta " + frutaParaBuscar + " está na lista? " + existe);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(7);
        
        Collections.sort(numeros);
        System.out.println("Lista de Números Ordenada: " + numeros);

        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        
        int contagemPares = contarPares(numerosInteiros);
        System.out.println("Quantidade de números pares: " + contagemPares);
    }

    public static boolean buscarFruta(ArrayList<String> lista, String fruta) {
        return lista.contains(fruta);
    }

    public static int contarPares(ArrayList<Integer> lista) {
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
