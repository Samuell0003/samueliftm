/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula1110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer> vet = ler();
        
        if (ValidaTriangulo.verifica(vet.get(0), vet.get(1), vet.get(2))) {
            Triangulo tg = new Triangulo(vet.get(0), vet.get(1), vet.get(2));
            exibe(vet.get(0), vet.get(1), vet.get(2));
        } else {
            System.out.println("Não é triangulo");
        }
    }
    
    public static ArrayList<Integer> ler() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Lado 1:");
        int a = entrada.nextInt();
        System.out.println("Lado 2:");
        int b = entrada.nextInt();
        System.out.println("Lado 3:");
        int c = entrada.nextInt();
        
        ArrayList<Integer> vet = new ArrayList(Arrays.asList(a,b,c));
        
        return vet;
    }
    
    public static void exibe(int a, int b, int c) {
        Triangulo tg = new Triangulo(a, b, c);
        System.out.println(tg.tipoTriangulo());
    }
}
