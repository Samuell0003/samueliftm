/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevador;

/**
 *
 * @author samuel.lucas
 */
public class Elevador {
    private int capacidadeTotal;
    private int totalAndares;
    private int andar=0;
    private int capacidade=0;
    
    public Elevador(int capacidadeTotal, int totalAndares) {
        this.capacidadeTotal = capacidadeTotal;
        this.totalAndares = totalAndares;
    }
    
    public void entrar() {
        if (capacidade<capacidadeTotal) {
            capacidade++;
            
        } else {
            System.out.println("Limite maximo atingido");
        }
        
    }
    
    public void subir() {
        if (andar<totalAndares) {
            andar++;
        } else {
            System.out.println("Andar maximo atingido");
        }
    }
    
    public void sair() {
        if (capacidade>=1) {
            capacidade--;
        } else {
            System.out.println("Nenhum pessoa no elevador");
        }
    }
    
    public void descer() {
        if (andar>=1) {
            andar--;
        } else {
            System.out.println("Elevador já está no térreo");
        }
    }
    
    public void exibir() {
        System.out.println("Total de Andares = "+totalAndares);
        System.out.println("Capacidade do Elevador = "+capacidadeTotal);
        System.out.println("Lotação do Elevador = "+capacidade);
        System.out.println("Andar atual do Elevador = "+ andar);
    }
}
