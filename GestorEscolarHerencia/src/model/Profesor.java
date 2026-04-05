package model;

public class Profesor extends Persona{

private int salario, nExperiencia;

public Profesor (){}

    @Override
    public void saludar() {
        System.out.println("vamos a saludar, soy un profesor");

    }


    public void corregirExamen(){
    System.out.println("vamos a corregir");
}
    public Profesor(int salario, int nExperiencia) {
        this.salario = salario;
        this.nExperiencia = nExperiencia;
    }

    public Profesor(String nombre, String apellido, int salario, int nExperiencia) {
        super(nombre, apellido);
        this.salario = salario;
        this.nExperiencia = nExperiencia;
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("salario = " + salario);
        System.out.println("salario = " + nExperiencia);


    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getnExperiencia() {
        return nExperiencia;
    }

    public void setnExperiencia(int nExperiencia) {
        this.nExperiencia = nExperiencia;
    }
}
