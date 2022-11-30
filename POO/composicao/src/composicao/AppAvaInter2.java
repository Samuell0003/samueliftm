/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AppAvaInter2 {

    /**
     * @param args the command line arguments
     */
    static HashMap<String, String> medidas = new HashMap<>();
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Remedio> listRemedio = new ArrayList<>();

    public static void main(String[] args) {

        addMedidas();
        addRemedio();
        addRemedioByConsulta(readConsulta());

    }
    public static void addRemedioByConsulta(Consulta consulta) {
        do {
            for (int i = 0; i < listRemedio.size(); i++) {
                System.out.println(i + 1 + " " + listRemedio.get(i).getNome() + " - " + listRemedio.get(i).getLaboratorio());
            }
            System.out.println("Informe um remedio:");
            int op = entrada.nextInt();

            System.out.println("Dose:");
            double dose = entrada.nextDouble();
            System.out.println("Duracao:");
            int duracao = entrada.nextInt();
            consulta.setReceita(dose, duracao, listRemedio.get(op-1));
            System.out.println("1 - Parar de cadastrar:");
            if (entrada.nextInt() == 1) {
                break;
            }
        } while (true);
        display(consulta);
    }
    public static Consulta readConsulta() {
        System.out.println("Nome animal:");
        String nomeAnimal = entrada.next();
        System.out.println("Observacoes:");
        String observacoes = entrada.next();
        System.out.println("Queixa:");
        String queixa = entrada.next();
        System.out.println("Historico:");
        String historico = entrada.next();

        return new Consulta(nomeAnimal, observacoes, queixa, historico);
    }

    public static void addMedidas() {
        medidas.put("ml", "mililitro");
        medidas.put("cp", "comprimido");
        medidas.put("gr", "grama");
        medidas.put("un","unidade");
    }

    public static void addRemedio() {
        do {
            System.out.println("Nome do remedio:");
            String nome = entrada.next();
            System.out.println("Nome do laboratorio:");
            String laboratorio = entrada.next();
            System.out.println("Unidade de medida:");
            String unidade = entrada.next();
            try {
                if (unidade.length() != 2) {
                    throw new Exception(" 2 caracteras");
                }
                listRemedio.add(new Remedio(nome, laboratorio, unidade));
                System.out.println("1 - Parar cadastro");
                if (entrada.nextInt()==1) {
                    break;
                }

            } catch (Exception ex) {
                System.err.println("Erro");
            }
        } while (true);
    }

    public static void display(Consulta consulta) {
        for (ItemReceita receit : consulta.getReceita()) {
            System.out.println(receit.getRemedio().getNome()+" - "+receit.getRemedio().getLaboratorio()+" - "+receit.getDose()+" "+medidas.get(receit.getRemedio().getUnidade())+" - "+receit.getDuracao()+" dias");
        }
    }
}
