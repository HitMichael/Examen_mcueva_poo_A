package ec.edu.intsuperior.modelo;

public class Empleado {
//@By Michael de la Cueva.

    private double sueldo;
    
    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
