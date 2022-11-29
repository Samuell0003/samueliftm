import java.lang.reflect.Array;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamento;
    public Universidade() {

    }

    public Universidade(String nome, ArrayList<Departamento> departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(ArrayList<Departamento> departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Departamento> getDepartamento() {
            return departamento;
    }
}
