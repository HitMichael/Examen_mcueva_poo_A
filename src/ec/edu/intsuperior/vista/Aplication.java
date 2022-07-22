package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cedula;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Nacionalidad;
import ec.edu.intsuperior.modelo.Persona;

public class Aplication {
//@By Michael de la Cueva.

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("*Alejandra Jasleidy*", "*15");
        Cedula ci1 = new Cedula();
        Cedula ci2 = new Cedula("*1727712778*");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("*0998729305*");
        Nacionalidad n1 = new Nacionalidad();
        Nacionalidad n2 = new Nacionalidad("*Ecuatoriana*");

        System.out.println("*HOLA_BIENVENIDO*");

        System.out.println("Un gusto:  " + p2.getNombre());
        System.out.println("Con CI:  " + ci2.getIdentidad());
        System.out.println("Cuentas con: " + p2.getEdad() + " Años de Edad*");
        System.out.println("y dicho número de telefono:  " + c2.getTelefono());
        System.out.println("De nacionalidad:  " + n2.getNacionalidad());
    }

}
