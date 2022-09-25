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
 * Faça um programa em java que leia N números inteiros e armazene-os em um ArrayList. Em seguida, 
 * mostrar na tela todos os números negativos lidos, na ordem do último (posição N-1) ao primeiro (posição 0).
 */
public class exe05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        ArrayList<Integer> numeros = new ArrayList();
        
        for (int i=0; i<num; i++) {
            numeros.add(entrada.nextInt());
        }
     
        for (int i=1; i<=numeros.size(); i++) {
            if (numeros.get(numeros.size()-i)<0) {
                System.out.println(numeros.get(numeros.size()-i));
            }
        }
    }
}
