import jdk.security.jarsigner.JarSigner;
import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Main {
    public static void main(String[] args) {


        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura marcas = new Asignatura(3);

        Alumno borja = new Alumno(1, 2, 3);
        Alumno celia = new Alumno(programacion, sistemas, marcas);

        Alumno claudia = new Alumno(programacion, sistemas, marcas);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(claudia);


    }

}