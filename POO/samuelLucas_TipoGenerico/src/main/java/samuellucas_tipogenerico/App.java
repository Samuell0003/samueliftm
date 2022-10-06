/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package samuellucas_tipogenerico;

import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vetor<Cidade> cd = new Vetor(2);
        Vetor<Pessoa> ps = new Vetor(2);
        
        for (int i = 0; i < ps.getNum(); i++) {
            
            System.out.println("Informe seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Informe seu sexo");
            String sexo = entrada.next();
            System.out.println("Informe sua naturalidade");
            String naturalidade = entrada.next();
            
            ps.setVet(new Pessoa(nome, sexo, naturalidade), i);
            entrada.nextLine();
        }
        
        for (int i = 0; i < cd.getNum(); i++) {
            
            System.out.println("Informe o nome da cidade: ");
            String nome = entrada.nextLine();
            System.out.println("Informe o adjetivo");
            String adj = entrada.next();
            System.out.println("Informe Estado");
            String est = entrada.next();
            
            cd.setVet(new Cidade(nome, adj, est), i);
            entrada.nextLine();
        }
        
        //int op=0;
        boolean op =false;
        do {
            System.out.println("Informe um nome: ");
            String proc = entrada.nextLine();
            for (int i = 0; i < ps.getNum(); i++) {
                if (proc.toUpperCase().equals(ps.getVet(i).getNome().toUpperCase())) {
                    for (int j = 0; j < cd.getNum(); j++) {
                        if (ps.getVet(i).getNaturalidade().toUpperCase().equals(cd.getVet(j).getNome().toUpperCase())) {
                            if (ps.getVet(i).getSexo().toUpperCase().charAt(0)=='M') {
                                System.out.println("O "+cd.getVet(j).getAdjetivo()+" "+ps.getVet(i).getNome()+" nasceu em "+cd.getVet(j).getNome()+" - "+cd.getVet(j).getEstado());
                            } else if (ps.getVet(i).getSexo().toUpperCase().charAt(0)=='F'){
                                System.out.println("A "+cd.getVet(j).getAdjetivo()+" "+ps.getVet(i).getNome()+" nasceu em "+cd.getVet(j).getNome()+" - "+cd.getVet(j).getEstado());
                            }
                            
                            op = true;
                            break;
                        } 
                    }
                    if (op==false) {
                        System.out.println(ps.getVet(i).getNome()+" nasceu em "+ps.getVet(i).getNaturalidade());
                        op = true;
                    }
                    
                }
            }
            if (op==false) {
                System.out.println(proc+" nasceu em cidade cidade desconhecida.");
            }
            
            System.out.println("/////////");
            System.out.println("2 - Sair");
            int num = entrada.nextInt();
            if (num==2) {
                break;
            }
            
            op =false;
            
        } while (true);
        
    }
    
    
}
