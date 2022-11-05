package com.example.condominio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartamento {
    private int id_ap;
    private int numPortas;
    private int qtdQuartos;
    private String tipo;
    private Proprietario proprietario;
}
