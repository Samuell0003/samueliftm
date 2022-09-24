/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.elevador;

import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class App {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de andares:");
        int andares = entrada.nextInt();
        System.out.println("Informe a capacidade total:");
        int capacidade = entrada.nextInt();
        Elevador elev = new Elevador(capacidade, andares);
        
        int op;
        do {
            op = menu();
            if (op==1) {
                elev.entrar();
            } else if (op==2) {
                elev.sair();
            } else if (op==3) {
                elev.subir();
            } else if (op==4) {
                elev.descer();
            } else if (op==5) {
                elev.exibir();
            } else if (op==6) {
                break;
            } else {
                System.out.println("Informe uma opcao correta.");
            }
        } while (true);
        
    }
    
    public static int menu() {
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
        System.out.println("3 - Subir");
        System.out.println("4 - Descer");
        System.out.println("5 - Exibir");
        System.out.println("6 - Finalizar");
        
        return entrada.nextInt();
    }
}
