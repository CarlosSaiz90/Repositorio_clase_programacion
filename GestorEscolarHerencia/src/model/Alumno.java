package model;

public class Alumno extends Persona {

    private int numeroMatricula;
    private String curso;

    @Override
    public void saludar() {
        System.out.println("soy alumno y voy a aprender un monton");

    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("numeroMatricula = " + numeroMatricula);
        System.out.println("curso = " + curso);


    }

    public Alumno(String nombre, String apellido, int numeroMatricula, String curso) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }

    public void realizarExamen(){
       System.out.println("vamos a realizar el examen");
       int nota = (int)(Math.random()*11);
        System.out.println("La nota del examen ha sido "+nota);
   }


    public Alumno(String nombre, String apellido, int numeroMatricula) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;

    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



























}
