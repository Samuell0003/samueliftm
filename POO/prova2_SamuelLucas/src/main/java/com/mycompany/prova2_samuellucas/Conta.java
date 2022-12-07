/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2_samuellucas;

import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class Conta {

    private int numero;
    private Cliente correntista;
    private float saldo;

    public Conta() {

    }

    public Conta(int numero, Cliente cliente, float saldo) {
        this.numero = numero;
        this.correntista = cliente;
        this.saldo = saldo;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        try {
            if (valor > saldo) throw new Validacao("Valor incorreto");
            this.saldo -= valor;
            return true;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    public boolean movimentar(float valor, int op) {
        Scanner entrada = new Scanner(System.in);
        if (op == 1) {
            depositar(valor);
            return true;
        } else {
            do {
                if (sacar(valor)) return true;
                System.out.println("1 - Sair //// Qualquer outro numero para inserir um novo valor:");
                if (entrada.nextInt()== 1) break;
                System.out.println("Novo valor:");
                valor = entrada.nextFloat();
            } while (true);
            return false;
        }
    }
}
