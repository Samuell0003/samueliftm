/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Consulta {
    private String nomeAnimal;
    private String observacao;
    private String queixa;
    private String historico;
    private ArrayList<ItemReceita> receita;

    public Consulta(String nomeAnimal, String observacao, String queixa, String historico) {
        this.nomeAnimal = nomeAnimal;
        this.observacao = observacao;
        this.queixa = queixa;
        this.historico = historico;
        this.receita = new ArrayList<>();
    }

    public void setReceita(double dose, int duracao, Remedio rem) {
        this.receita.add(new ItemReceita(dose, duracao, rem));
    }

    public ArrayList<ItemReceita> getReceita() {
        return receita;
    }

    
    
    
    
    
}
