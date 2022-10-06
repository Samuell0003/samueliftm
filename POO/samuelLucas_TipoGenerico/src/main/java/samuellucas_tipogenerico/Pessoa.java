/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuellucas_tipogenerico;

/**
 *
 * @author samuel.lucas
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private String naturalidade;
    
    public Pessoa(String nome, String sexo, String naturalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
    }
    
    

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
