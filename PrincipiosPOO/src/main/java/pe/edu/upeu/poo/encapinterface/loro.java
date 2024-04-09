/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.encapinterface;

/**
 *
 * @author Datos
 */
public class loro implements Animal{

    @Override
    public void emitirSonido() {
        System.err.println("Esto es la implementacion ... no te olvides");
    }

    @Override
    public void dormir() {
        System.err.println("zzz....zzz");
    }
    @Override
    public void habla(){
        System.err.println("Hola man no seas flojo pues");
    }
    
}
