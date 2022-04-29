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
public class Perro {

    public String nombre;
    protected String raza;
    private int edad;
    private boolean pedigri;
    private char genero;

    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;

    }
    // Metodos

    public void ladrar() {
        System.out.println("Guau guau");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es" + this.nombre);
    }

    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad) {
            System.out.println("Soy mayor que" + otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            System.out.println("Tenemos la misma edad");
        } else {
            System.out.println(otroPerro.nombre + " es mayor que yo");
        }
    }

    public void setNombre(String nombre) {//set --> poner o asignar
        this.nombre = nombre;
    }

    public String getNombre() {//set --> poner o asignar
        return this.nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the pedigri
     */
    public boolean isPedigri() {
        return pedigri;
    }

    /**
     * @param pedigri the pedigri to set
     */
    public void setPedigri(boolean pedigri) {
        this.pedigri = pedigri;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

}
