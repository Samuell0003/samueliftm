package com.example.condominio.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proprietario {
    private int id_proprietario;
    @NotEmpty
    private String nome;
    @NotEmpty
    @Size(min = 9, max = 11, message = "informe o telefone com apenas dígitos, com o tamanho entre 9 e 11 dígitos")
    private String telefone;



}
