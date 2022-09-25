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
 * Escreva um programa em java que receba n nomes diferentes do usuário. 
 * Todos os nomes deverão ser armazenados em um ArrayList tipado para String. 
 * O programa deverá dar ao usuário a opção de excluir um único nome da lista , com valores entre 1 e n,
 */
public class exe02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        ArrayList<String> nomes = new ArrayList();
        entrada.nextLine();
        for (int i=0; i<num; i++) {
            nomes.add(entrada.nextLine());
        }
        
        nomes.remove(entrada.nextInt()-1);
        
        for (int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        
    }
}
