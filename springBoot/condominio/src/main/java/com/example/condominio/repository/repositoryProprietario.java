package com.example.condominio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.condominio.model.Proprietario;

@Repository
public class RepositoryProprietario {
    
    @Autowired
    JdbcTemplate db;
    
    public void gravar(Proprietario proprietario) {
        db.update("insert into proprietario(nome, telefone) values (?,?)",
        proprietario.getNome(), proprietario.getTelefone());
    }
}
