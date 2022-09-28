/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1_samuellucas_q1;

import java.util.ArrayList;

/**
 *
 * @author samuel.lucas
 */
public class ContaCorrente {
    private String nome;
    private String numeroConta;
    private double saldo;
    private String tipoConta;
    private double limiteEspecial;
    
    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta, double limiteEspecial) {
        this.nome=nome;
        this.numeroConta=numeroConta;
        this.saldo=saldo;
        this.tipoConta=tipoConta;
        this.limiteEspecial=limiteEspecial;
    }
    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta) {
        this.nome=nome;
        this.numeroConta=numeroConta;
        this.saldo=saldo;
        this.tipoConta=tipoConta;
    }

    public void exibir() {
        System.out.println("Nome:"+ nome);
        System.out.println("Numero da conta:"+ numeroConta);
        System.out.println("Tipo de conta:"+ tipoConta);
        if (tipoConta.equals("especial")) {
             System.out.printf("Limite: %.2f \n", limiteEspecial);
        }
       
        System.out.printf("Saldo: %.2f \n", saldo);
    }
    public void depositar (double valor) {
        valor -= valor*0.001; 
        if (valor>0) {
            saldo+=valor;
        } else {
            System.out.println("Valor invalido");
        }
    }
    public boolean sacarComum(double valor) {
        valor = valor*1.001;
        
        if (valor<saldo) {
            saldo-=valor;
            return true;
        } 
        return false;
    }
    
    public boolean sacarEspecial(double valor) {
        valor = valor*1.002;
        double limite = 0-limiteEspecial;
       
        if (saldo-valor>=limite && valor>0) {
            saldo-=valor;
            return true;
        } 
        return false;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }
    
    
}
