package com.example.condominio.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.condominio.model.Apartamento;
import com.example.condominio.model.Proprietario;

@Repository
public class RepositoryApartamento {

    @Autowired
    JdbcTemplate db;
    
    public void gravarApto(Apartamento apto) {
        db.update("insert into apartamento (numPortas, qtdQuartos, tipo, id_proprietario) values (?, ?, ?, ?);",
        apto.getNumPortas(), apto.getQtdQuartos(), apto.getTipo(), apto.getProprietario().getId_proprietario());
    }

    public List<Apartamento> aptos() {
        List<Apartamento> lista = db.query("select a.id_ap as id, a.numPortas as numPortas, a.qtdQuartos as qtdQuartos, a.tipo as tipo, p.id_proprietario as id_proprietario, p.nome as nome, p.telefone as telefone from apartamento a join proprietario p on a.id_proprietario=p.id_proprietario;", 
        (res, nowNum) -> {
            Apartamento ap = new Apartamento(
                res.getInt("id"),
                res.getInt("numPortas"),
                res.getInt("qtdQuartos"),
                res.getString("tipo"),
                new Proprietario(res.getInt("id_proprietario"), res.getString("nome"), res.getString("telefone")));
            return ap;
        });
        return lista;
    }

    public void excluirBD(Integer cod) {
        db.update("delete from apartamento where id_ap = ?", cod);
    }
   
}
