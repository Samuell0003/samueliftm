/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tratamentoexcecoes;

import java.util.Scanner;

/***
1) Faça um programa em java que leia do usuário o valor de um determinado saque
bancário que ele deseja fazer. Ocorre que devido ao contexto atual o
usuário só pode sacar no máximo R$400,00. Sendo assim, se o saque for
maior isso deverá ser visto como uma exceção do tipo
IllegalArgumentException que deverá ser tratada no próprio método main( )
com uma mensagem "SAQUE INVÁLIDO".  O lançamento da exceção deverá ser
feito por você em um método chamado saque( ). Caso o saque seja
permitido, esse método deverá exibir a mensagem do tipo: "Saque
realizado de ????? reais.
 * @author samuel.lucas
 */
public class TratamentoExcecoes {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            System.out.println("Valor do saque:");
            int valor = entrada.nextInt();
            if(valor>400) {
                throw new IllegalArgumentException("SAQUE INVÁLIDO");
            }
            sacar(valor);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void sacar(int valor) {
        System.out.println("Saque realizado de "+ valor);
    }
}
