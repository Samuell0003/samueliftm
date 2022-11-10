package com.example.condominio.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.condominio.model.Apartamento;

@Repository
public class RepositoryApartamento {

    @Autowired
    JdbcTemplate db;
    
    RepositoryProprietario proprietario;

    public void gravarApto(Apartamento apto) {
        db.update("insert into apartamento (numPortas, qtdQuartos, tipo, id_proprietario) values (?, ?, ?, ?);",
        apto.getNumPortas(), apto.getQtdQuartos(), apto.getTipo(), apto.getProprietario().getId_proprietario());
    }

    public List<Apartamento> aptos() {
        List<Apartamento> lista = db.query("select * from apartamento;", 
        (res, nowNum) -> {
            Apartamento ap = new Apartamento(
                res.getInt("id_ap"),
                res.getInt("numPortas"),
                res.getInt("qtdQuartos"),
                res.getString("tipo"),
                proprietario.selectId(res.getInt("id_proprietario")));
            return ap;
        });
        return lista;
    }

    public void excluirBD(Integer cod) {
        db.update("delete from apartamento where id_ap = ?", cod);
    }
   
}
