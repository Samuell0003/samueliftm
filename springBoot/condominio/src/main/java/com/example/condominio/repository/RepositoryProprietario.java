package com.example.condominio.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public Proprietario all(ResultSet res, int nowNum) throws SQLException {
        Proprietario proprietario = new Proprietario(
                res.getInt("id_proprietario"),
                res.getString("nome"),
                res.getString("telefone"));
        return proprietario;
    }

    public List<Proprietario> selectFull() {
        return db.query("select * from proprietario;", this::all);
    }

    public Proprietario selectId(int cod) {
        System.out.println("///////////////////////////////////////////// "+cod);
        return db.queryForObject("select * from proprietario where id_proprietario= ?;", this::all, cod);
    }

    public void excluirDB(Integer cod) {
        try {
            db.update("delete from proprietario where id_proprietario = ? ", cod);
        } catch (Exception e) {
            db.update("delete from apartamento where id_proprietario = ? ", cod);
            db.update("delete from proprietario where id_proprietario = ? ", cod);
        }
    }
}
