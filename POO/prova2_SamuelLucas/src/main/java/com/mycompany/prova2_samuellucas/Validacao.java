/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2_samuellucas;

import java.util.ArrayList;

/**
 *
 * @author samuel.lucas
 */
public class Validacao extends Exception {
    public Validacao(String text) {
        super(text);
    }
    
    public Validacao(String login, String senha) {
        super("Usuario: "+login+" ou senha: "+senha+" incorreta");
    }
}
