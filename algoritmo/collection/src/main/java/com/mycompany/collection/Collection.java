/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author samuel.lucas
 */
public class Collection {

    static Scanner entrada = new Scanner(System.in);
    public static HashMap<String, Carro> placaCarro = new HashMap<>();
    public static HashMap<Integer, ArrayList<Carro>> anoCarro = new HashMap<>();
    public static HashSet<String> listMarca = new HashSet<>();

    public static void main(String[] args) {
        cadastrar();
        int op;

        do {
            op = menu();
            if (op == 1) {
                mostrarDados(Carro.listCarro, true);
            } else if (op == 2) {
                Carro carro = placaCarro.get(entrada.next());
                ArrayList<Carro> let = new ArrayList<>();
                let.add(carro);
                mostrarDados( let, true);
            } else if (op == 3) {
                ArrayList<Carro> let = anoCarro.get(entrada.nextInt());
                mostrarDados(let, false);
                
            } else if (op == 4) {
                System.out.println(listMarca);
            } else if (op==5) {
                cadastrar();
            } else {
                System.out.println("Digite uma opção valida");
            }
        } while (op != 6);

    }

    public static void cadastrar() {
        do {
            String placa = entrada.next();
            String marca = entrada.next();
            String modelo = entrada.next();
            int ano = entrada.nextInt();
            Carro carro = new Carro(placa, marca, modelo, ano);
            Carro.listCarro.add(carro);
            placaCarro.put(placa, carro);
            if (!anoCarro.containsKey(ano)) {
                anoCarro.put(ano, new ArrayList<>());
            }
            anoCarro.get(ano).add(carro);
            listMarca.add(marca);
            System.out.println("Deseja cadastrar mais um carro?");
            System.out.println("Digite 1 para parar.");
        } while (entrada.nextInt() != 1);
    }

    public static int menu() {
        System.out.println("1 - Listar todos os Carros");  //(Utilize uma Collection)
        System.out.println("2 - Consultar um carro pela placa"); // (Utilize um HashMap)
        System.out.println("3 - Consultar vários carros pelo ano "); //(Utilize um HashMap)
        System.out.println("4 - Listar as marcas de carros que foram cadastradas"); // (Utilize um HashSet)
        System.out.println("5 - Cadastrar mais carros");
        System.out.println("6 - Sair");

        return entrada.nextInt();
    }

    public static void mostrarDados( ArrayList<Carro> carro, boolean op) {
        for (int i=0; i<carro.size(); i++) {
            if (op) {
                System.out.println(carro.get(i).getAno());
            }

            System.out.println(carro.get(i).getPlaca());
            System.out.println(carro.get(i).getMarca());
            System.out.println(carro.get(i).getModelo());
            System.out.println("");
        }

    }
}

