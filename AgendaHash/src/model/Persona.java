package model;

public class Persona {

    private String nombre, apellido, DNI;

public Persona(){};

public Persona(String apellido, String DNI, String nombre) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombre = nombre;
    }

public void mostrarDatos(){
    System.out.println("nombre = " + nombre);
    System.out.println("apellido = " + apellido);
    System.out.println("DNI = " + DNI);

}





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}

