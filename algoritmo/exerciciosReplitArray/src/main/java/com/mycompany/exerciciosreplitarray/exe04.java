/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosreplitarray;

import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class exe04 {
    
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        
        
        do {
            op = imprimeMenu();
            if (op==1) {
                inserirContato();
            } else if (op==2){
                listarContato();
            } else if (op!=3) {
                System.out.println("Opcao incorreta!");
            }
        } while(op!=3);
        
        
    }
	
	
    public static int imprimeMenu(){
        System.out.println("1 - Inserir Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Sair");
        return entrada.nextInt();
    }

    public static void inserirContato(){
        ContatoExe04 contatoExe04 = new ContatoExe04();
        
        entrada.nextLine();
        System.out.println("Informe seu nome:");
        contatoExe04.setNome(entrada.nextLine());
        System.out.println("Informe seu telefone:");
        contatoExe04.setTelefone(entrada.nextLine());
        System.out.println("Informe seu celular:");
        contatoExe04.setCelular(entrada.nextLine());
        System.out.println("Informe seu email:");
        contatoExe04.setEmail(entrada.next());
        
        
        ContatoExe04.contato.add(contatoExe04);
        
        
    }

    public static void listarContato(){
        for (int i=0; i < ContatoExe04.contato.size(); i++) {
            System.out.println(i+1);
            System.out.println("Nome: "+ContatoExe04.contato.get(i).getNome());
            System.out.println("Telefone: "+ContatoExe04.contato.get(i).getTelefone());
            System.out.println("Celular: "+ContatoExe04.contato.get(i).getCelular());
            System.out.println("Email: "+ContatoExe04.contato.get(i).getEmail());
            
        }
    }
}
