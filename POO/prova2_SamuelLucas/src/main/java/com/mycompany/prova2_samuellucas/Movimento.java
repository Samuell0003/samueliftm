/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2_samuellucas;

import java.util.Date;

/**
 *
 * @author samuel.lucas
 */
public class Movimento {
    private Date data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;
    
    static int SACAR = 0;
    
    static int DEPOSITAR = 1;
    
    public Movimento(Date data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Conta getConta() {
        return conta;
    }

    public Date getData() {
        return data;
    }

    public String getHistorico() {
        return historico;
    }

    public int getOperacao() {
        return operacao;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public float getValor() {
        return valor;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean movimentar() {
        saldoAnterior = conta.getSaldo();
        return conta.movimentar(valor, operacao);
    }
}
