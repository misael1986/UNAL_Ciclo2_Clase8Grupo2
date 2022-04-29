/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.edu.unal.unal_ciclo2_clase8grupo2.Perro;

/**
 *
 * @author Usuario
 */
public class OtroMainNoMain {
    
    Perro salchichon;
    
    public void noMain(){
    salchichon= new Perro();
    salchichon.setEdad(3);
    salchichon.nombre="Salchichon";

    }
    
    public void pasearPerro(){
        System.out.println("Saque a pasear a "+salchichon.nombre
                +" porque tiene "+salchichon.getEdad()+" años y debe hacer ejercicio");
    }
    
    public void pasearPerroOp(Perro p){
        System.out.println("Saque a pasear a "+p.nombre
                +" porque tiene "+p.getEdad()+" años y debe hacer ejercicio");
    }
    
}
