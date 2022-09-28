/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package prova1_samuellucas_q1;

import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class App {

    public static void main(String[] args) {

        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Numero conta: ");
        String numeroConta = entrada.next();
        System.out.println("Saldo:");
        double saldo = entrada.nextDouble();
        System.out.println("Tipo conta:");
        System.out.println("1 - Especial");
        System.out.println("2 - Comum");
        int tipo = entrada.nextInt();
        String tipoConta;
        if (tipo == 1) {
            tipoConta = "especial";
            System.out.println("Saldo Especial:");
            double limiteEspecial = entrada.nextDouble();
            ContaCorrente cont = new ContaCorrente(nome, numeroConta, saldo, tipoConta, limiteEspecial);
            do {
                op = menu();
                if (op == 1) {
                    System.out.println("Informe o valor:");
                    double valor = entrada.nextDouble();
                    if (!cont.sacarEspecial(valor)) {
                        System.out.println("Saldo insuficiente.");
                    }
                    
                } else if (op == 2) {
                    System.out.println("Informe o valor:");
                    double valor = entrada.nextDouble();
                    cont.depositar(valor);
                } else if (op == 3) {
                    cont.exibir();
                }
            } while (true);

        } else if (tipo == 2) {
            tipoConta = "comum";
            ContaCorrente cont = new ContaCorrente(nome, numeroConta, saldo, tipoConta);
            do {
                op = menu();
                if (op == 1) {
                    System.out.println("Informe o valor:");
                    double valor = entrada.nextDouble();               
                    if (!cont.sacarComum(valor)) {
                        System.out.println("Saldo insuficiente.");
                    }
                } else if (op == 2) {
                    System.out.println("Informe o valor:");
                    double valor = entrada.nextDouble();
                    cont.depositar(valor);
                } else if (op == 3) {
                    cont.exibir();
                } else if (op==4) {
                    break;
                }
            } while (true);

        }

    }

    public static int menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Exibir");
        System.out.println("4 - Sair");

        return entrada.nextInt();
    }
}
