/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.arrayx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Datos
 */
public class ArrayExample {

    static List<Persona> personas=new ArrayList<>();

    public static void main(String[] args) {
        Persona p=new Persona();
        p.setDni("75493213");
        p.setNombre("Maiky");
        p.setApellido("Quispe");
        p.setEdad(17);
        personas.add(p);
        p=new Persona();
        p.setDni("78415245");
        p.setNombre("Raul");
        p.setApellido("Condorcanqui");
        p.setEdad(70);
        personas.add(p);
        mostrarPersonas();
    }
    
    static void mostrarPersonas() {
        System.out.println("Lista de Personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + "Apellido" + persona.getApellido() ", DNI: " + persona.getDni() + ", Edad: " + persona.getEdad());
        }
    
        
        
    }

}
