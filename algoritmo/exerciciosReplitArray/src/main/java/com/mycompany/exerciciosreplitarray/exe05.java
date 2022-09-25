/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosreplitarray;

import static com.mycompany.exerciciosreplitarray.exe06.entrada;
import java.util.ArrayList;

/**
 *
 * @author samuel.lucas
 */
public class exe05 {
    public static void main(String[] args) {
        int num = entrada.nextInt();
        ArrayList<Integer> numeros = new ArrayList();
        
        for (int i=0; i<num; i++) {
            numeros.add(entrada.nextInt());
        }
     
        for (int i=1; i<=numeros.size(); i++) {
            if (numeros.get(numeros.size()-i)<0) {
                System.out.println(numeros.get(numeros.size()-i));
            }
        }
    }
}
