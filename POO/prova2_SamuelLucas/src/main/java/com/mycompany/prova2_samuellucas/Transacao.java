/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2_samuellucas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author samuel.lucas
 */
public class Transacao {
    private ArrayList<Movimento> movimentos = new ArrayList<>(); 
    
    public Transacao() {
        this.movimentos = new ArrayList<>();
    }
    
    public boolean realizarTransacao(Date date, Conta conta, float valor , String s, int op) {
        Movimento mov = new Movimento(date, conta, s, valor, op);
        boolean ojp = mov.movimentar();
        if (ojp) {
            movimentos.add(mov);
            return true;
        } else {
            return false;
        }
    }
    
    public void estornarTransacao() {
        for (int i=0; i < movimentos.size(); i++) {
            movimentos.set(i, null);
        }
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    
    
}
