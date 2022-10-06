/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuellucas_tipogenerico;

/**
 *
 * @author samuel.lucas
 */
public class Vetor<T> {
    private Object[] vet;
    private int num;
    
    public Vetor(int num) {
        vet = new Object[num];
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    public T getVet(int num) {
        return (T) vet[num];
    }
    
    public void setVet(T v, int num) {
        vet[num] = v;
    }
}
