public class App {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Albert Einstein", new Universidade("Cambridge", new Departamento()));
        Pessoa pessoa2 = new Pessoa("Isaac Newton", new Universidade("Princeton"));
        Universidade uni = new Universidade();
        uni.setDepartamento(new Departamento("akdckd", uni));
        System.out.println(pessoa1.getNome()+" "+pessoa1.getUniversidade().getNome());
        System.out.println(pessoa2.getNome()+" "+pessoa2.getUniversidade().getNome());
    }
}