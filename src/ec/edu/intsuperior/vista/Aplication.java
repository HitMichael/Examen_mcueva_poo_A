package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Nacionalidad;
import ec.edu.intsuperior.modelo.Persona;


public class Aplication {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("Alejandra Jasleidy", "15");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("0998729305");
        Nacionalidad n1 = new Nacionalidad();
        Nacionalidad n2 = new Nacionalidad ("Ecuatoriana");  
        
        
        System.out.println("El cliente: " + p2.getNombre());
        System.out.println("De: " + p2.getEdad() + " Años de Edad");
        System.out.println("Con el número de telefono: " + c2.getTelefono());
        System.out.println("Nacionalidad: " + n2.getNacionalidad());
    }

}
