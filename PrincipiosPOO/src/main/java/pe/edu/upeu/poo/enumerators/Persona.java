
package pe.edu.upeu.poo.enumerators;

enum GENEROD {
    Femenino, Masculino 
}    
enum ESTADO_CIVIL {soltero,Casado,Divorsiado,Viudo}

public class Persona {
    String nombre;
    String DNI;
    String genero=GENEROD.Femenino.name();
    String estadoc;
    
    
    public static void main(String[] args) {
        Persona p=new Persona();
        System.err.println("Genero:"+p.genero);
        for(ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
            System.err.println("EC:"+ec);}
        
       
    }
    
    
}
