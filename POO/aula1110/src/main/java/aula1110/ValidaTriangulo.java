/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1110;

/**
 *
 * @author samuel.lucas
 */
public class ValidaTriangulo {
    public static boolean verifica(int a, int b, int c) {
        if (((a+b)>c && (b+c)>a && (a+c)>b) && a>0 && b>0 && c>0) {
            return true;
        } 
        return false;
    }
}
