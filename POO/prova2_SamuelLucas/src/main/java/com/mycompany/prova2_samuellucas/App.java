/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prova2_samuellucas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Transacao transacao = new Transacao();
        Cliente cliente = new Cliente("Samuel", "1234455667");
        Conta conta = new Conta(1, cliente, 450);
        float saldoAnterior = conta.getSaldo();

        transacao.realizarTransacao(new Date(), conta, 100, "Deposito em dinheiro", Movimento.DEPOSITAR);
        transacao.realizarTransacao(new Date(), conta, 50, "Pagamento conta luz", Movimento.SACAR);
        transacao.realizarTransacao(new Date(), conta, 120, "Pagamento conta telefone", Movimento.SACAR);
        transacao.realizarTransacao(new Date(), conta, 850, "Transferencia entre contas ", Movimento.DEPOSITAR);
        

        System.out.println("Deseja ver extrato?");
        System.out.println("1 - Sim / 2 - Nao");
        int op = entrada.nextInt();
        if (op == 1) {
            try {
                System.out.println("Informe o usuario:");
                String user = entrada.next();
                System.out.println("Informe a senha:");
                String pass = entrada.next();
                if (!(user.equals("admin") && pass.equals("admin"))) {
                    throw new Validacao(user, pass);
                }
                System.out.println();
                System.out.println("Emitando Extrato da Conta Número: " + conta.getNumero());
                System.out.println("Correntista: " + conta.getCorrentista().getNome());
                System.out.println("Saldo anterior: "+ saldoAnterior);
                for (Movimento mov : transacao.getMovimentos()) {
                    System.out.println("----------------------");
                    System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(mov.getData()));
                    System.out.println("Historico: "+mov.getHistorico());
                    System.out.println("Valor: "+mov.getValor());
                    if (mov.getOperacao() == 1) {
                        System.out.println("Operacao: Deposito");

                    } else if (mov.getOperacao() == 0) {
                        System.out.println("Operacao: Saque");
                    }

                }
                System.out.println("----------------------");

                System.out.println("Saldo atual: "+conta.getSaldo());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
