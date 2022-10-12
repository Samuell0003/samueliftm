/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1110;

/**
 *
 * @author samuel.lucas
 */
public class Triangulo {
    private int a,b,c;
    
    public Triangulo(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public String tipoTriangulo() {
        if (a==b && b==c) {
            return "equilátero";
        } else if (a!=b && b!=c && c!=a) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    
}
