/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

import java.util.ArrayList;

/**
 *
 * @author samuel.lucas
 */
public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String placa, String marca, String modelo, int ano){
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    
    }

    public static ArrayList<Carro> listCarro = new ArrayList<>();

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void setListCarro(ArrayList<Carro> listCarro) {
        Carro.listCarro = listCarro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public static ArrayList<Carro> getListCarro() {
        return listCarro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
