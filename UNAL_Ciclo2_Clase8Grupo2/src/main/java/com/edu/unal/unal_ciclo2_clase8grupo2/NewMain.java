/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase8grupo2;

import java.util.Scanner;
import newpackage.OtroMainNoMain;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo CAzulMed= new Circulo();//Creando una instancia de clase Circulo= Objeto
        CAzulMed.setColor("Azul");
        CAzulMed.setTamano("Mediano");
        
        Perro max= new Perro();
        max.setNombre("Wolffie");
        max.setEdad(2);
        max.setPedigri(true);
        max.setRaza("Pastor Aleman");
        
        Perro rocky=new Perro("Rocky");
        
        Perro filulais= new Perro();
        Scanner te=new Scanner (System.in);
        System.out.println("Digite nombre de nuevo perro:");
        filulais.setNombre(te.nextLine());
        filulais.setEdad(te.nextInt());
        
        System.out.println("NOmbre:"+filulais.getNombre()
                            +"\nEdad: "+filulais.getEdad());
        System.out.println("NOmbre:"+max.getNombre()
                            +"\nEdad: "+max.getEdad());
        System.out.println("NOmbre:"+rocky.getNombre()
                            +"\nEdad: "+rocky.getEdad());
        rocky.saludar();
        
        Perro lazzie= new Perro();
        lazzie.setNombre("Lazzie");
        lazzie.setEdad(15);
        
        OtroMainNoMain otro= new OtroMainNoMain();
        
        otro.noMain();
        otro.pasearPerro();
        
        otro.pasearPerroOp(lazzie);
        
        filulais.quienEsMayor(lazzie);
 
        
        
    }
    
 
}

