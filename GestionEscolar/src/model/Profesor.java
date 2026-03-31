package model;

public class Profesor {


    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+0.1);


    }

    public double  calcularMedia(Alumno alumno){
        double media = alumno.getAsignatura1()



    }






}






