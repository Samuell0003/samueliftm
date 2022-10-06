/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuellucas_tipogenerico;

/**
 *
 * @author samuel.lucas
 */
public class Cidade {
    private String nome;
    private String adjetivo;
    private String estado;
    
    public Cidade(String nome, String adjetivo, String estado) {
        this.nome = nome;
        this.adjetivo = adjetivo;
        this.estado = estado;
    }
    
    
    public void setAdjetivo(String adjetivo) {
        this.adjetivo = adjetivo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdjetivo() {
        return adjetivo;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }
}
