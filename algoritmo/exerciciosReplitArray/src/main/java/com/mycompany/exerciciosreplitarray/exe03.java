/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciosreplitarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 * Escreva um programa em java que receba n textos do usuário. Todos os textos deverão ser armazenados em um ArrayList tipado para String.

    Então, o programa deverá gerar um novo texto em maiúsculas contendo a primeira palavra de cada um dos n textos digitadas.
 */
public class exe03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        ArrayList<String> nome = new ArrayList();
        entrada.nextLine();
        for (int i=0;i < op;i++) {
            nome.add(entrada.nextLine());
        }
        StringBuilder newNome = new StringBuilder();
        for (int i=0; i < nome.size(); i++) {
            String vetNome[] = nome.get(i).split(" ");
            if (i<nome.size()-1) {
              newNome.append(vetNome[0].toUpperCase()+" ");
            } else {
              newNome.append(vetNome[0].toUpperCase());
            }
        }
        //O programa deverá imprimir a quantidade de frases, considerando a nova frase, bem como a própria frase gerada.
        op++;
        System.out.println("Total de frases : "+op);
        System.out.println(newNome);
    }
}
