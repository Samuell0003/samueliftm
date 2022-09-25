/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosreplitarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 * 
 * Faça um programa em java que leia N números inteiros e armazene-os em um ArrayList. Em seguida, mostre na tela: 
 * todos os números pares
 * a quantidade de números pares
 */
public class exe06 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int num = entrada.nextInt();
        ArrayList<Integer> numeros = new ArrayList();
        
        for (int i=0; i<num; i++) {
            numeros.add(entrada.nextInt());
        }
        int cont=0;
        for (int i=0; i<numeros.size(); i++) {
            if (numeros.get(i)%2 == 0) {
                System.out.println(numeros.get(i));
                cont++;
            }
        }
        //quantidade de números pares.
        System.out.println(cont);
    }
}
