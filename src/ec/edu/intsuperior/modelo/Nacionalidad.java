package ec.edu.intsuperior.modelo;

public class Nacionalidad {
  
    public static void main(String[] args) {
           
    }
    private String pais;

    public Nacionalidad() {
    }

    public Nacionalidad(String nacionalidad) {
        this.pais = nacionalidad;
    }

    public String getNacionalidad() {
        return pais;
    }

    public void setNacionalidad(String nacionalidad) {
        this.pais = nacionalidad;
    }

}