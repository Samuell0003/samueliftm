public class Pessoa {
    private String nome;
    private Universidade universidade;
    private Departamento departamento;
    public  Pessoa() {

    }

    public Pessoa(String nome, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
