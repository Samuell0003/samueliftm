package sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sistema.model.Contato;
import sistema.model.Professor;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    JdbcTemplate db;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/contatos")
    public String contatos(Model model) {
        List<Contato> listaDeContatos = db.query(
                "select * from contatos",
                (res, rowNum) -> {
                    Contato contato = new Contato(
                            res.getInt("id"),
                            res.getString("nome"),
                            res.getString("telefone"),
                            res.getString("endereco"));
                    return contato;
                });
        model.addAttribute("contatos", listaDeContatos);
        return "contato";
    }

    @GetMapping("novo")
    public String exibeForm(Model model) {
        model.addAttribute("contato", new Contato());
        return "formulario";
    }

    @PostMapping("novo")
    public String gravaDados(Contato contato) {
        System.out.println("-----------------------");
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());

        db.update("insert into contatos(endereco, telefone, nome) values (?, ?, ?)",
                contato.getEndereco(), contato.getTelefone(), contato.getNome());
        return "home";
    }

    @GetMapping("prof")
    public String mostrarProf(Model model) {
        List<Professor> listaProfessor = db.query(
                "select * from professor",
                (res, rowNum) -> {
                    Professor professor = new Professor(
                    res.getInt("id"),
                    res.getString("nome"));
                    return professor;
                });
        model.addAttribute("professores", listaProfessor);
        return "professor";
    }

    @GetMapping("novoProf")
    public String exibeFormProf(Model model) {
        model.addAttribute("prof", new Professor());
        return "formProf";
    }

    @PostMapping("novoProf")
    public String gravaDadosProfessor(Professor prof) {
        System.out.println(prof.getNome());
        db.update("insert into professor(nome) values (?)",
                prof.getNome());
        return "home";
    }

}
