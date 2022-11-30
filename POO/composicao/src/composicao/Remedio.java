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
public class Remedio {
    private String nome;
    private String laboratorio;
    private String unidade;

    
    public Remedio(String nome, String laboratorio, String unidade) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.unidade = unidade;
    }
    public String getLaboratorio() {
        return laboratorio;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
                
}
