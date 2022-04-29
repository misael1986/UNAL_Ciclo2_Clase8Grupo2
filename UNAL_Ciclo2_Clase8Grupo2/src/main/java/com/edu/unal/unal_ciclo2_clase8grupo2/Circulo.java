/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase8grupo2;

/**
 *
 * @author Usuario
 */
public class Circulo {
    
    //Atributos
    private String tamano;
    private String color;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    //Metodos
    public void setColor(String color) {
        this.color = color;
    }

    public Circulo(String tamano, String color) {
        this.tamano = tamano;
        this.color = color;
    }
    
    public Circulo(){}
    
}
