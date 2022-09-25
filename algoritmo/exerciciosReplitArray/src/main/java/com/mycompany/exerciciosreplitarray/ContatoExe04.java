/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosreplitarray;

import java.util.ArrayList;

/**
 *
 * @author samuel.lucas
 */
public class ContatoExe04 {
    private String nome;
    private String telefone;
    private String celular;
    private String email;
    
    public static ArrayList<ContatoExe04> contato = new ArrayList();
    
    public ContatoExe04(String nome, String tel, String cel, String email) {
        setNome(nome);
        setTelefone(tel);
        setCelular(cel);
        setEmail(email);
    }
    
    public ContatoExe04() {
        
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    
}
