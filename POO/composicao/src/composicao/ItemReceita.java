/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author aluno
 */
public class ItemReceita {
    private double dose;
    private int duracao;
    private Remedio remedio;
    
    public ItemReceita(double dose, int duracao, Remedio rem) {
        this.dose = dose;
        this.duracao = duracao;
        this.remedio = rem;
    }

    public double getDose() {
        return dose;
    }

    public int getDuracao() {
        return duracao;
    }

    public Remedio getRemedio() {
        return remedio;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }
    
    
}
