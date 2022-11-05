package com.example.condominio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proprietario {
    private int id_proprietario;
    private String nome;
    private String telefone;
}
